package FunctionalInterface;

interface staticInterface {
  public static void main ( String[] args ) {
    System.out.println("Main method in interface");
  }
  static void display() {
    System.out.println("Static method in interface");
  }
}

public class StaticMethodExample implements staticInterface {
  public static void main ( String[] args ) {
    staticInterface.main(new String[0]);
  }
//  public static void main(String[] args) {
//    staticInterface.display();
//  }
}

/*
To use a static method in an interface, we need to call it using the interface name, If we try to call it using the implementing class name, it will give a compile-time error.
Also, if we try to override the static method in the implementing class, it will give a compile-time error, but we
can still call the static method using the interface name or create our own static method in the implementing class with
the same name as the static method in the interface, and it will work fine without any error.

We can also create the main method in the interface and run it directly, and it will work fine without any error.
and if we try to create the main method in the implementing class and run it, it will work fine without any error.

* */