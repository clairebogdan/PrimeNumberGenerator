# PrimeNumberGenerator
#### Updox Coding Exercise

## Task overview:
- Create a prime number generator that returns an ordered list of all prime numbers in a given range (inclusive of the endpoints). 
- Implement the interface specified below: 
```
Interface PrimeNumberGenerator {
  List<Integer> generate(int startingValue, int endingValue);
  boolean isPrime(int value);
}
```
- Develop a main program to drive the generator and to allow the user to specify the prime number range via the command line.
- Ensure that the code handles inverse ranges such as that 1-10 and 10-1 are equivalent.
- Create unit tests that pass and provide 100% code coverage. One of the unit tests should test against the range 7900 and 7920.

## How to execute:
1. Click the green "Code" button, then "Download Zip". Unzip the file to reveal the folder.
2. Open the folder/project in the IDE of your choice that supports Java (I used NetBeans 8.2).
3. Click Run and interact with the CLI!

## Notes:
- This program can find all prime numbers between 1 and  1 million in 13 seconds, and all prime numbers between 1 and 10 million in 64 seconds.


