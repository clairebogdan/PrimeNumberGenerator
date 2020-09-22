package primenumbergenerator;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeListTest {
    
    // generate() Test
    @Test
    public void testGenerate() {
        System.out.println("* PrimeListTest: generate()");
        PrimeList instance = new PrimeList();
        
        // Expected list results for prime numbers between 7900 and 7920
        List<Integer> testList1 = new ArrayList<>();
            testList1.add(7901); testList1.add(7907); testList1.add(7919);
        
        // Expected list results for prime numbers between 1 and 50
        List<Integer> testList2 = new ArrayList<>();
            testList2.add(2); testList2.add(3); testList2.add(5);
            testList2.add(7); testList2.add(11); testList2.add(13);
            testList2.add(17); testList2.add(19); testList2.add(23);
            testList2.add(29); testList2.add(31); testList2.add(37);
            testList2.add(41); testList2.add(43); testList2.add(47);
        
        // Expected list results for prime numbers between 50 and 100
        List<Integer> testList3 = new ArrayList<>();
            testList3.add(53); testList3.add(59); testList3.add(61);
            testList3.add(67); testList3.add(71); testList3.add(73);
            testList3.add(79); testList3.add(83); testList3.add(89);
            testList3.add(97); 
        
        // Test lists used to compare against expected lists
        List<Integer> result1 = instance.generate(7900, 7920);
        List<Integer> result2 = instance.generate(1, 50);
        List<Integer> result3 = instance.generate(50, 100);
        
        // Compares the list results (they should be identical lists)
        assertEquals(testList1, result1);
        assertEquals(testList2, result2);
        assertEquals(testList3, result3);
    }
    
    // isPrime() Test
    @Test
    public void testIsPrime() {
        System.out.println("* PrimeListTest: isPrime()");
        PrimeList instance = new PrimeList();
        
        // Both values should be identical. 2 is prime, so the first function
        // should evaluate to assertEquals(true, true) and so on. This also
        // applies for assertEquals(false, false).
        assertEquals(true, instance.isPrime(2));
        assertEquals(true, instance.isPrime(7));
        assertEquals(true, instance.isPrime(13));
        assertEquals(false, instance.isPrime(100));
        assertEquals(false, instance.isPrime(1090));
        assertEquals(false, instance.isPrime(400));
    }
}
