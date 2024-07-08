package org.Predicates;

import java.util.function.Predicate;

/*
* This class demonstrates the use of isEqual method of the Predicate interface.
* */
public class UsingIsEqualExample {
  public static void main(String[] args) {

    // Predicate to check if a string is equal to "Java-8"
    Predicate<Object> equal = Predicate.isEqual("Java-8");
    System.out.println("Is Java-8 equal to Java-8? " + equal.test("Java-8")); // Test the Predicate with the string if it is equal to "Java-8"
    System.out.println("Is Java-8 equal to Java-11? " + equal.test("Java-11")); // Test the Predicate with the string if it is equal to "Java-11"
    System.out.println("Is Java-8 equal to Java-21? " + equal.test("Java-21")); // Test the Predicate with the string if it is equal to "Java-21"
  }
}
/*
In the above example, we learned how to use the isEqual method of the Predicate interface.
We have created a predicate equal to check if a string is equal to "Java-8". We have tested the predicate with the
strings "Java-8", "Java-11", and "Java-21".
However, the isEqual method is a static method of the Predicate interface and can be called directly using the
Predicate class. The isEqual method returns a predicate that checks if the input object is equal to the specified
object. The isEqual method is useful when we want to check if an object is equal to a specific object just like the equals method of the Object class.
* */