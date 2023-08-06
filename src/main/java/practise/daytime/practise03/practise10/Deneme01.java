package practise.advancedpractise.practise10;

import day21statickeyword.StdRunner;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme01 {

      /*
      Vize ve final notlarını alarak ortlama hesaplayan bir kod yazınız.
      int v = vize
      int f = final

      Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
      Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
      Diğer durumlarda ise, vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.
      Ortalama 70'in üzerinde is "Başarılı" altında ise "Başarısız" yazdırsın.
  */

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        int vizeNot;
        int finalNot;
        double ortalama;

        while (true){
            try {
                System.out.println("Vize: ");
                vizeNot= scan.nextInt();

                if (vizeNot<0 || vizeNot>100){
                    throw new ArithmeticException();
                }else {
                    break;
                }
            }catch (ArithmeticException e){
                System.out.println("Not 0 ile 100 arasinda olmalidir");
            }
        }

       while (true){
           try {
               System.out.println("Final: ");
               finalNot= scan.nextInt();

               if (finalNot<0 || finalNot>100){
                   throw new ArithmeticException();
               }else {
                   break;
               }
           }catch (ArithmeticException e){
               System.out.println("Not 0 ile 100 arasinda olmalidir");
           }
       }

       ortalama=vizeNot*0.4+finalNot*0.6;

       if (ortalama>69){
           System.out.println("basarili");
       }else {
           System.out.println("basarisiz");
       }

    }
}
