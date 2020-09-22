package primenumbergenerator;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberGenerator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int startingValue, endingValue, min, max;
        String checker1 = "1";
        String checker2 = "1";


        // Introduction & ask for starting value
        System.out.println("Welcome to the Prime Number Generator!\n"
                         + "This program will list all the prime numbers in a "
                         + "given range that YOU determine!\n");
   
        // Repeats the starting value prompt if invalid input is entered
        while (checker1.equals("1")) {
            System.out.println("Please enter a positive integer for the starting value:");

            // Confirm valid integer input for starting value
            try {
                startingValue = Integer.parseInt(input.nextLine());

                
                // Prevent the user from entering an integer at or below 0
                if (startingValue <= 0) {
                    System.out.println("Sorry, the starting number must be a positive integer.");
                }

                // STARTING VALUE WAS ACCEPTED
                else {
                    
                    // Repeats the ending value prompt if invalid input is entered
                    while (checker2.equals("1")) {
                        System.out.println("Please enter a positive integer for the ending value:");

                        // Confirm valid integer input for the ending value
                        try {
                            endingValue = Integer.parseInt(input.nextLine());

                            // Prevent the user from entering an integer at or below 0
                            if (endingValue <= 0) {
                                System.out.println("Sorry, the ending number must be a positive integer.");
                            }

                            // ENDING VALUE WAS ACCEPTED
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

                                ///////// BEGIN PRIME NUMBER ALGORITHM /////////

                                PrimeNumberInterface p = new PrimeList();
                                List<Integer> finalList;                      
                                
                                // Assign finalList to the list of prime numbers
                                finalList = p.generate(min, max);

                                // Change output's grammatical syntax depending 
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
                                
                                // End program
                                System.out.println("Thanks for playing!");
                                System.exit(0);
                                
                                ////////// END PRIME NUMBER ALGORITHM //////////

                            }

                        // Ending input value was invalid    
                        } catch (Exception e) {
                            System.out.println("Sorry, you need to enter an integer greater than 0.");
                            
                            // Allow user to try again by entering 1
                            System.out.println("Enter 1 to try again. Enter anything else to exit.");
                            String tryAgain = input.nextLine();
                            if (!checker2.equals(tryAgain)) {
                                System.exit(0);
                            }
                        }
                    }

                }

            // Starting input value was invalid
            } catch (Exception e) {
                System.out.println("Sorry, you need to enter an integer greater than 0.");
                
                // Allow user to try again by entering 1
                System.out.println("Enter 1 to try again. Enter anything else to exit.");
                String tryAgain = input.nextLine();
                if (!checker1.equals(tryAgain)) {
                    System.exit(0);
                }
            }
        }
    } 
}
