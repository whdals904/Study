package jm.study.book.doit알고리즘코딩테스트자바;


public class Problem {
    public void answer(){
        long start = System.currentTimeMillis();





        long end = System.currentTimeMillis();
        System.out.println("time(ms) : " + (end-start));
    }


    public void my(){
        long start = System.currentTimeMillis();





        long end = System.currentTimeMillis();
        System.out.println("time(ms) : " + (end-start));
    }

    public Problem(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem36 p = new Problem36("스택과 큐");
        p.my();
        p.answer();
    }
}
