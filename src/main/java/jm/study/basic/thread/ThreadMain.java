package jm.study.basic.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

class MysteryBox{
    List<Integer> list = new ArrayList<>();

    public MysteryBox() {
        for(int i = 0 ; i < 100000 ; i++){
            list.add(i);
        }
    }
    public void PrintListSize(){
        System.out.println("list.size() = " + list.size());
    }

    public List<Integer> getList() {
        return list;
    }
}

@Slf4j
class Thread1 extends Thread{
    private MysteryBox mysteryBox;
    List<Integer> myList = new ArrayList<>();

    public Thread1(MysteryBox mb){
        mysteryBox = mb;
    }

    @Override
    public void run() {

      List<Integer> list = mysteryBox.getList();
          int i = 0;
          for(int a : list){
              if(a%2 == 1){
                  myList.add(list.get(i++));
                  System.out.println("====Thread1 a = " + a);
              }
        }
        System.out.println("Thread1 - myList.size() = " + myList.size());

    }
}


class Thread2 extends Thread{
    private MysteryBox mysteryBox;
    List<Integer> myList = new ArrayList<>();

    public Thread2(MysteryBox mb){
        mysteryBox = mb;
    }
    @Override
    public void run() {

        List<Integer> list = mysteryBox.getList();
        int i = 0;
        for(int a : list){
            if(a%2 == 0){
                myList.add(list.get(i++));
                System.out.println("Thread2 a = " + a);
            }
        }

        System.out.println("Thread2 - myList.size() = " + myList.size());

    }
}
@Slf4j
public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {

        MysteryBox mb = new MysteryBox();
        mb.PrintListSize();


        Thread1 t1 = new Thread1(mb);
        Thread2 t2 = new Thread2(mb);

        t1.start();
        log.info("============t2============1");
        t1.join();
        log.info("============t2============2");

        t2.start();


    }
}
