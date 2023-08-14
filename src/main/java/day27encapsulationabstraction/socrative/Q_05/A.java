package day27encapyulationabstraction.socrative.Q_05;

abstract class A {

    abstract void firstMethod();

    void secondMethod(){
        System.out.println("SECOND");
        firstMethod();
    }
}
