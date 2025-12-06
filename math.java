import java.util.Random;

public class math{

    public static void main(String[] args){

        Random ram = new Random();
        int radius = ram.nextInt(3,6);
        double circumference;
        double area;

        
        System.out.printf("We are going to find the Area and Circumference of the circle for the given radius %dcm" , radius);
        System.out.println("\n");
        System.out.println("Radius is " + radius +"cm");

        area = Math.PI*Math.pow(radius,2);
        circumference = 2*Math.PI*radius;
        

        System.out.printf("The area of the given circle is %.2fsq.cm\n",area);
        System.out.printf("The circumference of the circle is %.1fcm\n",circumference);



    }


}