package primenumbergenerator;
import java.util.ArrayList;
import java.util.List;


public class PrimeList implements PrimeNumberInterface {

    // Creates a list of prime numbers between the min/starting and max/ending values
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        
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
        
        // 1 is not prime
        if (value == 1) {
            return false;
        }
        
        // 2 and 3 are prime
        else if (value <= 3) {
            return true;
        }
        
        // Numbers that are multiples of 2 and 3 are not prime
        else if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }
        
        else {
        
            // Loop through the remaining values
            // Prime numbers follow the formula 6n + 1 or 6n - 1 
            // with the exception of 2 and 3 (taken care of on lines 37-38). 
            for (int i = 5; i * i <= value; i = i + 6) { 
                if (value % i == 0 || value % (i + 2) == 0) {
                    return false;
                }
            }
        }
        
        // Value % i was never 0, thus value is prime
        return true;
    }
    
}
