package day19listsvarargs.varargs;

public class Test02 {


    public static void main(String[] args) {

        //**********
        //********** yerine aşağıdaki kodlar yazılırsa hangileri doğru olur

            /*
                A) m2("Java", 101, 102);
                  Output Java
                         101 102
                B) m2(100, 101, 102);
                  Output 100
                         101 102
                C) m2(101, 102);
                  Output 101 102
                D) m2(100, 101, "102");
                 Compile Time Error
         */

        m2("Java", 101, 102); // correct
        // m2(100, 101, 102); it gives CTE, because 100 isn't String
        // m2(101, 102); it gives an erro, because the first argument 101 isn't valid for String
        // m2(100, 101, "102");  it gives CTE, because 100 isn't String
    }

    static void m2(String str, int... a) {
        System.out.println(str);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


