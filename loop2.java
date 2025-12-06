import java.util.Random;
import java.util.Scanner;

public class loop2 {

    static int agecheck(int age)
    {
        System.out.println("Age must be postive");
        
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        
        System.out.printf("Enter the age:%d\n",age);

        while(age>0)
        {
        if(age>=18)
        {
            System.out.println("You are eligible to open a bank account");
            break;
        }
        else
        {
            System.out.println("You can open a minor account");
            break;
        }
            
        }

        if(age<0 || age==0){
        System.out.println("You entered an invalid age " + age);
        }
        return 0;
    }

    public static void main(String[] args){

            int age;
            System.out.println(agecheck(12));
        
        }
    
}