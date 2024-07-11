package org.example.optional;

import java.util.Optional;
import java.util.Random;

/*
* This class demonstrates the use of Optional class in Java.
* */
public class UsingOptionalExample {
  public static void main ( String[] args ) {
    Optional< String > name = getNameFromDB(new Random().nextInt(2)); // Get name from DB
    name.ifPresentOrElse( // If name is present, print it, else print "Name not found"
      System.out::println,
      () -> System.out.println("Name not found")
    );
  }

  private static Optional<String> getNameFromDB (int id) { // Simulating DB call
    return id == 1 ? Optional.of("John") : Optional.empty(); // Return name if id is 1, else return empty
  }
}
/*
In the above code, we have a method getNameFromDB that simulates a DB call and returns a name if the id is 1, else it returns an empty Optional.
In the main method, we call getNameFromDB with a random id and use ifPresentOrElse to print the name if it is
present, else print "Name not found". This way, we can avoid NullPointerExceptions and write cleaner code.

The Optional class was introduced in Java 8 to handle null values more effectively. It provides a way to represent optional values instead of using null references.
This can help avoid NullPointerExceptions and make the code more readable and maintainable. Optional provides methods to work with optional values, such as ifPresent, orElse, and more.
It is a good practice to use Optional when dealing with potentially null values to improve code quality and
reliability.

The various important methods provided by the Optional class are:
- empty(): Returns an empty Optional instance.
- of(T value): Returns an Optional with the specified non-null value.
- ofNullable(T value): Returns an Optional with the specified value, which can be null.
- get(): Returns the value if present, otherwise throws NoSuchElementException.
- isPresent(): Returns true if a value is present, otherwise false.
- ifPresent(Consumer<? super T> consumer): Executes the specified consumer if a value is present.
- ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction): Executes the specified action if a value is present, otherwise executes the emptyAction.
- orElse(T other): Returns the value if present, otherwise returns the specified value.
- orElseGet(Supplier<? extends T> other): Returns the value if present, otherwise returns the result of the specified supplier.
- orElseThrow(Supplier<? extends X> exceptionSupplier): Returns the value if present, otherwise throws an exception produced by the specified supplier.
- map(Function<? super T, ? extends U> mapper): Applies the specified mapping function to the value if present.
- flatMap(Function<? super T, Optional<U>> mapper): Applies the specified mapping function to the value if present and returns the result.
- filter(Predicate<? super T> predicate): Returns an Optional containing the value if it matches the specified predicate, otherwise returns an empty Optional.
- stream(): Returns a Stream with the value if present, otherwise returns an empty Stream.
* */