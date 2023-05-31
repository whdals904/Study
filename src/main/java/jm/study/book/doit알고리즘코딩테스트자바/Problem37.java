package jm.study.book.doit알고리즘코딩테스트자바;


import java.util.Arrays;

public class Problem37 {
    public void answer(){
        long start = System.currentTimeMillis();





        long end = System.currentTimeMillis();
        System.out.println("time(ms) : " + (end-start));
    }
    int M = 3;
    int N = 16;

    public void my(){
        long start = System.currentTimeMillis();



        System.out.println(Math.sqrt(3));
        System.out.println(Math.sqrt(16));

        int[] answer = new int[N+1];
        for(int i = 2; i <= N ; i++){
            answer[i] = i;
        }

        for(int i = 2; i <= Math.sqrt(N); i++){
            if(answer[i] == 0){
                continue;
            }
            for(int j = i+i ; j <= N ; j = j+ i){
                answer[j] = 0;
            }
        }

        for(int i = M ; i <= N ; i++){
            if(answer[i] != 0){
                System.out.print(answer[i] + ",");
            }
        }

        long end = System.currentTimeMillis();

    }



    public Problem37(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem37 p = new Problem37("소수 구하기");
        p.my();
        p.answer();
    }
}
