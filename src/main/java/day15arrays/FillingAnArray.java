package day15arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FillingAnArray {

    public static void main(String[] args) {

        // 1. Using for loop to fill the value

        int[] arr1=new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=i+1;
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));

        // 2: Declare them at the time of the creation

        int[] arr2=new int[]{1,2,3,4,5,6,7,8,9,10};
        // int[] arr2={1,2,3,4,5,6,7,8,9,10};       // her ikisi de ayni

        System.out.println("arr2 = " + Arrays.toString(arr2));

        //  3: Using Arrays.fill()

        // Empty Array Declaration
        int array[] = new int[10];

        // Filling the data
        Arrays.fill(array, 10);

        // Printing the data
        System.out.println("Array completely filled with 10\n" + Arrays.toString(array));

        //  4: Using Arrays.copyOf()

        // initializing an array original
        int[] org = new int[] {1, 2 ,3};

        // copying array org to copy
        // Here, new array has 5 elements - two
        // elements more than the original array
        int[] copy = Arrays.copyOf(org, 5);

        System.out.println("copy = " + Arrays.toString(copy));
        System.out.println("org = " + Arrays.toString(org));

        //  5: Using Arrays.setAll()

        // initializing an array
        int[] array1 = new int[10];

        // Setting the value in the array
        Arrays.setAll(array1, p -> p > 5 ? 1 : p);

        System.out.println("Array completely filled: \n"
                + Arrays.toString(array1));

        int arr[] = new int[10];
        Arrays.setAll(arr, (index)-> index*index);
        for(int num:arr)
        {
            System.out.print(num+" ");

            //  6: Using ArrayUtils.clone()

            // Creating an empty ArrayList
            ArrayList<String> list = new ArrayList<String>();

            // Use add() method
            // to add elements in the list
            list.add("Geeks");
            list.add("for");
            list.add("Geeks");
            list.add("10");
            list.add("20");

            // Displaying the list
            System.out.println("First ArrayList: " + list);

            // Creating another linked list and copying
            ArrayList sec_list = new ArrayList();
            sec_list = (ArrayList)list.clone();

            // Displaying the other linked list
            System.out.println("Second ArrayList is: " + sec_list);

            sec_list.set(0,"ali");

            System.out.println("list = " + list);
            System.out.println("sec_list = " + sec_list);
        }






    }
}
