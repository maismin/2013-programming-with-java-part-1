import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int idxOfSmallest = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[idxOfSmallest]) {
                idxOfSmallest = i;
            }
        }
        
        return idxOfSmallest;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        if (index > array.length) {
            return -1;
        }
        
        int idxOfSmallest = index;
        for (int i = index+1; i < array.length; i++) {
            if (array[i] < array[idxOfSmallest]) {
                idxOfSmallest = i;
            }
        }
        return idxOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int idxOfSmallest = indexOfTheSmallestStartingFrom(array, i);
            if (idxOfSmallest != i) {
                swap(array, idxOfSmallest, i);
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
