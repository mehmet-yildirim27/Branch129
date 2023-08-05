package day15arrays;

import java.util.Arrays;

public class copyOfMethod {

    public static void main(String[] args) {

        // intializing an array arr1
        int[] arr1 = new int[] {45, 32, 75};

        // printing the array
        System.out.println("Printing 1st array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // copying array arr1 to arr2 with newlength as 5
        int[] arr2 = Arrays.copyOf(arr1, 5);
//        arr2[3] = 11;
//        arr2[4] = 55;

        // printing the array arr2
        System.out.println("Printing new array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        arr2[0]=5;      // iki array birbirinden bagimsiz

        System.out.println("arr1 = " + Arrays.toString(arr1));

        System.out.println("arr2 = " + Arrays.toString(arr2));

        // copyOfRange()

        // intializing an array arr1
        short[] arr3 = new short[] {15, 10, 45};
        // copying array arr1 to arr2 with range of index from 1 to 3
        short[] arr4 = Arrays.copyOfRange(arr3, 1, 3);

        System.out.println("arr4 = " + Arrays.toString(arr4));      // arr4 = [10, 45]
        System.out.println("arr3 = " + Arrays.toString(arr3));      // arr3 = [15, 10, 45]


    }
}
