package Mod3.Threads;

public class Counting extends Thread {
    public void run (){
        System.out.println("The thread is running");
    }

    public void couting(){
        for(int i=0; i<11; i++){
            System.out.println(i);
            try {
                Counting.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Counting t1 = new Counting();
        t1.couting();
    }
}
