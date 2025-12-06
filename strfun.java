import java.util.Scanner;

public class strfun{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("The given string is " + name);

        int len = name.length();
        System.out.println("The length of the string is " + len);

        String upper = name.toUpperCase();
        System.out.println("The given string in uppercase is " + upper);

        String lower = name.toLowerCase();
        System.out.println("The given string in lowercase is " + lower);

        if(name.isEmpty())
        {
            System.out.println("no string provided");
        }
        else if(name.contains(" "))
        {
            System.out.println("The given string contains a space");
        }
        else if(name.equals("Greatness"))
        {
            System.out.println("Both the strings are matched");
        }
        else{
            System.out.println("No conditions matched");
        }

        String replace = name.replace("e","i");
        System.out.println("Now the string after replacement is " + replace);

        String email = scan.nextLine();
        System.out.println("The given email is "+ email);

        String username = email.substring(0,email.indexOf("@"));
        System.out.println("The username of the given email is "+ username);

        String domain = email.substring(email.indexOf("@")+1);
        System.out.println("The domain of the given email is "+ domain);

        if(email.contains("@"))
        {
           System.out.println("This must be an email"); 
        }
        else{
            System.out.println("This is not an email");
        }



    }
}