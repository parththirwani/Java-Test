package Mod1.Classes;

class Outer{
    void showMessage(){
        class InnerClass {
            void greet() {
                System.out.println("Hello User");
            }
            void bye() {
                System.out.println("Goodbye User");
            }
        }
        InnerClass inner = new InnerClass();
        inner.greet();
        inner.bye();
        
    }
    public class LocalInnerClass{
        public static void main(String[] args) {
            Outer outer = new Outer();
            outer.showMessage();
        }
    }
}