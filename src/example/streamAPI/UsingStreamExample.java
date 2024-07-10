package org.example.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
* This example demonstrates how to create a Stream using different methods and display the elements of each Stream.
* */
public class UsingStreamExample {
  public static void main ( String[] args ) {
    // Stream of Array
    String[] names = new String[]{"John", "Peter", "Susan", "Kim", "Jen"};
    Stream< String > stream = Arrays.stream(names);

    // Stream of List
    List<Double> floatingNumbers = Arrays.asList(3.6, 9.8, 2.4, 8.5, 3.5);
    Stream< Double > doubleStream = floatingNumbers.stream();

    // Creating Stream using Stream.of() method
    Stream<String> programmingLanguages = Stream.of("Java", "Python", "C++", "JavaScript", "C#", "Ruby");

    // Creating Stream using Stream.builder() method
    Stream<String> nationsBuilder = Stream.<String>builder()
        .add("India")
        .add("USA")
        .add("UK")
        .add("Australia")
        .build();

    // Creating Stream using Stream.generate() method
    Stream<String> streamGenerate = Stream.generate(() -> "Hello World").limit(5);

    // Creating Stream using Stream.iterate() method
    Stream<Integer> streamIterate = Stream.iterate(1, n -> n + 2).limit(5);

    // Creating Stream using Stream.concat() method
    Stream<String> fishes = Stream.of("Salmon", "Tuna", "Trout", "Herring");
    Stream<String> mammals = Stream.of("Dog", "Cat", "Horse", "Elephant");
    Stream<String> animals = Stream.concat(fishes, mammals);

    // Displaying the elements of each Stream
    stream.forEach(System.out::println);
    doubleStream.forEach(System.out::println);
    programmingLanguages.forEach(System.out::println);
    nationsBuilder.forEach(System.out::println);
    streamGenerate.forEach(System.out::println);
    streamIterate.forEach(System.out::println);
    animals.forEach(System.out::println);
  }
}
/*
In the above example, we have created a Stream using different methods such as Arrays.stream(), List.stream(), Stream.of(), Stream.builder(), Stream.generate(), Stream.iterate(), and Stream.concat() methods.
We have displayed the elements of each Stream using the forEach() method.

Streams are used to process collections of objects. A stream is a sequence of objects that supports various methods that can be pipelined to produce the desired result.
* */