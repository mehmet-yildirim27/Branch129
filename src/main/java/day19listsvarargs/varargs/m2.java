package day19listsvarargs.varargs;

public class m2 {

    /*
        public static void m2(int i, int j, int... k) {
            System.out.println(k.length);
        }
        Which one is false?
        A) m2(1, 2, 3, 4);// k=2
        Prints 4 on the console
        B) m2(1, 2, 3, 4, 5);//k=3
        Prints 3 on the console
        C) m2(1, 2);// k=0
        Prints 0 on the console
        D) m2(1);
        Gives Compile Time Error
     */
    // a is correct

    public static void main(String[] args) {

        m2(1, 2, 3, 4);
        m2(1, 2, 3, 4, 5);
        m2(1, 2);
        //m2(1);
    }

    public static void m2(int i, int j, int... k) {
        System.out.println(k.length);
    }
}
