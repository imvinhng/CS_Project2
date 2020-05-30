/*
*  CS211, Spring 2020
*  Jae Choi, Alex Larsen, Sean Michael, Vinh Nguyen
*  5/18/2020
*  Team Project 2
*/

// This is a test client for the abstract list class methods.

import java.util.*;

//compiler directive to eliminate superfluous warnings.
@SuppressWarnings("unchecked")

public class AbstractListClient {
   public static void main(String[] args) {
      ArrayList<Integer> list1 = new ArrayList<Integer>();
      LinkedList<Integer> list2 = new LinkedList<Integer>();
      Random rand = new Random();
      int index = rand.nextInt(5);
      int value = rand.nextInt(10);
      
      processList(list1);
      processList(list2);
      
      // toString test
      System.out.println("Array list: " + list1.toString());
      System.out.println("Linked List: " + list2.toString());
      System.out.println();
      // size test
      System.out.println("Array list size: " + list1.size());
      System.out.println("Linked list size: " + list2.size());
      System.out.println();
      // get test
      System.out.println("Getting value at array list position " + index + ": " + list1.get(index));
      System.out.println("Getting value at linked list position " + index + ": " + list2.get(index));
      System.out.println();
      // contains test
      System.out.println("Array list contains " + value + ": " + list1.contains(value));
      System.out.println("Linked list contains " + value + ": " + list2.contains(value));
      System.out.println();
      // indexOf test
      System.out.println("Index of " + value + " in array list: " + list1.indexOf(value));
      System.out.println("Index of " + value + " in linked list: " + list2.indexOf(value));
      System.out.println();
      // isEmpty test
      System.out.println("Array list is empty: " + list1.isEmpty());
      System.out.println("Linked list is empty: " + list2.isEmpty());
      System.out.println();
      // add test
      index = rand.nextInt(5);
      value = rand.nextInt(10);
      System.out.println("Adding " + value + " to position " + index + " in array list: ");
      list1.add(index, value);
      System.out.println(list1.toString());
      index = rand.nextInt(5);
      value = rand.nextInt(10);
      System.out.println("Adding " + value + " to position " + index + " in linked list: ");
      list2.add(index, value);
      System.out.println(list2.toString());
      System.out.println();
      // remove test
      index = rand.nextInt(5);
      System.out.println("Removing from position " + index + " in array list: ");
      list1.remove(index);
      System.out.println(list1.toString());
      index = rand.nextInt(5);
      System.out.println("Removing from position " + index + " in linked list: ");
      list2.remove(index);
      System.out.println(list2.toString());
      System.out.println();
      // set test
      index = rand.nextInt(5);
      value = rand.nextInt(10);
      System.out.println("Setting value in position " + index + " to " + value + " in array list: ");
      list1.set(index, value);
      System.out.println(list1.toString());
      index = rand.nextInt(5);
      value = rand.nextInt(10);
      System.out.println("Setting value in position " + index + " to " + value + " in linked list: ");
      list2.set(index, value);
      System.out.println(list2.toString());
      System.out.println();
      // clear test
      System.out.println("Clearing array list: ");
      list1.clear();
      System.out.println("Array list: " + list1.toString());
      System.out.println("Linked List: " + list2.toString());
      System.out.println("Array list is empty: " + list1.isEmpty());
      System.out.println("Linked list is empty: " + list2.isEmpty());
      System.out.println();
      // addAll test
      System.out.println("Adding values from linked list to array list: ");
      list1.addAll(list2);
      System.out.println("Array list: " + list1.toString());
      System.out.println("Linked List: " + list2.toString());
      System.out.println();
      
   
   }
   
   // modified processList for more convenient testing
   // now creates a list of 10 random values
   public static void processList(List list) {
      
      // add test
      Random rand = new Random();
      for (int i = 0; i < 5; i++) {
         list.add(rand.nextInt(10)); // random list test
         //list.add(i);              // constant list test
      }
      
      /*list.add(42);
      list.add(18);
      list.add(27);
      list.add(93);
      System.out.println(list);
      list.remove(2);
      list.remove(0);
      System.out.println(list);*/
   }
}
