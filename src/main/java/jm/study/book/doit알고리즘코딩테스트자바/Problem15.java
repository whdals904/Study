package jm.study.book.doit알고리즘코딩테스트자바;


import java.util.Arrays;

public class Problem15 {
    public void answer(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;
        //todo

        long end = System.currentTimeMillis();
        System.out.println("[my]     total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }


    public void my(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;
        //todo


        int[] ary = {2,3,4,1,5,9,10,6,7,8};

        //Arrays.sort(ary);
       // Arrays.stream(ary).sorted().forEach(System.out::println);

        for(int j = 0 ; j < ary.length-1  ; j++){

            for(int i = 0 ; i < ary.length -1 -j; i++) {

                if (ary[i] > ary[i + 1]) {
                    int temp = ary[i + 1];
                    ary[i + 1] = ary[i];
                    ary[i] = temp;
                }
            }
        }
        Arrays.stream(ary).forEach(System.out::println);


        long end = System.currentTimeMillis();
        System.out.println("[answer] total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    public Problem15(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem15 p = new Problem15("스택과 큐");
        p.my();
        p.answer();
    }
}
