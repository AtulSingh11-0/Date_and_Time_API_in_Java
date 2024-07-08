package org.LambdaExpressions.LambdaExpressionVsAnonymousInnerClass;

/*
* Java program to demonstrate local and instance variables in lambda expressions
* */
@FunctionalInterface
interface Employee {
  String getRole ();
}

public class LocalAndInstanceExamples {
  private final String role = "SDE-3";
  public static void main ( String[] args ) {
    // implementing the interface using anonymous inner-class
    Employee employee1 = new Employee() {
      private final String role = "SDE-4"; // This will give an error as we can't declare instance variables in anonymous inner-class

      @Override
      public String getRole () {
        // System.out.println(role); // This will give an error as we can't access instance variables in anonymous inner-class

        // we can access instance variables of the anonymous inner-class using 'this' keyword as shown below
        System.out.println("Instance variable from anonymous inner-class: " + this.role);

        return "SDE-1";
      }
    };
    System.out.println("From anonymous inner-class: " + employee1.getRole());

    // implementing the interface using lambda expression
    Employee employee2 = () -> {
      String role = "SDE-5"; // This is a local variable

      /*
      * we can't access instance variables of the class using 'this' keyword in lambda expressions.
      * we can create a local variable within the scope of lambda expression and access it.
      * */
      System.out.println("Local variable from lambda expression: " + role);
      return "SDE-2";
    };
    System.out.println("From lambda expression: " + employee2.getRole());

    System.out.println("Instance variable: " + new LocalAndInstanceExamples().role);
  }
}
/*
From above example, we can see that we can't declare instance variables in anonymous inner-class, but we can declare
local variables. We can access instance variables of the anonymous inner-class using 'this' keyword. But in lambda
expressions, we can't access instance variables of the class using 'this' keyword. We can create a local variable
within the scope of lambda expression and access it.
* */