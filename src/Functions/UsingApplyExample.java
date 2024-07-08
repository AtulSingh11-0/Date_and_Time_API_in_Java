package org.Functions;

import java.util.List;
import java.util.function.Function;

/*
* This class demonstrates the use of the apply method of the Function interface.
* */
public class UsingApplyExample {
  public static void main ( String[] args ) {
    // Function to calculate the sum of the digits of a number
    Function<Integer, Integer> sum = (num) -> {
      int summation = 0;
      while ( num > 0 ) {
        summation += num % 10;
        num /= 10;
      }
      return summation;
    };

    // Function to calculate the product of the digits of a number
    Function<Integer, Integer> product = (num) -> {
      int multiplication = 1;
      while ( num > 0 ) {
        multiplication *= num % 10;
        num /= 10;
      }
      return multiplication;
    };

    // Function to check if a number is a spy number
    Function<Integer, Boolean > isSpy = (num) -> {
      int summation = sum.apply(num);
      int multiplication = product.apply(num);
      return summation == multiplication;
    };

    // List of numbers to check if they are spy numbers
    List<Integer> numbers = List.of(1, 10, 22, 30, 100, 1124, 1234, 123456, 1123, 1234567, 123456789);

    // Check if the numbers are spy numbers
    numbers.forEach( num -> System.out.println("Is " + num + " a spy number? : " + isSpy.apply(num)));
  }
}
/*
In the above example, we learned how to use the apply method of the Function interface. We have created three
functions sum, product, and isSpy to calculate the sum of the digits, product of the digits, and check if a number is
 a spy number respectively.

We have tested the isSpy function with a list of numbers to check if they are spy numbers.
A spy number is a number whose sum of digits is equal to the product of the digits.
For example, 1124 is a spy number because the sum of the digits is 1+1+2+4=8 and the product of the digits is 1*1*2*4=8. Hence, 1124 is a spy number.

However, the apply method is a default method of the Function interface and can be called directly using the Function interface.
The apply method applies the function to the given argument and returns the result.
The apply method is useful when we want to apply a function to an argument and get the result.
* */