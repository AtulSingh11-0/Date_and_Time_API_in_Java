package org.example.functionalInterface;

interface A {
  default void show() {
    System.out.println("A");
  }
}

interface B {
  default void show() {
    System.out.println("B");
  }
}

public class TrickyQuestion implements A, B {
  public static void main(String[] args) {
    TrickyQuestion trickyQuestion = new TrickyQuestion();
    trickyQuestion.show();
  }

  @Override
  public void show() {
    A.super.show();
  }
}

/*
public class TrickyQuestion implements A, B {
  public static void main(String[] args) {
    TrickyQuestion trickyQuestion = new TrickyQuestion();
    trickyQuestion.show();
  }
}
If we run the code, it will throw a compile-time error because the class TrickyQuestion inherits two default methods with the same name show() from two interfaces A and B.
To resolve this issue, we need to override the show() method in the TrickyQuestion class.
this can be done by adding the following code in the TrickyQuestion class:

@Override
public void show() {
  A.super.show();
}
OR
@Override
public void show() {
  B.super.show();
}

We can also provide our own implementation of the show() method in the TrickyQuestion class instead of calling the super method.
* */