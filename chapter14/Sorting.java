package chapter14;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sorting {

    private static void swap(ArrayList<Comparable> list, int i, int j) {
        Comparable tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
    
    // Comparable
    // o1.compareTo(o2) ... returns -1 if o1 is "less than" o2
    // o1.compareTo(o2) ... returns 0 if o1 is "equal to" o2
    // o1.compareTo(o2) ... returns 1 if o1 is "greater than" o2
    // destructive method (i.e, it modifies the original list)
    public static void selectionSort(ArrayList<Comparable> list) {

        // some optimisations
        if (list.size() < 2) {
            return;
        }
        
        if (!(list.get(0) instanceof Comparable)) {
            // unsorted
            return;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            Comparable smallest = (Comparable) list.get(i);
            int smallesti = i;
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j).compareTo(smallest) < 0) {
                    smallest = (Comparable) list.get(j);
                    smallesti = j;
                }
            }
            swap(list, i, smallesti);
        }

        public static void insertionSort(ArrayList<Comparable> list) {
            for (int i = 1; i < list.size(); i++) {
                Comparable key = list.get(i);
                int j = i - 1;
                while (j >= 0 && list.get(j).compareTo(key) > 0) {
                    list.set(j + 1, list.get(j));
                    j--;
                }
                list.set(j + 1, key);
            }
    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(3);
        test.add(8);
        test.add(1);
        System.out.println(test);
        insertionSort(test);
        System.out.println(test);
    }
}
