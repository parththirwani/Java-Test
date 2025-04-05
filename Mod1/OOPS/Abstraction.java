package Mod1.OOPS;

 interface AbstractionInterface {
    void display();
}

 class AbstractionExample implements AbstractionInterface {
    public void display(){
        System.out.println("Hello world");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        AbstractionInterface a = new AbstractionExample();
        a.display();
    }
}