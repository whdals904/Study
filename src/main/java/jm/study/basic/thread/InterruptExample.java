package jm.study.basic.thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterruptExample {

    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            while(true) {
                log.info("실행중");

                try {
                    Thread.sleep(1);//interrupt를 이용하기에 sleep(1)이상은 반드시 있어야 한다.
                } catch (InterruptedException e) {
                    log.error(" InterruptedException !!!!!!!!!");
                    break;
                }
            }
            log.info("실행 종료");
        });
        log.info("0000000000000000001");

        thread.start();
        log.info("0000000000000000002");

        try {
            log.info("1111111111111111");
            thread.sleep(10);
            log.info("2222222222222222");

        } catch (InterruptedException e) {
            log.error(" InterruptedException ###############");
        }

        /* 스레드를 외부에서 인터럽트 시키면 해당 스레드의 sleep() 메소드가 있을때
         * sleep() 메소드 수행 시 InterruptedException가 발생됨.
         * 예외처리(try-catch)절을 이용해서 스레드 종료를 유도함.*/
        thread.interrupt();
    }

}