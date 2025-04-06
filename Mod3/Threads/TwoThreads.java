package Mod3.Threads;

public class TwoThreads{

static class ThreadOne implements Runnable {
    public void run(){

            while(true){
                System.out.println("Thread1");            
            }
    }
}

static class ThreadTwo implements Runnable {
    public void run(){
      while(true){
                System.out.println("Thread2");
            }

    }
}
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOne());
        Thread t2 = new Thread(new ThreadTwo());
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}