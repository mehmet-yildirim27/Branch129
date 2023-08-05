package day15arrays;

import java.util.Arrays;

public class MissmatchMethod {

    public static void main(String[] args) {

        /*
            We are given two arrays, array1 = {2 , 6 , 1 , 10} and array2 = {2 , 6 , 11 , 12} and
            we want to find the index at which array1 and array2 have first unequal element.
            As the first two indices have the same set of corresponding elements so the index is 2.
         */

        // Syntax: Arrays.mismatch(first_array, second_array);
        // Return value: 1. -1: If both the arrays have same elements at all the corresponding positions.
        // 2. non-negative integer: The index at which both the arrays have first unequal elements.

        // Initializing an integer array
        int array1[] = { 2, 7, 11, 22, 37 };

        // Initializing another array
        int array2[] = { 2, 7, 11, 22, 37 };

        // Initializing another array
        int array3[] = { 2, 7, 19, 31, 39, 56 };

        // Return the first index at which array1
        // array2 have the different element
        int index1 = Arrays.mismatch(array1, array2);

        // Return the first index at which array1
        // array3 have the different element
        int index2 = Arrays.mismatch(array1, array3);

        // Return the first index at which array2
        // array3 have the different element
        int index3 = Arrays.mismatch(array2, array3);

        // Print the first index at which array1
        // array2 have the different element
        System.out.println("The index at which array1 and array2 have first unequal element: " + index1);

        // Print the first index at which array1
        // array3 have the different element
        System.out.println("The index at which array1 and array3 have first unequal element: " + index2);

        // Print the first index at which array2
        // array3 have the different element
        System.out.println("The index at which array2 and array3 have first unequal element: " + index3);


    }
}
