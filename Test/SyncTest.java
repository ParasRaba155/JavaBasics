package Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncTest implements Runnable {

    private final Lock queueLock = new ReentrantLock();
    public int counter = 0;
    public void increment(){
        queueLock.lock();
        try{
            this.counter++;
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            queueLock.unlock();
        }

    }
    public void decrement(){
        this.counter--;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            this.increment();
            System.out.print(counter+" ");
        }
    }
}

class Main{
    public static void main(String[] args){

        SyncTest obj = new SyncTest();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);
        t1.start();
        t2.start();
        t3.start();

    }
}
