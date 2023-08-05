package day15arrays;

import java.util.Arrays;

public class CompareMethod {

    public static void main(String[] args) {

      /*
        This method compares two arrays lexicographically (Dictionary order).
        It returns 0 if the array is equal to the other array.
        It returns a value less than 0 is returned if the array is lexicographically  less than the other array in
        It returns a value greater than 0 if the array is lexicographically greater than the other array (more characters).
        A null array is lexicographically less than a non-null array, and the two arrays are considered equal if both are null so that it will print 0 in this case.

        Syntax:

        Arrays.compare(array1,array2);
        // array1 and array2 are two arrays
        Parameters and Return Type: The method compare() accepts an array as parameters with different data types example: string, integer, float, double, long, etc. The return type of this method is an integer. It returns a positive value if the array is lexicographically greater, negative if it is lesser, and 0 if equal.

        Exceptions: It usually throws NullPointerException and ClassCastException, and both of these exceptions have different means too.

        NullPointerException: The NullPointerException is a runtime exception that refers to null and occurs when a variable is accessed that does not point to any object.
        ClassCastException: This exception occurs when we’re trying to convert one class object into another class-type object
       */

        //Initialized two integer array
//        int[] array1 ={3, 2, 8, 11, 18, 8, 2, 5};
//        int[] array2 ={3, 5, 9, 13, 28, 6, 8, 9};
//        //compare both integer array using compare method and finally print result
//        System.out.println("Result is "+ Arrays.compare(array1,array2));
//
//
//        // Initialize two float array with element
//        float[] floatArray1={5.12f, 8.3f, 9.17f, 2.5f, 8.8f, 5.17f, 4.2f, 7.37f};
//        float[] floatArray2={7.12f, 9.3f, 6.17f, 7.5f, 5.8f, 7.17f, 3.2f, 6.37f};
//
//        // compare two float array using compare method and finally print result
//        System.out.println("Result is " + Arrays.compare(floatArray1, floatArray2));
//
//        // Initialize two integer array with same elements
//        int[] array3 = { 1, 2, 3, 4 };
//        int[] array4 = { 1, 2, 3, 4 };
//
//        // compare array1 and array2 using compare() method
//        // and print the result
//        System.out.println("Result is " + Arrays.compare(array3, array4));

        //  the compare() Method with slicing
        int arr1[]={19,15,3,12,16,48,14,7,88,54};
        int arr2[]={19,15,3,12,16,48,14,7,88,54};
        System.out.println(Arrays.compare(arr1,2,5,arr2,2,5));

        //Example of static int	compare(boolean[] a, boolean[] b)
        boolean[] boolArray1={true, false, true, false, true, true};
        boolean[] boolArray2={false, true, false, true, false, true};
        System.out.println("Arrays.compare(boolArray1, boolArray2): "+Arrays.compare(boolArray1, boolArray2));

        //Example static int compare(boolean[] a, int aFromIndex,int aToIndex, boolean[] b, int bFromIndex, int bToIndex)
        System.out.println("Arrays.compare(boolArray1, 2 , 4, boolArray2, 3, 5): "+Arrays.compare(boolArray1, 2, 4, boolArray2, 3, 5));

        //Example of static int compare(byte[] a, byte[] b)
        byte[] byteArray1={4, 1, 8, 2, 2, 3, 16, 4, 4};
        byte[] byteArray2={7, 9, 4, 12, 9, 7, 2, 14, 8};
        System.out.println("Arrays.compare(byteArray1, byteArray2): "+Arrays.compare(byteArray1, byteArray2));

        //Example static int compare(byte[] a, int aFromIndex, int aToIndex, byte[] b, int bFromIndex, int bToIndex)
        System.out.println("Arrays.compare(byteArray1, 2, 4, byteArray2, 3, 5): "+Arrays.compare(byteArray1, 2, 4, byteArray2, 3, 5));


        //Example of static int compare(char[] a, char[] b)
        char[] charAarray1={'a', 'e', 'i', 'o', 'u'};
        char[] charAarray2={'a', 'e', 'i', 'o', 'u'};
        System.out.println("Arrays.compare(charAarray1, byteArray2): "+Arrays.compare(charAarray1, charAarray2));

        //Example static int compare(char[] a, int aFromIndex,int aToIndex, char[] b, int bFromIndex, int bToIndex)
        System.out.println("Arrays.compare(charAarray1, 2, 4, charAarray2, 3, 5): "+Arrays.compare(charAarray1, 2, 4, charAarray2, 3, 5));


        //Example of static int compare(double[] a, double[] b)
        double[] doubleArray1={12, 3, 17, 5, 8, 17, 2, 37};
        double[] doubleArray2={4, 7, 2, 5, 8, 12, 2, 50};
        System.out.println("Arrays.compare(doubleArray1, doubleArray2): "+Arrays.compare(doubleArray1, doubleArray2));

        //Example static int compare(double[] a, int aFromIndex, int aToIndex, double[] b, int bFromIndex, int bToIndex)
        System.out.println("Arrays.compare(doubleArray1, 1, 5, doubleArray2, 3, 5): "+Arrays.compare(doubleArray1, 1, 5, doubleArray2, 3, 5));

        //Example of static int compare(float[] a, float[] b)
        float[] floatArray1={4.12f, 7.3f, 8.17f, 1.5f, 7.8f, 4.17f, 3.2f, 6.37f};
        float[] floatArray2={6.12f, 8.3f, 5.17f, 6.5f, 4.8f, 6.17f, 2.2f, 5.37f};
        System.out.println("Arrays.compare(floatArray1, floatArray2): "+Arrays.compare(floatArray1, floatArray2));

        //Example static int compare(float[] a, int aFromIndex,int aToIndex, float[] b, int bFromIndex, int bToIndex)
        System.out.println("Arrays.compare(floatArray1, 2, 6, floatArray2, 3, 5): "+Arrays.compare(floatArray1, 2, 6, floatArray2, 3, 5));

        //Example of static int compare(int[] a, int[] b)
        int[] intArray1 ={5, 6, 7, 10, 17, 7, 1, 4};
        int[] intArray2 ={2, 4, 8, 12, 27, 5, 7, 8};
        System.out.println("Arrays.compare(intArray1, intArray2): "+Arrays.compare(intArray1, intArray2));

        //Example static int compare(int[] a, int aFromIndex,int aToIndex, int[] b, int bFromIndex, int bToIndex)
        System.out.println("Arrays.compare(intArray1, 1, 5, intArray2, 0, 4): "+Arrays.compare(intArray1, 1, 5, intArray2, 0, 4));

        //Example of static int compare(long[] a, long[] b)
        long[] longArray1={4,54,56,17,51,84,5,28,33,9};
        long[] longArray2={3,4,16,4,51,12,5,28,8,19};
        System.out.println("Arrays.compare(longArray1, longArray2): "+Arrays.compare(longArray1, longArray2));

        //Example static int compare(long[] a, int aFromIndex,int aToIndex, long[] b, int bFromIndex, int bToIndex)
        System.out.println("Arrays.compare(longArray1, 0, 4, longArray2, 1, 5): "+Arrays.compare(longArray1, 0, 4, longArray2, 1, 5));


        //Example of static int compare(short[] a, short[] b)
        short[] shortArray1={5, 8, 6, 4, 2, 0};
        short[] shortArray2={1, 2, 3, 4, 5, 6};
        System.out.println("Arrays.compare(shortArray1, shortArray2): "+Arrays.compare(shortArray1, shortArray2));

        //Example static int compare(short[] a, int aFromIndex,int aToIndex, short[] b, int bFromIndex, int bToIndex)
        System.out.println("Arrays.compare(shortArray1, 0, 4, shortArray2, 1, 5): "+Arrays.compare(shortArray1, 0, 4, shortArray2, 1, 5));
    }

}
