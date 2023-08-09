package day19listsvarargs.varargs;

public class m1 {

    public static void main(String[] args) {

        System.out.println(m1(true, false, true)); // 2
        System.out.println(m1(false, true)); // 1
        System.out.println(m1(true, false, true, true)); // 3
        //m1(); ==> Compile Time Error
    }

    /*
            Hangisi 2 return eder?
            A) m1(true, false, true);
            B) m1(false, true);
            C) m1(true, false, true, true);
            D) m1();
           */

    public static int m1(boolean b1, boolean... b2) {
        return b2.length;
    }

}
