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
    BiPredicate<Integer, Integer> isCoPrime = (a, b) -> {
      for (int i = 2; i <= Math.min(a, b); i++) {
        if ( a % i == 0 && b % i == 0 ) return false;
      }
      return true;
    };
    return isCoPrime.test(num1, num2);
  }

  // BiFunction
  public static int biFunctionExample (int num1, int num2) {
    BiFunction<Integer, Integer, Integer> calculateGCD = (a, b) -> {
      int i = Math.min(a, b);
      while (i > 0) {
        if ( a % i == 0 && b % i == 0 ) return i;
        --i;
      }
      return 1;
    };
    return calculateGCD.apply(num1, num2);
  }

  // BiConsumer
  public static void biConsumerExample (int num1, int num2) {
    BiConsumer<Integer, Integer> printFunction = (a, b) -> {
      System.out.println("Numbers are: " + a + " and " + b);
      System.out.println("There GCD is: " + biFunctionExample(a, b));
      System.out.println(biPredicateExample(a, b) ? "These numbers are co-prime" : "These numbers are not co-prime");
    };
    printFunction.accept(num1, num2);
  }
}
