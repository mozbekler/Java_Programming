package day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread{

    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(" Hello World "+i+" from thread Number "+threadNumber);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
