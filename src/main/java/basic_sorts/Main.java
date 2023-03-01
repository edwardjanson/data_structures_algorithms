package basic_sorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayToSort = {2, 6, 9, 12, 7};

        Sort.bubbleSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }
}
