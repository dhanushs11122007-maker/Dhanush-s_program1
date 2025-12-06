import java.util.Random;
import java.util.Scanner;

public class strdouble {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str);

        Random ram = new Random();
        double num = ram.nextDouble(-5,6);

        System.out.println(num);
        

        if(num>0)
        {
            System.out.println("num is positive");
        }
        else if(num==0){
            System.out.println("num is neutral(zero)");
        }
        else{
            System.out.println("num is negative");
        }

        if(str.isEmpty())
        {
            System.out.println("no string created");
        }
        else{
            System.out.println("created string is "+str);
        }

        int i;
        for(i=1;i<11;i++)
        {
            if (i == 5) {
                continue;
            }
            else if(i==8){
            System.out.println("Numbers between 8 except 5 are "+i);
            break;
            }
            else {
            System.out.println("the values of i except 5 "+i);
        }

        }

    }
}
