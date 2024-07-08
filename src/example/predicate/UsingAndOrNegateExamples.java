package org.example.predicate;

import java.util.List;
import java.util.function.Predicate;

/*
* This class demonstrates the use of and, or, and negate methods of the Predicate interface.
* */
public class UsingAndOrNegateExamples {
  public static void main ( String[] args ) {

    // Predicate to check if a number is prime or not
    Predicate<Integer> isPrime = (num) -> {
      int count = 1;
      for(int i = 2; i <= num/2; i++) {
        if ( num % i == 0 ) ++count;
      }
      return count == 1;
    };
    Predicate<Integer> isEven = num -> num % 2 == 0; // Predicate to check if a number is even or not
    Predicate<Integer> isOdd = num -> num % 2 != 0; // Predicate to check if a number is odd or not

    // List of numbers to check if they are prime or not
    List<Integer> list = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    // Check if the numbers in the list are prime or not
    for (Integer num : list) {
      if ( isPrime.and(isEven).test(num) ) { // Test the number with the Predicate if it is prime and even
        System.out.println(num + " is prime and even");
      } else if ( isPrime.and(isOdd).test(num) ) { // Test the number with the Predicate if it is prime and odd
        System.out.println(num + " is prime and odd");
      } else if ( isPrime.negate().test(num) ) { // Test the number with the Predicate if it is not prime
        System.out.println(num + " is not prime");
      }
    }

    Predicate<String> isAuthorised = str -> str.toLowerCase().startsWith("a"); // Predicate to check if a string is authorised or not
    Predicate<String> isAdmin = str -> str.toLowerCase().endsWith("n"); // Predicate to check if a string is admin or not

    // List of users to check if they are authorised or admin
    List<String> users = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "George", "Harry", "Irene", "alan");
    // Check if the users in the list are authorised or admin
    for (String user : users) {
      if ( isAuthorised.and(isAdmin).test(user) ) { // Test the user with the Predicate if it is authorised or admin
        System.out.println(user + " is authorised and admin");
      } else if ( isAuthorised.and(isAdmin.negate()).test(user) ) { // Test the user with the Predicate if it is authorised but not admin
        System.out.println(user + " is authorised but not admin");
      } else if ( isAuthorised.or(isAdmin.negate()).test(user) ) { // Test the user with the Predicate if it is either authorised or not admin
        System.out.println(user + " is either authorised or not admin");
      }
    }
  }
}
/*
In the above example, we learned how to use and, or, and negate methods of the Predicate interface.
We have created three predicates isPrime, isEven, and isOdd to check if a number is prime, even, or odd respectively.
We have used and method to combine the isPrime and isEven predicates to check if a number is prime and even.
We have used and method to combine the isPrime and isOdd predicates to check if a number is prime and odd.
We have used the negate method to negate the isPrime predicate to check if a number is not prime.

We have created two predicates isAuthorised and isAdmin to check if a string is authorised or admin respectively.
We have used and method to combine the isAuthorised and isAdmin predicates to check if a user is authorised and admin.
We have used and method to combine the isAuthorised and isAdmin.negate() predicates to check if a user is authorised but not admin.
We have used or method to combine the isAuthorised and isAdmin.negate() predicates to check if a user is either authorised or not admin.
* */