package org.example.binaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/*
* This class demonstrates how to use maxBy and minBy methods of BinaryOperator functional interface.
* */
public class UsingMaxByAndMinByExample {
  public static void main ( String[] args ) {
    // Using maxBy
    BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(Comparator.naturalOrder()); // Comparator.naturalOrder() is used to compare two values
    System.out.println("Max value: " + maxBy.apply(10, 20)); // Output: 20

    // Using minBy
    BinaryOperator<Integer> minBy = BinaryOperator.minBy(Comparator.naturalOrder()); // Comparator.naturalOrder() is used to compare two values
    System.out.println("Min value: " + minBy.apply(10, 20)); // Output: 10
  }
}
/*
In the above example, we have used maxBy and minBy methods of BinaryOperator functional interface.
These methods are used to compare two values and return the maximum and minimum value respectively.

The maxBy method takes a Comparator as an argument which is used to compare two values. It returns a BinaryOperator
which returns the maximum value of two values. In the above example, we have used Comparator.naturalOrder() which compares two values in natural order.

The minBy method takes a Comparator as an argument which is used to compare two values. It returns a BinaryOperator
which returns the minimum value of two values. In the above example, we have used Comparator.naturalOrder() which
compares two values in natural order. 
* */
