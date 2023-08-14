package day27encapyulationabstraction.encapsulation;


import day27encapyulationabstraction.encapsulation.Student;

public class StudentRunner {

    public static void main(String[] args) {


            Student myStd = new Student();

            //Student 1
            System.out.println(myStd.getStdId());
            System.out.println(myStd.getGpa());
            System.out.println(myStd.isPoor());

        System.out.println("===============================");

            //Student 2
            myStd.setStdId("TH123");
            myStd.setGpa(4.0);
            myStd.setPoor(false);

        System.out.println(myStd.getStdId());
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());


    }


}
