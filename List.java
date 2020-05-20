/*
 * ==========================================
 * CS211, Spring 2020, 5/10
 * Vinh Nguyen , Jae Choi, Alexander Larsen, Sean Micheal
 * Team Project #2 - Chap 16, page 1027 Programming Project #3
 * Create an abstract AbstractList superclass that is extended by 
 * both ArrayList and LinkedList, which factor out the common 
 * methods/functionality of the two classes
 * 
 * 
 * 
 * ==========================================
 */

// Generic interface for a List of E objects.
// Change this interface into an abstract class
// which is then extended by both ArrayList and LinkedList

public interface List<E> extends Iterable<E> {  
    public int size();
    public E get(int index);
    public int indexOf(E value);
    public boolean isEmpty();
    public boolean contains(E value);
    public void add(E value);
    public void add(int index, E value);
    public void addAll(List<E> other);
    public void remove(int index);
    public void set(int index, E value);
    public void clear();
}
