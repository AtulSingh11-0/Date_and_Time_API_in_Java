package org.Functions;

import java.util.List;
import java.util.function.Function;

/*
* This class demonstrates the use of the compose method of the Function interface.
* */
public class UsingComposeExample {
  public static void main ( String[] args ) {

    // Function to extract the first three letters of a string
    Function<String, String> extract = str -> str.substring(0, 3);

    // Function to convert a string to uppercase
    Function<String, String> toUpperCase = String::toUpperCase;

    // List of names to extract the first three letters and convert them to uppercase
    List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Helen", "Ivy");

    // Extract the first three letters of the names and convert them to uppercase
    names.forEach(name -> System.out.println("First three letters of " + name + " are: " + extract.compose(toUpperCase).apply(name)));
  }
}
/*
In the above example, we learned how to use the compose method of the Function interface.
We have created two functions extract and toUpperCase to extract the first three letters of a string and convert a string to uppercase respectively.
Then we have tested the compose method with a list of names to extract the first three letters and convert them to uppercase.

The compose method is a default method of the Function interface and can be called directly using the Function interface.
The compose method returns a composed function that applies the specified function first and then applies the current function.
The compose method is useful when we want to apply a function first and then apply the current function to the result.

In certain cases, we can also apply the second function first and then apply the first function.
for eg: toUpperCase.compose(extract).apply(name)
This will do the same work as before, its just that the order of the functions is reversed and the output will be the same.
* */
