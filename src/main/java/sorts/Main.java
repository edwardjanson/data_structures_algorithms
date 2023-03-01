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
        int[] arraySorted = MergeSort.merge(array1, array2);
        System.out.println(Arrays.toString(arraySorted));

        int[] mergeSortArray = {3, 8, 4, 12, 9};
        int[] arraySorted2 = MergeSort.mergeSort(mergeSortArray);
        System.out.println(Arrays.toString(arraySorted2));

        int[] array3 = {4, 6, 1, 7, 3, 2, 5};
        int returnedIndex = QuickSort.pivot(array3, 0, 6);
        System.out.println("Returned Index: " + returnedIndex);
        System.out.println(Arrays.toString(array3));

        int[] array4 = {4, 6, 1, 7, 3, 2, 5};
        QuickSort.quickSort(array4);
        System.out.println(Arrays.toString(array4));
    }
}
