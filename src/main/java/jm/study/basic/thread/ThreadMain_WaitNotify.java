package jm.study.basic.thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class WorkObject{

    public synchronized void methodA() {
        log.info("ThreadA와 methodA() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB() {
        log.info("ThreadB와 methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadA extends Thread{
    private WorkObject workObject;

    ThreadA(WorkObject workObject){
        this.workObject = workObject;
    }
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            workObject.methodA();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class ThreadB extends Thread{
    private WorkObject workObject;

    ThreadB(WorkObject workObject){
        this.workObject = workObject;
    }
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            workObject.methodB();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadMain_WaitNotify {
    public static void main(String[] args) {
        WorkObject workObject = new WorkObject();
        ThreadA threadA = new ThreadA(workObject);
        ThreadB threadB = new ThreadB(workObject);

        threadA.start();
        threadB.start();
    }
}
