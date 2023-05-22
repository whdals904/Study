package jm.study.basic.thread.my;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(" MyThread Start !! ");
        while(true){

            if(Thread.interrupted()){
                System.out.println("Thread.interrupted() = " + Thread.interrupted());
            }else{
                Thread.yield();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(3000);
        myThread.interrupt();

    }
}
