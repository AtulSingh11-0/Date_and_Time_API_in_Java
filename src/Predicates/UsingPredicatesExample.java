package org.Predicates;

import java.util.List;
import java.util.function.Predicate;

/*
* This example demonstrates the use of Predicate functional interface.
* */
public class UsingPredicatesExample {
  public static void main ( String[] args ) {

    // Predicate to check if a number is prime or not
    Predicate<Integer> isPrime = (num) -> {
      int count = 1;
      for (int i = 2; i <= num/2; i++) {
        if( num % i == 0) ++count;
      }
      return count == 1;
    };

    // List of numbers to check if they are prime or not
    List<Integer> list = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

    // Check if the numbers in the list are prime or not
    for ( Integer num : list ) {
      // Test the number with the Predicate if it is prime or not
      if ( isPrime.test(num) ) {
        System.out.println(num + " is prime");
      } else {
        System.out.println(num + " is not prime");
      }
    }
  }
}
/*
From the above example, we can see that we have created a Predicate to check if a number is prime or not.
The Predicate isPrime is a lambda expression that takes an integer as input and returns a boolean value.
There are other methods in the Predicate interface like and, or, negate, etc. that can be used to combine multiple predicates.
Using Predicate interface, we can create complex conditions to filter the data in a collection with the help of stream API.
Which makes the code more readable and maintainable and encourages the use of functional programming.
* */