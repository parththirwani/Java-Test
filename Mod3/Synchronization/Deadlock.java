package Mod3.Synchronization;

public class Deadlock {

    static final Object resource1 = new Object();
    static final Object resource2 = new Object();
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            synchronized(resource1){
                System.out.println("The resource1 is locked by "+Thread.currentThread().getName());
            
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println("Exception occured"+e.getMessage());
            }
            System.out.println("Trying to get resource 2");
            synchronized(resource2){
                System.out.println("got resource 2");
            }
        }
        });

        Thread t2 = new Thread(()->{
            synchronized(resource2){
                System.out.println("The resource2 is locked by "+Thread.currentThread().getName());
            
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println("Exception occured"+e.getMessage());
            }
            System.out.println("Tryin to get resource 1");
            synchronized(resource1){
                System.out.println("got resource 1");
            }
        }

        });

        t1.start();
        t2.start();
  
        
    }



}
