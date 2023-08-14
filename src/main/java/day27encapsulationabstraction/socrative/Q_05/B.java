package day27encapyulationabstraction.socrative.Q_05;

abstract class B extends A {


    @Override
    void firstMethod() {
        System.out.println("FIRST");
    }

    abstract void thirdMethod();
}