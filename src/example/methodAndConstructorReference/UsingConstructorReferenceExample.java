package org.example.methodAndConstructorReference;

import java.util.List;

/*
* This example demonstrates how to use constructor reference in Java.
* */
public class UsingConstructorReferenceExample {
  public static void main ( String[] args ) {
    List<String> names = List.of("John", "Alice", "Jane", "Simon"); // List of names

    names.stream() // Stream of names
        .map(Person::new) // Using constructor reference to create a person object
        .forEach(System.out::println); // Print each person object
  }
}

/*
* This class represents a person.
* */
class Person {
  private String name; // Name of the person

  public Person () { // Default constructor
    this.name = "Unknown"; // Set the name of the person
  }

  public Person ( String name ) { // Parameterized constructor
    this.name = name; // Set the name of the person
  }

  public String getName () { // Getter method
    return name;
  }

  public void setName ( String name ) { // Setter method
     this.name = name;
  }

  @Override
  public String toString () { // Overriding toString method
    return "Person{" +
        "name='" + name + '\'' +
        '}';
  }
}
/*
In the above example, we have a Person class that represents a person. The Person class has two constructors, one is a default constructor and another is a parameterized constructor. The Person class also has a getter and setter method for the name field.

In the UsingConstructorReferenceExample class, we have a main method. In the main method, we have a list of names.
We are creating a stream of names using the stream method. Then we are using the map method to create a person object for each name using the Person constructor reference.
Finally, we are printing each person object using the forEach method.

Last time we used lambda expression to create a person object. This time we are using constructor reference to create a person object.
The constructor reference is a shorthand syntax for creating an object using a constructor. In the map method, we are
 passing the Person::new, which is a constructor reference to the Person class parameterized constructor.
The Person::new is equivalent to the lambda expression name -> new Person(name). The constructor reference is more concise and readable than the lambda expression.
* */