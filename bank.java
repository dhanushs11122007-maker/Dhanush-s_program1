import java.util.Scanner;

public class bank {

    static double balance = 1000.50;
    static Scanner scan = new Scanner(System.in);
    static boolean checkbalance;
    static double amount = 0;
    static int choice;

    public static void main(String[] args) {

        String Choice = Choice();
    }

    static String Choice() {

        System.out.println("Enter your choice...");
        System.out.println("1.BALANCE \n" + "2.DEPOSIT \n" + "3.WITHDRAW \n" + "4.EXIT \n");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> Balance(1,0);
            case 2 -> Deposit();
            case 3 -> Withdraw();
            case 4 -> Exit();
            default -> System.out.println("Enter within the given choice!");
        } ;

        return "*";

    }

    static String Balance(int choice,double amount){
        if(choice == 1 || choice == 2) {
            balance = balance + amount;
            System.out.println("Your Account balance is Rs." + balance);
            Exit();
        }
        else if(choice == 3) {
            balance = balance - amount;
            System.out.println("Your Account balance is Rs." + balance);
            Exit();
        }
        else
        {
            System.out.println("Invalid choice");
        }
        return "*";
    }

    static String Deposit(){

        choice = 2;
        System.out.print("The amount you're going to deposit is Rs.");
        double amount = scan.nextDouble();
        System.out.printf("Your amount Rs.%.2f is successfully deposited!\n",amount);

        Checkbalance(amount);

        return "*";
    }

    static String Withdraw() {

        choice = 3;
        System.out.print("Enter the amount to be withdraw :");
        double amount = scan.nextDouble();
        System.out.print("\n");

        if (amount > balance)
        {
            System.out.println("Inadequate funds");
            System.out.println("*********************************");
            System.out.println("\n");
            Choice();
        }
        else if (amount < 0) {
            System.out.printf("Amount(Rs.%.2f) can't be negative", amount);
            System.out.println("*********************************");
            System.out.println("\n");
            Choice();
        }
        else {
            System.out.printf("Your amount Rs.%.2f is Withdrawn\n",amount);
            System.out.println("*******************************");
            Checkbalance(amount);
        }

        return "*";

    }

       static String Checkbalance(double amount) {

               System.out.println("Enter (true/false) to check your account balance : ");
               checkbalance = scan.nextBoolean();
               if (checkbalance) {
                   Balance(choice,amount);
               }
               else {
                   System.out.println("Thank you for your visit");
                   System.out.println("************************");
               }
           return "*";
           
       }

       static String Exit() {

            System.out.println("Are you want to exit(true/false) : ");
            boolean exit = scan.nextBoolean();
            
            if(exit)
            {
                System.out.println("Thank you!!!");
                System.out.println("*************");
            }
            else {
                Choice();
            }

            return "*";
    }

}
