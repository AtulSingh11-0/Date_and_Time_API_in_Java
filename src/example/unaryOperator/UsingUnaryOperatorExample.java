package org.example.unaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
* This class demonstrates the use of UnaryOperator functional interface.
* */
public class UsingUnaryOperatorExample {
  public static void main ( String[] args ) {
    String name = "John Doe"; // Name to be converted to uppercase
    Function<String, String> toUpperCase = String::toUpperCase; // Function to convert string to uppercase
    UnaryOperator<String> unaryOperatorUpperCase = String::toUpperCase; // UnaryOperator to convert string to uppercase

    System.out.println("Name: " + name); // Print the name
    System.out.println("Name in uppercase using Function: " + toUpperCase.apply(name)); // Convert name to uppercase using Function
    System.out.println("Name in uppercase using UnaryOperator: " + unaryOperatorUpperCase.apply(name)); // Convert name to uppercase using UnaryOperator


    // Using UnaryOperator to add 10 to each element of the List
    UnaryOperator< List<Integer> > addTen = list -> {
      List<Integer> numbers = new ArrayList<>(); // Create a new list
      for (int i = 0; i < list.size(); i++) {
        numbers.add(list.get(i) + 10); // Add 10 to each element of the list
      }
      return numbers; // Return the list
    };

    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // List of numbers
    System.out.println("Numbers before adding 10: " + numbers); // Print the numbers before adding 10
    System.out.println("Numbers after adding 10: " + addTen.apply(numbers)); // Print the numbers after adding 10
  }
}
/*
In the above example, we have demonstrated the use of UnaryOperator functional interface. We have created a Function to convert a string to uppercase and a UnaryOperator to convert a string to uppercase. We have also created a UnaryOperator to add 10 to each element of the List.

UnaryOperator is a functional interface introduced in Java 8 in the java.util.function package.
It is a specialization of the Function interface for cases where the operand and the result are of the same type.
It has a single abstract method apply which takes a single argument and returns a result of the same type.

It is used when we want to perform an operation on a single operand and return a result of the same type.
So when we create a Function to perform an operation on a single operand and return a result of the same type, we can use
UnaryOperator instead of Function. This makes the code more readable and concise.
* */
