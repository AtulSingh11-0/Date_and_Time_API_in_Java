package org.LambdaExpressions.UsingWithComparators;

import java.util.Arrays;

/*
This program demonstrates how to sort objects using lambda expressions both in ascending and descending order.
* */
public class SortingObjects {
  public static void main ( String[] args ) {
    Student[] students = new Student[5];
    students[0] = new Student(1, "John", 20);
    students[1] = new Student(2, "Steve", 19);
    students[2] = new Student(3, "Lucy", 18);
    students[3] = new Student(4, "Patrick", 21);
    students[4] = new Student(5, "Angela", 22);

    Arrays.sort(students, (a, b) -> b.age - a.age);

    for ( Student s : students ) {
      System.out.println(s);
    }
  }

  // Student class
  static class Student {
    int rollNo;
    String name;
    int age;

    // default constructor
    public Student () {
      rollNo = age = 0;
      name = "";
    }

    // parameterized constructor
    public Student ( int rollNo, String name, int age) {
      this.rollNo = rollNo;
      this.name = name;
      this.age = age;
    }

    // toString() method
    @Override
    public String toString () {
      return "[" +
          rollNo +
          ", " +
          name +
          ", " +
          age +
          "]";
    }
  }
}
/*
In the above example, we have created a Student class with three fields: rollNo, name, and age. We have created an
array of Student objects and initialized the array with five Student objects. We have used the Arrays.sort() method
to sort the Student objects in different orders we want it to be sorted i.e. in ascending or descending order.

We have used a lambda expression to provide the implementation of the compare() method of the Comparator interface.
The lambda expression compares the Student objects. The Arrays.sort() method sorts the Student objects in the order
provided.

for ASCENDING order:
* 1. by rollNo: Arrays.sort(students, (a, b) -> a.rollNo - b.rollNo);
* 2. by name: Arrays.sort(students, (a, b) -> a.name.compareTo(b.name));
* 3. by age: Arrays.sort(students, (a, b) -> a.age - b.age);

for DESCENDING order:
* 1. by rollNo: Arrays.sort(students, (a, b) -> b.rollNo - a.rollNo);
* 2. by name: Arrays.sort(students, (a, b) -> b.name.compareTo(a.name));
* 3. by age: Arrays.sort(students, (a, b) -> b.age - a.age);

The Arrays.sort() method sorts the Student objects in ascending or descending order based on the lambda expression we have provided.
* */