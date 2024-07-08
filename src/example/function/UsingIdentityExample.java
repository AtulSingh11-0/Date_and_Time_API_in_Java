package org.example.function;

import java.util.List;
import java.util.function.Function;

/*
* This class demonstrates the use of the identity method of the Function interface.
* */
public class UsingIdentityExample {
  public static void main ( String[] args ) {
    // Function to return the same object
    Function< Object, Object > function = Function.identity();
    // List of objects to test the identity function
    List< Object > objects = List.of( 1, "Alice", 2.5, true, 'A', "Bob", 3.5, false, 'B' );

    // Test the identity function with the list of objects
    System.out.println(function.apply(objects));
  }
}
/*
In the above example, we learned how to use the identity method of the Function interface.
We have created a function named function to return the same object. We have tested the identity function with a list
 of objects.

The identity method is a static method of the Function interface and can be called directly using the Function interface.
The identity method returns a function that returns the same object that is passed as an argument.
The identity method is useful when we want to return the same object that is passed as an argument.

The identity method is useful when we want to return the same object that is passed as an argument.
* */
