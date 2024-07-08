package org.LambdaExpressions.UsingWithComparators;

import java.util.Set;
import java.util.TreeSet;

public class SortingTreeSet {
  public static void main ( String[] args ) {
    Set<String> set = new TreeSet<>((a, b) -> b.compareTo(a));
    set.add("A");
    set.add("Z");
    set.add("W");
    set.add("U");
    set.add("P");

    System.out.println(set);
  }
}
/*
Here, we have created a TreeSet object and passed a lambda expression to the constructor of the TreeSet class. The
lambda expression provides the implementation of the compare() method of the Comparator interface which sorts the
TreeSet elements in descending order.
* */