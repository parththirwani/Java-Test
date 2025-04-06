package Mod3.Threads;

// class MyThread extends Thread{
//     public void run(){
//         System.out.println("The program is running using thread class");
//     }
//     public static void main(String[] args) {
//         MyThread t1= new MyThread();
//         t1.start();
//     }
// }


// class MyRunnable implements Runnable{
//     public void run(){
//         System.out.println("The thread is running usin runnable");
//     }
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new MyRunnable());
//         t1.start();

//     }
// }


 class MyThread{
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> System.out.println("The thread is running using lambda"));
        t1.start();
    }
}