package practise.advancedpractise.practise10;

public class Recursive_100den1e {
    // 100'den 1'e kadar sayilari loop ve sayi kullanmadan yazdiran bir metot lousturunuz

    public static void main(String[] args) {

        sayilariYazdir('d');
    }

    public static void sayilariYazdir(char ch){

        if (ch>='a'/'a'){
            System.out.print(ch+0+" ");
            ch--;
            sayilariYazdir(ch);
        }

    }
}
