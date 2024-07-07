package DateAndTimeAPI.Suppliers;

import java.util.function.Supplier;

/*
* This class demonstrates the use of the get method of the Supplier interface.
* */
public class UsingSupplierExample {
  public static void main ( String[] args ) {
    // Supplier to print "Hello, World!"
    Supplier<String> print = () -> "Hello, World!";
    // Print "Hello, World!"
    System.out.println(print.get());
  }
}
/*
In the above example, we learned how to use the get method of the Supplier interface.
We have created a supplier print to print "Hello, World!". We have used the get method to get the result from the supplier.

The get method is a default method of the Supplier interface and can be called directly using the Supplier interface.
The get method returns the result of the supplier.
The get method is useful when we want to get the result from the supplier.
* */