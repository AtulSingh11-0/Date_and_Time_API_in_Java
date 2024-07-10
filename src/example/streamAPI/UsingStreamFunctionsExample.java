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
