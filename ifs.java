import java.util.Scanner;

public class ifs{

    static String Days()
    {
        String day;
        Scanner scan = new Scanner(System.in);
        day = scan.nextLine().toUpperCase();
        return day;
    }

    public static void main(String[] args){

        // METHOD 1 IF ELSE

        String day = Days();


        if(day.contains("MONDAY"))
        {
            System.out.println("The entered day is MONDAY");
        }
        else if(day.contains("TUESDAY"))
        {
            System.out.println("The entered day is TUESDAY");
        }
        else if(day.contains("WEDNESDAY"))
        {
            System.out.println("The entered day is WEDNESDAY");
        }
        else if(day.contains("THURSDAY"))
        {
            System.out.println("The entered day is THURSDAY");
        }
        else if(day.contains("FRIDAY"))
        {
            System.out.println("The entered day is FRIDAY");
        }
        else if(day.contains("SATURDAY"))
        {
            System.out.println("The entered day is SATURDAY");
        }
        else if(day.contains("SUNDAY"))
        {
            System.out.println("The entered day is SUNDAY");
        }
        else{
            System.out.println("Entered a Wrong String");
        }

        //METHOD 2 SWITCH
        
        switch (day){
            case"MONDAY"->System.out.println("The entered day is MONDAY(WEEKDAY)");
            case"TUESDAY"->System.out.println("The entered day is TUESDAY(WEEKDAY)");
            case"WEDNESDAY"->System.out.println("The entered day is WEDNESDAY(WEEKDAY)");
            case"THURSDAY"->System.out.println("The entered day is THURSDAY(WEEKDAY)");
            case"FRIDAY"->System.out.println("The entered day is FRIDAY(WEEKDAY)");
            case"SATURDAY"->System.out.println("The entered day is SATURDAY(WEEKEND)");
            case "SUNDAY" -> System.out.println("The entered day is SUNDAY(WEEKEND)");
            default -> System.out.println("Entered a Wrong String(NO DAY LIKE THAT)");
        };

    }
}




