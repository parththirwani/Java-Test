package Mod3.Threads;

public class DaemonThread {

    public static void main(String[] args) {
        // Create a daemon thread
        Thread daemonThread = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Daemon Thread Running");
                    Thread.sleep(1000); // 1 second
                }
            } catch (InterruptedException e) {
                System.out.println("Daemon Thread Interrupted");
            }
        });

        // Mark thread as daemon BEFORE starting it
        daemonThread.setDaemon(true);
        daemonThread.start();

        // Main thread activity
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread Running");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Main Thread Finished");
        // After this point, JVM exits, daemon thread dies
    }
}

