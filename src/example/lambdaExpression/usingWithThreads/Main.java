package org.example.lambdaExpression.usingWithThreads;

/*
* We can use lambda expression with threads. We can provide the implementation of the run() method of the Runnable
* */
public class Main {
  public static void main ( String[] args ) {
    // creating a child thread using lambda expression.
    Runnable thread = () -> {
      for ( int i = 1; i <= 10; i++ ) {
        System.out.println("Child Thread: " + i);
      }
    };
    // creating a child thread.
    Thread childThread = new Thread(thread);
    childThread.run();

    // creating the main thread.
    for ( int i = 1; i <= 10; i++ ) {
      System.out.println("Main Thread: " + i);
    }
  }
}
/*
In the above example, we have created a lambda expression for the Runnable interface. We have provided the
implementation of the run() method of the Runnable interface using a lambda expression. We have created a child
thread using the lambda expression and started it. The child thread will execute the run() method of the Runnable
interface. The main thread will execute the main() method of the Main class. The child thread and the main thread
will execute concurrently.

Previously, we had to create an anonymous class to provide the implementation of the run() method of the Runnable
interface. But now, we can provide the implementation of the run() method of the Runnable interface using a lambda
expression. We don't need to create an anonymous class anymore.
* */