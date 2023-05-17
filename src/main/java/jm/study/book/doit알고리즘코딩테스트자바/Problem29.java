package jm.study.book.doit알고리즘코딩테스트자바;


import java.util.Arrays;

public class Problem29 {
    int dataCnt = 5;
    int[] dataAry = new int[]{4,1,5,2,3};
    int findCnt = 5;
    int[] findAry = new int[]{1,3,7,9,5};

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



        Arrays.sort(dataAry);

        for(int i = 0 ; i < findCnt ; i++){
            BinarySearch(findAry[i], 0, dataCnt-1);
        }

        long end = System.currentTimeMillis();
        System.out.println("[answer] total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    private void BinarySearch(int findNumber, int start, int end) {

        if(start > end){
            System.out.println("0");
            return;
        }

        int middle = (start + end) / 2;
        if(dataAry[middle] == findNumber){
            System.out.println("1");
            return;

        }else if(dataAry[middle] < findNumber ){

            BinarySearch(findNumber ,middle+1, end);

        }else{
            BinarySearch(findNumber ,start, middle-1);

        }

    }

    public Problem29(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem29 p = new Problem29("스택과 큐");
        p.my();
        p.answer();
    }
}
