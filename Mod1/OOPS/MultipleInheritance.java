package Mod1.OOPS;

interface Runnable {
    void runnable();
}

interface Showable{
    void showable();
}

class InnerMultipleInheritance implements Runnable,Showable {
    public void runnable(){
        System.out.println("The program is running");
    }
    public void showable(){
        System.out.println("The program is visible");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        InnerMultipleInheritance a = new InnerMultipleInheritance();
        a.runnable();
        a.showable();
    }
}
