package day27encapyulationabstraction.abstraction;

import day27encapyulationabstraction.abstraction.Courses;

public class SeventhGraders extends Courses {

    @Override
    public void math() {
        System.out.println("Seventh graders math...");
    }

    @Override
    public void art() {
        System.out.println("Art should be learned...");
    }
}