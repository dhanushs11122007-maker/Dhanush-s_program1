import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = "Chennai";
        int age = scan.nextInt();
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("Iam "+ age +" years old");
        System.out.println("my name is "+ name);
        System.out.print("our city is "+ city +"\n");
        System.out.println("mine");

        if(age>17)
        {
            System.out.println("you're minor");
        }
        else{
            System.out.println("major");
        }

        int i=0,sum=0;
        System.out.println("The values of i are");

        for(i=1;i<11;i++)
        {
            System.out.println(i);
        }
        System.out.println("\n");

        for(i=1;i<11;i++)
        {
            sum=sum+i;
        }
        System.out.println("The Sum is " + sum);
        System.out.println("Thus the program ends");
    }
}