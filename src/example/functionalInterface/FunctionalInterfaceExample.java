package org.example.functionalInterface;

/*
* A functional interface is an interface with only one abstract method. It can have any number of default and static
* methods.
* */
@FunctionalInterface
public interface FunctionalInterfaceExample {
  public void greet ();

  default void sayNamaste () {
    System.out.println("Namaste!");
  }

  static void sayHola () {
    System.out.println("Hola!");
  }

}

/*
@FunctionalInterface
public interface FunctionalInterfaceExample {
  public void greet ();
}
in the above example, we have created a functional interface with a single abstract method greet().
if we try to add another abstract method to the interface, it will throw a compilation error.

for example:
@FunctionalInterface
public interface FunctionalInterfaceExample {
  public void greet ();
  public void greetAgain ();
}
will throw a compilation error.


@FunctionalInterface
public interface FunctionalInterfaceExample {
  public void greet ();
  default void sayNamaste () {
    System.out.println("Namaste!");
  }
  static void sayHola () {
    System.out.println("Hola!");
  }
}
in the above example, we have added a default method sayNamaste() and a static method sayHola() to the interface.
This is a valid functional interface, since it has only one abstract method greet() and any number of default and
static methods.
* */