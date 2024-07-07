package DateAndTimeAPI;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
* This class demonstrates the use of the Predicate, Function, Consumer, and Supplier interfaces together.
* */
public class UsingPredicateFunctionConsumerSupplierExample {

  private static final String NOT_PRIME = " is not a prime number but "; // String to print if the number is not prime
  private static final String PRIME = " is a prime number and also "; // String to print if the number is prime
  private static final String ODD = "an odd number.\n"; // String to print if the number is odd
  private static final String EVEN = "an even number.\n"; // String to print if the number is even
  private static final String RANDOM_NUMBER = "Random number_"; // String to print the random number

  public static void main ( String[] args ) {
    // Predicate to check if a number is even
    Predicate<Integer> isEven = num -> num % 2 == 0;

    // Function to check if a number is prime
    Function<Integer, String> isPrime = (num) -> {
      if ( num == 0 || num == 1 ) return num + NOT_PRIME; // 0 and 1 are not prime numbers
      int count = 1;
      for( int i = 2; i <= num/2; i++) {
        if ( num % i == 0 ) ++count;
      }
      return count == 1
          ? num + PRIME
          : num + NOT_PRIME;
    };

    // Consumer to print the result
    Consumer<String> print = System.out::println;

    // Supplier to generate a random number between 0 and 100
    Supplier<Integer> random = () -> (int) (Math.random() * 100);

    // Generate 10 random numbers and check if they are even or odd and if they are prime or not
    for ( int i = 1; i <= 10; ++i ) {
      int num = random.get();
      print.accept(RANDOM_NUMBER + i + ": " + num);

      // Check if the number is even or odd and if it is prime or not and print the result
      if ( isEven.test(num) ) {
        String ans = isPrime.apply(num) + EVEN;
        print.accept(ans);
      } else {
        String ans = isPrime.apply(num) + ODD;
        print.accept(ans);
      }
    }
  }
}
/*
So far, we have learned about the Predicate, Function, Consumer, and Supplier interfaces. We have seen how to use these interfaces individually. In this example, we will see how to use these interfaces together.
* Predicate -> does some test and returns a boolean value.
* Function -> takes an argument and returns a value.
* Consumer -> takes an argument and does some operation.
* Supplier -> does not take any argument and returns a value.

In this example, we have created a Predicate isEven to check if a number is even, a Function isPrime to check if a number is prime, a Consumer print to print the result, and a Supplier random to generate a random number between 0 and 100.
Then we have generated 10 random numbers and checked if they are even or odd and if they are prime or not using the Predicate and Function interfaces. We have printed the result using the Consumer interface.

* Predicate isEven checks if a number is even or not.
* Function isPrime checks if a number is prime or not.
* Consumer print prints the result.
* Supplier random generates a random number between 0 and 100.

This example demonstrates how to use the Predicate, Function, Consumer, and Supplier interfaces together to perform some operations.
* */