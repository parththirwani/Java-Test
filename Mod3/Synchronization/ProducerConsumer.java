package Mod3.Synchronization;

class SharedBuffer{
    private int data;
    private boolean hasData = false;

    public synchronized void Producer(int value){
        try{
        while(hasData){
            wait();
        }
    }catch(InterruptedException e){
        e.getStackTrace();
    }
    data = value;
    hasData= true;
    System.out.println("Produced:"+data);
    notify();
    }

    public synchronized void Consumer(){
        try{
        while(!hasData){
            wait();
        }
    }catch(InterruptedException e){
        e.getStackTrace();
    }
    hasData= false;
    System.out.println("Consumed:"+data);
    notify();
    }

}

public class ProducerConsumer{
        public static void main(String[] args) {
            SharedBuffer sharedBuffer = new SharedBuffer();

            Thread t1 = new Thread(()->{
                for (int i=0;i<=5;i++){
                    sharedBuffer.Producer(i);
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        System.out.println("Exception occured:"+e.getStackTrace());
                    }   
                }
            });

            Thread t2 = new Thread(()->{
                for (int i=0; i<=5;i++){
                    sharedBuffer.Consumer();
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        System.out.println("Exception occured:"+e.getStackTrace());
                    }   
                }
            });
            t1.start();
            t2.start();
        }
    }



