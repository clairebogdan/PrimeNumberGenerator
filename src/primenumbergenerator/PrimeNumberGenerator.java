package primenumbergenerator;
import java.util.Scanner;

public class PrimeNumberGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startingValue, endingValue;
        
        // Introduction & ask for starting value
        System.out.println("Welcome to the Prime Number Generator!\n"
                + "This program will list all the prime numbers in a "
                + "given range that YOU determine!\n"
                + "Please enter the starting value:");
        
        // Confirm valid integer input for starting value
        try {
            startingValue = Integer.parseInt(input.nextLine());
            
            // Exit program upon negative integer entry
            if (startingValue < 0) {
                System.out.println("Sorry, the starting number must be a positive integer.");
            }
            
            // Confirm that the integer is a natural number, zero or above.
            else {
                System.out.println("Starting value saved as " + startingValue);
                System.out.println("Please enter the ending value:");
                
                // Confirm valid integer input for the ending value
                try {
                    endingValue = Integer.parseInt(input.nextLine());
                    
                    // Exit program upon negative integer entry
                    if (endingValue < 0) {
                        System.out.println("Ending value saved as " + endingValue);
                        System.out.println("Sorry, the starting number must be a positive integer.");
                    }
                    
                    // Confirm that the integer is a natural number, zero or above.
                    else {
                        System.out.println("This is where we would compute the "
                                         + "prime numbers between " + startingValue
                                         + " and " + endingValue);
                    }
                    
                // Ending input value was invalid    
                } catch (Exception e) {
                    System.out.println("Sorry, you need to enter an integer greater than or equal to 0.");
                }
            }
        
        // Starting input value was invalid
        } catch (Exception e) {
            System.out.println("Sorry, you need to enter an integer greater than or equal to 0.");
        }
    }  
}
