package day27encapyulationabstraction.socrative.Q_06;

public class Sub extends A{

    int x=4;

    @Override
    int getSum() {
        return x+x;
    }

    @Override
    int getSum(int x) {
        return 0;
    }

    @Override
    int getSum(int x, int y) {
        int z=x+y;
        System.out.println(z);
        return z;
    }

    public static void main(String[] args) {
        A sub=new Sub();
        sub.getSum(4,2);
    }


}
