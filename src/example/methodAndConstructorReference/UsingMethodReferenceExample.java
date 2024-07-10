package org.example.methodAndConstructorReference;

import java.util.List;
import java.util.Random;

/*
* This class is used to demonstrate the use of method reference in Java.
* */
public class UsingMethodReferenceExample {

  public static void main ( String[] args ) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // list of numbers

    numbers.forEach(PrintAndAdd::add); // using method reference to print and add random number to each number

    numbers.stream() // using method reference to add random number to each number and print the result
        .map(Add::add) // using method reference to add random number to each number
        .forEach(System.out::println); // using method reference to print the result
  }

  private static class Add { // class to add random number to a number
    public static int add ( int num ) { // method to add random number to a number
      return num + new Random().nextInt(100); // adding random number to the number
    }
  }

  private static class PrintAndAdd { // class to print and add random number to a number
    public static void add ( int num ) { // method to print and add random number to a number
      int random = new Random().nextInt(100); // generating random number
      System.out.println("Number: " + num + " + " + random + " = " + (num + random)); // printing the result
    }
  }
}
/*
In the above example, we have a list of numbers. We are using method reference to add a random number to each number in the list.
We have two classes Add and PrintAndAdd. Add class has a method add which adds a random number to a number. PrintAndAdd class has a method add which prints the number and adds a random number to it.
We are using method reference to call these methods. We are using forEach method to call PrintAndAdd::add method to print and add a random number to each number in the list.
We are using map method to call Add::add method to add a random number to each number in the list. We are using forEach method to call System.out::println method to print the result.

Method reference is a feature of Java which allows us to refer to methods or constructors of a class. It is used to call a method or constructor by referring to it with the help of its class directly.
It is a shorthand notation of a lambda expression to call a method. It makes the code more readable and concise.

There are four types of method references in Java:
1. Reference to a static method -> Class::staticMethodName
2. Reference to an instance method -> object::instanceMethodName
3. Reference to a constructor -> ClassName::new
4. Reference to an instance method of an arbitrary object of a particular type -> ClassName::instanceMethodName

In the above example, we have used Reference to a static method. We have used PrintAndAdd::add and Add::add method references to call the add method of PrintAndAdd and Add classes respectively.
* */