package org.example.function;

import java.util.List;
import java.util.function.Function;

/*
* This class demonstrates the use of the andThen method of the Function interface.
* */
public class UsingAndThenExample {
  public static void main ( String[] args ) {

    // Function to check if a student is an adult
    Function<Student, Student> isAdult = student -> {
      if (student.age >= 18)
        return student;
      return null;
    };

    // Function to get the name of the student
    Function<Student, String> name = student -> {
      if ( student == null )
        return "Student is not an adult";
      return student.name;
    };

    // List of students to check if they are adults and get their names
    List<Student> students = List.of(
        new Student(1, "Alice", 20),
        new Student(2, "Bob", 15),
        new Student(3, "Charlie", 25),
        new Student(4, "David", 30),
        new Student(5, "Eve", 10),
        new Student(6, "Frank", 18),
        new Student(7, "Grace", 22),
        new Student(8, "Helen", 16),
        new Student(9, "Ivy", 21)
    );

    // Check if the students are adults and get their names
    students.forEach(student -> {
      System.out.println(isAdult.andThen(name).apply(student));
    });
  }

  // Student class
  private static class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Student () {
      id = age = 0;
      name = "";
    }

    public Student ( Integer id, String name, Integer age ) {
      this.id = id;
      this.name = name;
      this.age = age;
    }

    public Integer getId () {
      return id;
    }

    public String getName () {
      return name;
    }

    public Integer getAge () {
      return age;
    }

    public void setId ( Integer id ) {
      this.id = id;
    }

    public void setName ( String name ) {
      this.name = name;
    }

    public void setAge ( Integer age ) {
      this.age = age;
    }

    @Override
    public String toString () {
      return "Student{"
          + "id=" + id
          + ", name=" + name
          + ", age=" + age
          + "}";
    }
  }
}
/*
In the above example, we learned how to use the andThen method of the Function interface.
We have created two functions isAdult and name to check if a student is an adult and get the name of the student respectively.
Then we have used the andThen method to combine the two functions to check if a student is an adult and get the name of the student.
We have tested the combined function with a list of students to check if they are adults and get their names.

The andThen method is a default method of the Function interface and can be called directly using the Function interface.
The andThen method returns a composed function that first applies the current function and then applies the after function.
The andThen method is useful when we want to apply two functions in sequence.

In certain cases, we can also apply the second function first and then apply the first function.
for eg:
Function<Student, String> isAdult = student -> {
  if (student.age >= 18)
    return student.name;
  return student.name + " is not an adult";
};
Function<Student, Student> name = student -> {
  if ( student == null )
    return new Student();
  return student;
};
students.forEach(student -> {
  System.out.println(name.andThen(isAdult).apply(student));
});
In the above example, we have applied the isAdult function first and then the name function.
We could have also done it simply by using the compose method of the Function interface.
* */
