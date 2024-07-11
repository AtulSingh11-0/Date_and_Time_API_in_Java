package org.example.streamAPI;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/*
* This example demonstrates how to use Stream functions to perform operations on the stream.
* */
public class UsingStreamFunctionsExample {
  public static void main ( String[] args ) {
    List< Integer > list = Stream.iterate(1, n -> n + new Random().nextInt(10)).limit(30).toList(); // Generate a list of 30 random numbers
    System.out.println("Original List: " + list);

    List< Integer > filteredList = list.stream().filter(n -> n % 2 == 0).toList(); // using filter function to filter out even numbers
    System.out.println("Filtered List: " + filteredList);

    List< Integer > mappedList = list.stream().map(n -> n / 3).toList(); // using map function to divide each element by 3
    System.out.println("Mapped List: " + mappedList);

    List< Integer > distinctList = list.stream().distinct().toList(); // using distinct function to remove duplicates
    System.out.println("Distinct List: " + distinctList);

    List< Integer > sortedAscList = list.stream().sorted().toList(); // using sorted function to sort the list in
    // ascending order
    System.out.println("Sorted List(ASC): " + sortedAscList);

    List< Integer > sortedDescList = list.stream().sorted((a, b) -> b - a).toList(); // using sorted function to sort the list in descending order
    System.out.println("Sorted List(DESC): " + sortedDescList);

    Integer sum = list.stream().reduce(0, Integer::sum); // using reduce function to calculate the sum of all elements
    System.out.println("Sum of all elements: " + sum);

    Integer max = list.stream().reduce(Integer.MIN_VALUE, Integer::max); // using reduce function to find the maximum element
    System.out.println("Maximum element: " + max);

    Integer min = list.stream().reduce(Integer.MAX_VALUE, Integer::min); // using reduce function to find the minimum element
    System.out.println("Minimum element: " + min);

    int count = (int) list.stream().count(); // using count function to count the number of elements
    System.out.println("Number of elements: " + count);
  }
}
/*
In the above example, we have used the following Stream functions:
1. filter: It is used to filter out elements based on a condition.
2. map: It is used to transform each element of the stream.
3. distinct: It is used to remove duplicates from the stream.
4. sorted: It is used to sort the stream.
5. reduce: It is used to reduce the elements of the stream to a single value.
6. count: It is used to count the number of elements in the stream.

Stream functions are used to perform operations on the stream elements. They are used to filter, transform, sort,
reduce, and count the elements of the stream. These functions are used to process the stream elements in a functional way without using loops.
They provide a concise and expressive way to perform operations on the stream elements. Stream functions are an essential part of the Stream API and are widely used in stream processing applications.
* */