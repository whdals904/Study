package jm.study.book.doit알고리즘코딩테스트자바;


public class Problem23 {
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


        long end = System.currentTimeMillis();
        System.out.println("[answer] total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    public Problem23(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem23 p = new Problem23("스택과 큐");
        p.my();
        p.answer();
    }
}
