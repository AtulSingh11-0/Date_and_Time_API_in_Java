package DateAndTimeAPI.Consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
* This class demonstrates the use of the andThen method of the Consumer interface.
* */
public class UsingAcceptAndandThenExample {
  public static void main ( String[] args ) {
    // Consumer to print the list of numbers
    Consumer<List<Integer>> print = System.out::println;

    // Consumer to calculate the square of the numbers
    Consumer<List<Integer>> square = (nums) -> {
      List<Integer> squares = new ArrayList<>();
      nums.forEach(num -> squares.add(num * num));
      System.out.println(squares);
    };

    // List of numbers to print and calculate the square
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Print the numbers and calculate the square
    print.andThen(square).accept(numbers);
  }
}
/*
In the above example, we learned how to use the andThen method of the Consumer interface.
We have created two consumers print and square to print the list of numbers and calculate the square of the numbers respectively.

Consumer is a functional interface, and has a method accept that accepts an argument and performs an operation on the given argument and returns nothing.
The andThen method is a default method of the Consumer interface and can be called directly using the Consumer interface.
The andThen method returns a composed Consumer that performs, in sequence, the operation of the current Consumer followed by the operation of the after Consumer.
The andThen method is useful when we want to perform multiple operations in sequence using the Consumer interface.
* */
