package org.example;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/*
* This class demonstrates the use of BiPredicate, BiFunction and BiConsumer individually and in combination.
* */
public class UsingBiPredicateBiFunctionBiConsumerExample {
  public static void main ( String[] args ) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    biConsumerExample(num1, num2);
  }

  // BiPredicate
  public static boolean biPredicateExample (int num1, int num2) {
    // Check if the two numbers are co-prime
    BiPredicate<Integer, Integer> isCoPrime = (a, b) -> {
      for (int i = 2; i <= Math.min(a, b); i++) { // Co-prime numbers have GCD 1
        if ( a % i == 0 && b % i == 0 ) return false; // If GCD is not 1, then they are not co-prime
      }
      return true; // If GCD is 1, then they are co-prime
    };
    return isCoPrime.test(num1, num2); // Test the two numbers
  }

  // BiFunction
  public static int biFunctionExample (int num1, int num2) {
    BiFunction<Integer, Integer, Integer> calculateGCD = (a, b) -> { // Calculate GCD of two numbers
      int i = Math.min(a, b); // GCD can be at most the smaller of the two numbers
      while (i > 0) { // Find the largest number that divides both numbers
        if ( a % i == 0 && b % i == 0 ) return i; // If a number divides both numbers, then it is the GCD
        --i; // Otherwise, check the next number
      }
      return 1; // If no number divides both numbers, then GCD is 1
    };
    return calculateGCD.apply(num1, num2); // Calculate GCD of the two numbers
  }

  // BiConsumer
  public static void biConsumerExample (int num1, int num2) {
    BiConsumer<Integer, Integer> printFunction = (a, b) -> { // Print the numbers, their GCD and whether they are co-prime
      System.out.println("Numbers are: " + a + " and " + b); // Print the numbers
      System.out.println("There GCD is: " + biFunctionExample(a, b)); // Print the GCD of the numbers
      System.out.println(biPredicateExample(a, b) ? "These numbers are co-prime" : "These numbers are not co-prime"); // Print whether the numbers are co-prime
    };
    printFunction.accept(num1, num2); // Print the numbers, their GCD and whether they are co-prime
  }
}
/*
In this example, we have demonstrated the use of BiPredicate, BiFunction and BiConsumer individually and in combination.
We have taken two numbers as input from the user and then checked if they are co-prime using BiPredicate.
Then we have calculated the GCD of the two numbers using BiFunction.
Finally, we have printed the numbers, their GCD and whether they are co-prime or not using BiConsumer.

BiPredicate is the functional interface that takes two arguments and returns a boolean value. It is used to check a
condition on two arguments. It is same as Predicate but takes two arguments. It also has a test() method that takes two arguments and returns a boolean value.

BiFunction is the functional interface that takes two arguments and returns a value. It is used to perform some
operation on two arguments and return a value. It is same as Function but takes two arguments. It also has an apply() method that takes two arguments and returns a value.

BiConsumer is the functional interface that takes two arguments and returns no result. It is used to perform some operation on two arguments and return no result. It is same as Consumer but takes two arguments. It also has an accept() method that takes two arguments and returns no result.
* */