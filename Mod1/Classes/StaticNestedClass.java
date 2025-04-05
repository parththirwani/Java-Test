package Mod1.Classes;

class Outer{
    static String message= "Hello from inner static class";

    static class StaticClass{
        void display(){
            System.out.println(message);
        }
    }

    public class StaticNestedClass{
        public static void main(String[] args) {
            Outer.StaticClass nested = new Outer.StaticClass();
            nested.display(); 
        }
    }
}