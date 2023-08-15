package practise.daytime.practise06;

public class Socrative {

    public static void main(String[] args) {

        short[] arr=new short[4];

        arr[0]=10;
        arr[1]=11;
        arr[3]=13;

        /*
            Yukaridaki kod ile ilgili asagidakilerden hangisi dogrudur?

            a)sout(arr); ==> {10,11,13}

            b) sout(arr[2]); ==> 0

            c) sout(arr[1] + arr[3]); ==> 24

            d) sout(arr.length()); ==> 4
;         */

        System.out.println(arr);//[S@58372a00
        System.out.println(arr[2]);//0
        System.out.println(arr[1]+arr[3]);//24
        System.out.println(arr.length);//4


        // asagidaki kodun ciktisi nedir?
        int[] brr={1,3,5,7,9};

        for (int w : brr) {

            System.out.print(w+" ");

            if(w > 4){

                break;

            }

        }
    }
}
