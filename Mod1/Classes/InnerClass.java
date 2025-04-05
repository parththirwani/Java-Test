package Mod1.Classes;

class Outer{
    private String message = "Hello from the inner class";

    class Inner{
        void display(){
            System.out.println(message);
        }
    }

    public class InnerClass{
        public static void main(String[] args) {
            Outer outer = new Outer();
            Outer.Inner inner = outer.new Inner();
            inner.display();
            
        }
    }
}