import java.util.Scanner;

public class positivenegative {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        scanner.close();
    }
}    
