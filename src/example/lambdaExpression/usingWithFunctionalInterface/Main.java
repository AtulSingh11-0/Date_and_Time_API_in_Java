package org.example.lambdaExpression.usingWithFunctionalInterface;

/*
* Implementing Lambda Expression with Functional Interface
* */
public class Main {
  public static void main ( String[] args ) {
    // printing name of dog using lambda expression with functional interface.
    Animal dog = () -> System.out.println("Dog");
    dog.name();

    // printing name of cat using lambda expression with functional interface.
    Animal cat = () -> System.out.println("Cat");
    cat.name();

    // printing name of lion using lambda expression with functional interface.
    Animal lion = () -> System.out.println("Lion");
    lion.name();
  }
}
/*
To use lambda expression with functional interface, we need to provide the implementation of the abstract method of
the functional interface, and we don't need to provide the name of the method. The compiler automatically detects it.

Previously, we had to create an anonymous class to provide the implementation of the abstract method of the
functional interface.

In the above example, we have created a lambda expression for the Animal interface. We have provided the
implementation of the name() method of the Animal interface using a lambda expression.

But to use lambda expression with a functional interface, the functional interface must contain only one abstract method.
If we try to use lambda expression with a functional interface that contains more than one abstract method, it will
create a compile-time error.
* */