package day15arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class asListMethod {

    public static void main(String[] args) {

        /*
            Using this method, we can convert from an array to a fixed-size List object.
            This List is just a wrapper that makes the array available as a list. No data is copied or created.
            Also, we can't modify its length because adding or removing elements is not allowed.

         */

        String[] stringArray = new String[]{"A", "B", "C", "D"};
        List<String> stringList = Arrays.asList(stringArray);
        System.out.println("stringList = " + stringList);

        stringList.set(0,"E");
        // As we can see, our original array was modified, too.
        // Both the list and the array now contain exactly the same elements in the same order.
        System.out.println("stringList = " + stringList);
        System.out.println("stringArray = " + Arrays.toString(stringArray));

        //stringList.add("F");
        // adding/removing elements to/from the List will throw java.lang.UnsupportedOperationException.

        //we can use ArrayList<>(Arrays.asList(array)) when we need to create a List out of an array.
        // unlike our previous example, this is an independent copy of the array,
        // which means that modifying the new list won't affect the original array.
        // Additionally, we have all the capabilities of a regular ArrayList,
        // like adding and removing elements:

        String[] arr=new String[]{"A", "B", "C", "D"};
        List<String> list=new ArrayList<>(Arrays.asList(arr));

        // Now let's modify the first element of stringList:
        list.set(1,"K");
        System.out.println("list = " + list);
        System.out.println("arr = " + Arrays.toString(arr));  //  we can see, our original array remains untouched.



    }    
}
