package day15arrays;

import java.util.Arrays;

public class FillMethod {

    public static void main(String[] args) {


        int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};

        // To fill complete array with a particular
        // value

        Arrays.fill(ar,3,6,5);
        System.out.println("Array part of filled" + " with 5\n" + Arrays.toString(ar));
        Arrays.fill(ar, 10);
        System.out.println("Array completely filled" + " with 10\n" + Arrays.toString(ar));

        // Fill 2D Array

        int [][]arr = new int [3][4];

        // Fill each row with 10.
        for (int[] row : arr)
            Arrays.fill(row, 8);

        System.out.println(Arrays.deepToString(arr));



    }
}
