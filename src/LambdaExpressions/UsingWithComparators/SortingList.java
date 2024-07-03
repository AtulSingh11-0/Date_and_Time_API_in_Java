package DateAndTimeAPI.LambdaExpressions.UsingWithComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
  public static void main ( String[] args ) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("Z");
    list.add("W");
    list.add("U");

    Collections.sort(list, (a, b) -> b.compareTo(a));
    System.out.println(list);
  }
}
/*
Collections.sort(list);
The sort() method of the Collections class is used to sort the elements of the list in ascending order.
if we want to sort the elements of the list in descending order, we can use the sort() method of the Collections
class with the help of a lambda expression by passing the implementation of the compare() method of the Comparator

for example:
Collections.sort(list, (a, b) -> b.compareTo(a)); OR Collections.sort(list, (a, b) -> b - a);
* */