package Mod3.Threads;

public class HelloWorld implements Runnable {

    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("Hello World");
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new HelloWorld());
        t1.start();
        
    }
}
