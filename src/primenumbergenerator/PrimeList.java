package primenumbergenerator;
import java.util.ArrayList;
import java.util.List;


public class PrimeList implements PrimeNumberInterface {

    // Creates a list of all numbers between the min/starting and max/ending values
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
              
        List<Integer> list = new ArrayList<>();
    
        for (int i = startingValue; i <= endingValue; i++) {
            list.add(i);
        }
        
        return list;
    } 

    // Checks whether or not the numbers in "list" are prime. If false, those ints are removed
    @Override
    public boolean isPrime(int value) {
        
        int temp;
        
        if (value == 1) {
            return false;
        }
        
        else {
        
            for (int i = 2; i <= value/2; i++) {
                temp = value % i;
                if (temp == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
}


