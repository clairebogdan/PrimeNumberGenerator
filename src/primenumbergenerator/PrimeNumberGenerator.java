package primenumbergenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberGenerator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startingValue, endingValue, min, max;
        
        // Introduction & ask for starting value
        System.out.println("Welcome to the Prime Number Generator!\n"
                + "This program will list all the prime numbers in a "
                + "given range that YOU determine!\n"
                + "Please enter a positive integer for the starting value:");
        
        // Confirm valid integer input for starting value
        try {
            startingValue = Integer.parseInt(input.nextLine());
            
            // Exit program upon 0 or negative integer entry
            if (startingValue <= 0) {
                System.out.println("Sorry, the starting number must be a positive integer.");
            }
            
            // Ask for ending value
            else {
                System.out.println("Please enter a positive integer for the ending value:");
                
                // Confirm valid integer input for the ending value
                try {
                    endingValue = Integer.parseInt(input.nextLine());
                    
                    // Exit program upon 0 or negative integer entry
                    if (endingValue <= 0) {
                        System.out.println("Sorry, the starting number must be a positive integer.");
                    }
                    
                    // Confirm that the integer is a natural number
                    else {
                        
                        // Establish min and max values so the range is in ascending order
                        if (startingValue < endingValue) {
                            min = startingValue;
                            max = endingValue;
                        }
                        else {
                            min = endingValue;
                            max = startingValue;
                        }
                        
                        ///////////// BEGIN PRIME NUMBER ALGORITHM /////////////
                        
                        // Create PrimeList object
                        PrimeNumberInterface p = new PrimeList();
                        
                        // Initialize the list that will be printed to the console
                        List<Integer> finalList = new ArrayList<>();                      
                        
                        // Assign finalList to the list of prime numbers
                        finalList = p.generate(min, max);
                        
                        // Change output text grammatical syntax depending 
                        // on number of elements in the finalList
                        if (finalList.isEmpty()) {
                            System.out.println("There are no prime numbers "
                                             + "between " + min + " and " + max + ".");
                        }
                        else if (finalList.size() == 1) {
                            System.out.println("The PRIME number between " + min 
                                              + " and " + max + " (inclusive) is:");
                            finalList.forEach(System.out::println);
                        }
                        else {
                            System.out.println("The PRIME numbers between " + min 
                                              + " and " + max + " (inclusive) are:");
                            finalList.forEach(System.out::println);
                        }
                        
                        ////////////// END PRIME NUMBER ALGORITHM //////////////
                        
                    }
                    
                // Ending input value was invalid    
                } catch (Exception e) {
                    System.out.println("Sorry, you need to enter an integer greater than 0.");
                    System.out.println("Error message: " + e.getMessage());
                }
                
            }
        
        // Starting input value was invalid
        } catch (Exception e) {
            System.out.println("Sorry, you need to enter an integer greater than 0.");
            System.out.println("Error message: " + e.getMessage());
        }
    } 
}
