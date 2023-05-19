package jm.study.basic.thread;

import lombok.extern.slf4j.Slf4j;
@Slf4j
class ThreadC extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++){
            log.info("-");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                log.info(Thread.currentThread().getName() + ", "+ e.getMessage());
            }
        }
    }
}

@Slf4j
class ThreadD extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++){
            log.info("|");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                log.info(Thread.currentThread().getName() + ", "+ e.getMessage());
            }
        }
    }
}

@Slf4j
class ThreadE extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                log.info(Thread.currentThread().getName() + ", "+ e.getMessage());
            }
        }
    }
}

@Slf4j
class ThreadZ extends Thread{
    @Override
    public void run() {
        log.error("ThreadZ - Start");
        for(long i = 0; i < 900000000000L ; i++ ){
            if(i%9000000000L == 0){
                log.info("아직 실행중");
                log.error("Thread.interrupted() : " + Thread.interrupted());
            }
        }
        log.error("ThreadZ - End");
    }
}
@Slf4j
public class ThreadMain_Interrupt{
    public static void main(String[] args){
        log.info("======Main start======");

        Thread tc = new ThreadC();
        Thread td = new ThreadD();
        Thread te = new ThreadE();
        Thread tz = new ThreadZ();
        tc.start();
        td.start();
        te.start();
        tc.interrupt();
        
        //Thread.interrupted 테스트
        tz.start();
        tz.interrupt();

        log.info("======Main End======");
    }
}
