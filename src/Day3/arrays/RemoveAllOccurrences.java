package Day3.arrays;

import java.util.ArrayList;

public class RemoveAllOccurrences {
    public static int removeElement(ArrayList<Integer> arr, int ele) {
        int k = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)!= ele) {
                swap(arr, k, i);
                k++;
            }
        }
        return k;
    }

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(3);
        arr.add(0);
        arr.add(2);
        arr.add(2);
        arr.add(4);
        arr.add(2);
        int ele = 2;
        System.out.println(removeElement(arr, ele));
    }
}
