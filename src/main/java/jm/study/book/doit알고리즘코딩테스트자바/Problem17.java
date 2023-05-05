package jm.study.book.doit알고리즘코딩테스트자바;


import java.util.*;

public class Problem17 {
    public void answer(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;
        //todo

        String n = "2143";
        List<Integer> list = new ArrayList<Integer>();
        String[] temp = n.split("");

        //Arrays.stream(temp).map(Integer::parseInt).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        int[] temp1 = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();

        int idx = 0;
        for(int j = 0 ; j < temp1.length ; j++){
            int max = j;
            for(int i = j+1 ; i < temp1.length ; i++) {
                if(temp1[max] < temp1[i]){
                    max = i;
                }
            }
            if(temp1[j] < temp1[max]){
                int t = temp1[j];
                temp1[j] = temp1[max];
                temp1[max] = t;
            }
        }

        Arrays.stream(temp1).forEach(System.out::println);



        long end = System.currentTimeMillis();
        System.out.println("[my]     total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }


    public void my(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;
        //todo


        String n = "2143";
        List<Integer> list = new ArrayList<Integer>();
        String[] temp = n.split("");

        //Arrays.stream(temp).map(Integer::parseInt).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        int[] temp1 = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();


        for(int j = 0 ; j < temp1.length ; j++){
            for(int i = j ; i < temp1.length ; i++) {
                if(temp1[j] < temp1[i]){
                    int t = temp1[j];
                    temp1[j] = temp1[i];
                    temp1[i] = t;
                }
            }
        }

//.stream(temp1).forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.println("[answer] total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    public Problem17(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem17 p = new Problem17("스택과 큐");
        p.my();
        p.answer();
    }
}
