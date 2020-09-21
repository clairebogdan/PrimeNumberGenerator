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
                        
                        //Establish min and max values
                        if (startingValue < endingValue) {
                            min = startingValue;
                            max = endingValue;
                        }
                        else {
                            min = endingValue;
                            max = startingValue;
                        }
                        
                        ///////////// BEGIN PRIME NUMBER ALGORITHM /////////////
                        
                        PrimeNumberInterface p = new PrimeList();
                        List<Integer> finalList = new ArrayList<>();
                        
                        /* 
                        For testing purposes:
                        Print all numbers between min and max, inclusive. 
                        
                        System.out.println("All numbers between " + min 
                                          + " and " + max + ":");
                        p.generate(min, max).forEach(System.out::println);
                        */
                        
                        for (int i = min; i < p.generate(min,max).size(); i++){
                            if (p.isPrime(i)){
                                finalList.add(i);
                            }
                        }
                        
                        System.out.println("The PRIME numbers between " + min 
                                          + " and " + max + " are:");
                        finalList.forEach(System.out::println);
                        
                    }
                    
                // Ending input value was invalid    
                } catch (Exception e) {
                    System.out.println("Sorry, you need to enter an integer greater than or equal to 0.");
                    System.out.println("Error message: " + e.getMessage());
                }
            }
        
        // Starting input value was invalid
        } catch (Exception e) {
            System.out.println("Sorry, you need to enter an integer greater than or equal to 0.");
            System.out.println("Error message: " + e.getMessage());
        }
    } 
}


