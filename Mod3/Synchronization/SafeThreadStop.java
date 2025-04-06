package Mod3.Synchronization;

class ThreadPrinter implements Runnable{
    private volatile boolean running = true;

    void stopThread(){
        running = false;
    }

    public void run (){
        for(int i = 0; i<=100 && running; i++){
            System.out.println(i);
        }try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println("Printing stopped");
    }
}

public class SafeThreadStop{
    public static void main(String[] args) {
        ThreadPrinter printer = new ThreadPrinter();
        Thread t1 = new Thread(printer);
        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        System.out.println("Thread is stopping...");
        printer.stopThread();
    }

}