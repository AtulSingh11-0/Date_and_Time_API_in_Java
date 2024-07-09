package org.example.binaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/*
* This class is used to demonstrate the use of BinaryOperator interface.
* */
public class UsingBinaryOperatorExample {
  public static void main ( String[] args ) {
    int num1 = 10;
    int num2 = 20;
    BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; // BiFunction is used to perform the operation on two operands.
    BinaryOperator<Integer> addBinaryOperator = (a, b) -> a + b; // BinaryOperator is used to perform the operation on two operands.
    System.out.println("Addition using BiFunction: " + add.apply(num1, num2)); // Addition using BiFunction
    System.out.println("Addition using BinaryOperator: " + addBinaryOperator.apply(num1, num2)); // Addition using BinaryOperator

    // Calculate LCM of two numbers using BinaryOperator
    BinaryOperator<Integer> calculateLCM = (a, b) -> {
      int lcm = 0;
      for (int i = 1; i <= a * b; i++) {
        if (i % a == 0 && i % b == 0) {
          lcm = i;
          break;
        }
      }
      return lcm;
    };

    System.out.println("LCM of " + num1 + " and " + num2 + " is: " + calculateLCM.apply(num1, num2)); // LCM of two numbers using BinaryOperator
  }
}
/*
In the above example, we have used BiFunction and BinaryOperator to perform the addition of two numbers.
BiFunction is used to perform the operation on two operands and return the result.
BinaryOperator is a specialization of BiFunction where the operands and the result are of the same type.

We have also calculated the LCM of two numbers using BinaryOperator.

BinaryOperator is a functional interface and can be used as the assignment target for a lambda expression or method
reference. It is a specialization of BiFunction where the operands and the result are of the same type.
* */