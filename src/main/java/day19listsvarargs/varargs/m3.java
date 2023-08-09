package day19listsvarargs.varargs;

public class m3 {

    public static void main(String[] args) {

        /*
            Hangisi yanlıştır?
            A) m3("Result: ", 2, 3, 4);
            Output Result: 24
            B) m3("Result: ", 2, 2.5);
            Output Result: 5
            C) m3("Result: ");
            Output Result: 1
            D) m3("Result: ", 2);
            Output Result: 2
         */

        m3("Result: ", 2, 3, 4); // 24

        // m3("Result: ", 2, 2.5); // CTE, 2.5 is kein int, sondern double oder float

        // m3("Result: ")  // CTE, kein int

        m3("Result: ", 2); // 2

    }


    public static void m3(String x, int... y) {
        int p = 1;
        for (int w : y) {
            p = p * w;
        }
        System.out.print(x);
        System.out.println(p);
    }

}
