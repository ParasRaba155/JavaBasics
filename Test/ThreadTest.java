package Test;

public class ThreadTest implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from Thread "+Thread.currentThread().getName());
    }

    public static void main(String[] args){
        Thread t1 = new Thread(new ThreadTest());
        Thread t2 = new Thread(new ThreadTest());
        t1.start();
        t2.start();
        String s1 = "Hello";
        String s2 = "World";
        System.out.printf("%s %s ",s1,s2);
    }
}
