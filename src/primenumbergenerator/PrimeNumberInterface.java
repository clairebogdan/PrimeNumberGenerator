package primenumbergenerator;

import java.util.List;

public interface PrimeNumberInterface {
    List<Integer> generate(int startingValue, int endingValue);
    boolean isPrime(int value);
}
