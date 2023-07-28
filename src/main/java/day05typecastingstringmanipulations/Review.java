package day05typecastingstringmanipulations;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Review {

    public static void main(String[] args) {

        int[][] a = { {21, 5}, {14, 70, 11} };
        int max = a[0][0];
        int min = a[0][0];


        for (int[] w : a) {
            for (int k : w) {
                max = Math.max(max, k);
            }
        }

        for (int[] w : a) {
            for (int k : w) {
                min = Math.min(min, k);
            }
        }
       
        int sum = max + min;
        System.out.println("sum = " + sum);
        
        
        





    }
}