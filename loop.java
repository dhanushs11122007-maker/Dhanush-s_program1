import java.util.Random;
public class loop {

    public static void main(String[] args){

        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println("Now the value of i is "+i);
        }
        System.out.println("\n");

        int count=1;
        int sum=0;
        while(count<=10){
            sum=sum+count;
            count++;
        }

        System.out.println("The sum of the number is "+sum);
        System.out.println("\n");

        if(sum == 55)
        {
            System.out.println("Your answer is right");
        }
        else {
            System.out.println("Your answer is wrong");
        }
        Random ram = new Random();
        boolean check = ram.nextBoolean();

        if(check == true)
        {
            System.out.println("positive answer");
        }
        else{
            System.out.println("negative answer");
        }
    }
}

