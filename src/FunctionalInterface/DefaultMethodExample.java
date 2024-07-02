package FunctionalInterface;

public interface DefaultMethodExample {
  default void display() {
    System.out.println("Default method in interface");
  }
}

class Main implements DefaultMethodExample {
  public static void main ( String[] args ) {
    Main obj = new Main();
    obj.display();
  }
}

/*
Default methods in interface can be accessed by the implementing class, or they can be overridden by the implementing class.

for example:
public interface DefaultMethodExample {
  default void display() {
  }
}

class Main implements DefaultMethodExample {
  public static void main ( String[] args ) {
    Main obj = new Main();
    obj.display();
  }
  @Override
  default void display() {
    System.out.println("Overridden default method in interface");
  }
}

In the above example we have overridden the default method display() in the implementing class Main.


* */