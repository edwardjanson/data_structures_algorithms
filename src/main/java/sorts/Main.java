package sorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] bubbleArray = {2, 6, 9, 12, 7};
        Sort.bubbleSort(bubbleArray);
        System.out.println(Arrays.toString(bubbleArray));

        int[] selectionArray = {2, 6, 9, 12, 7};
        Sort.selectionSort(selectionArray);
        System.out.println(Arrays.toString(selectionArray));

        int[] insertionArray = {2, 6, 9, 12, 7};
        Sort.insertionSort(insertionArray);
        System.out.println(Arrays.toString(insertionArray));

        int[] array1 = {2, 6, 9, 10, 12};
        int[] array2 = {4, 5, 8, 11, 15};
        int[] arraySorted = Sort.merge(array1, array2);
        System.out.println(Arrays.toString(arraySorted));
    }
}
