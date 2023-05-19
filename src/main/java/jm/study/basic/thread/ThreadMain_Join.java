package jm.study.basic.thread;

import lombok.extern.slf4j.Slf4j;

class Thread1_1 extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++){
            System.out.print("-");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }


        }
    }
}

class Thread1_2 extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++){
            System.out.print("|");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

@Slf4j
class Thread1_3 extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
@Slf4j
public class ThreadMain_Join {

    public static void main(String[] args){
        log.info("======Main start======");

        Thread t1 = new Thread1_1();
        Thread t2 = new Thread1_2();
        Thread t3 = new Thread1_3();

        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        t2.start();
        t3.start();

        System.out.println(" End");
        log.info("======Main End======");
    }
}
