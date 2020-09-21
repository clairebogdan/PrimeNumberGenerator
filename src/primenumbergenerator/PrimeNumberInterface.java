package primenumbergenerator;

import java.util.List;

interface PrimeNumberInterface {
    List<Integer> generate(int startingValue, int endingValue);
    boolean isPrime(int value);
}
