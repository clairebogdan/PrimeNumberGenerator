package primenumbergenerator;
import java.util.ArrayList;
import java.util.List;


public class PrimeList implements PrimeNumberInterface {

    // Creates a list of prime numbers between the min/starting and max/ending values
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        
        // Initialize the list
        List<Integer> list = new ArrayList<>();
    
        // Loop through all numbers between startingValue and endingValue, inclusive
        for (int i = startingValue; i <= endingValue; i++){
            
            // If the number at index i is prime, add it to the list
            if (isPrime(i)){
                list.add(i);
            }
        }
        
        // Return the list of prime numbers between startingValue and endingValue
        return list;
    } 

    // Checks whether or not a number is prime
    @Override
    public boolean isPrime(int value) {
        
        // Initialize a temporary int value
        int temp;
        
        // 1 is not prime
        if (value == 1) {
            return false;
        }
        else {
        
            // Check the modulo values for (value/2)
            for (int i = 2; i <= value/2; i++) {
                temp = value % i;
                
                // If value % i is 0, then value is not prime
                if (temp == 0) {
                    return false;
                }
            }
        }
        // The value is prime
        return true;
    }
    
}
