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

//compiler directive to eliminate superfluous warnings.
@SuppressWarnings("unchecked")

public class ListClient3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        processList(list1);
        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        processList(list2);
    }

    public static void processList(List list) {
        list.add(42);
        list.add(18);
        list.add(27);
        list.add(2,93);
        System.out.println(list);
        list.remove(2);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        
    }
}
