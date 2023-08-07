package day17arraylists;

import java.util.*;

public class Review {

    public static void main(String[] args) {

        int[] sayilar ={3,4,5,6};
        System.out.println("sayilar[] "+ Arrays.toString(sayilar));
        elemanDegistir(sayilar);
        System.out.println(" main icinde Eleman degisince sayilar[] = " + Arrays.toString(sayilar));
        arrayiDegistir(sayilar);

    }



  private static void arrayiDegistir(int[] sayilar){
      sayilar= new int[6];
      System.out.println(" method icinde Eleman degisince sayilar[] = " + Arrays.toString(sayilar));
  }

    private static void elemanDegistir(int[] sayilar) {
        sayilar[0] =10;
        System.out.println(" method icinde Eleman degisince sayilar[] = " + Arrays.toString(sayilar));
        // [10, 4, 5, 6]
    }
}
