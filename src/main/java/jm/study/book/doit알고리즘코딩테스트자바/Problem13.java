package jm.study.book.doit알고리즘코딩테스트자바;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

public class Problem13 {
    public void answer(){
        Queue<Integer> q = new LinkedList<>();

        int n = 6;
        for(int i = 1 ; i <= n ; i++){
            q.add(i);
        }

        int topNumber = 1;
        while(q.size() != 1){
            System.out.println("answer = " + q);
            q.poll();
            q.add(q.poll());
        }
        System.out.println("answer Dab = " + q.poll());

    }


    public void my(){
        Queue<Integer> q = new LinkedList<>();
        int n = 6;
        for(int i = 1 ; i <= n ; i++){
            q.add(i);
        }

        int topNumber = 1;
        while(q.size() != 1){
            System.out.println("my answer = " + q);
            if(topNumber%2==0){
                q.add(q.poll());
            }else{
                q.poll();
            }
            topNumber++;
        }

        System.out.println("my Dab = " + q.poll());

    }

    public Problem13(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem13 p = new Problem13("카드게임");
        p.my();
        p.answer();
    }
}
