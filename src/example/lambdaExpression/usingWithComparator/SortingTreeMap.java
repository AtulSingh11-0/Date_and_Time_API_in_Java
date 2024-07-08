package org.example.lambdaExpression.usingWithComparator;

import java.util.Map;
import java.util.TreeMap;

public class SortingTreeMap {
  public static void main ( String[] args ) {
    Map<Integer, String> map = new TreeMap<>( (a, b) -> b.compareTo(a));
    map.put(1, "Zebra");
    map.put(2, "Lion");
    map.put(3, "Antler");
    map.put(4, "Tiger");
    map.put(5, "Elephant");

    System.out.println(map);
  }
}
/*
Here, we have created a TreeMap object and passed a lambda expression to the constructor of the TreeMap class. The
lambda expression provides the implementation of the compare() method of the Comparator interface which sorts the
TreeMap elements in descending order.
* */
