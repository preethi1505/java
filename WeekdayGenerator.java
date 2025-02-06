import java.util.Scanner;

public class WeekdayGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int dayNumber = scanner.nextInt();
        
        String weekday = "";
        
        switch(dayNumber) {
            case 1:
                System.out.println ("Sunday");
                break;
            case 2:
                 System.out.println ("Monday");
                break;
            case 3:
                System.out.println ("Tuesday");
                break;
            case 4:
                weekday = "Wednesday";
                break;
            case 5:
                weekday = "Thursday";
                break;
            case 6:
                weekday = "Friday";
                break;
            case 7:
                weekday = "Saturday";
                break;
            default:
                weekday = "Invalid input. Please enter a number between 1 and 7.";
        }
        

        System.out.println("The day is: " + weekday);
        

        scanner.close();
    }
}
