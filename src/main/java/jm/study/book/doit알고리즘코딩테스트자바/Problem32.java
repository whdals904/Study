package jm.study.book.doit알고리즘코딩테스트자바;


public class Problem32 {

    public void answer(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;
        //todo

        long end = System.currentTimeMillis();
        System.out.println("[my]     total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    private int moneyCnt = 10;
    private int[] moneyAry = new int[]{1,5,10,50,100,500,1000,5000,10000,50000};
    private int price = 4200;
    private int answer = 0;
    public void my(){

        while(price > 0){

            for(int i = moneyCnt-1 ; i >= 0 ; i--){
                if(moneyAry[i] <= price){
                    int mok = price / moneyAry[i] ;
                    answer += mok;
                    price = price % moneyAry[i];
                    System.out.println("mok = " + mok + ", answer = " + answer + ", price = " + price);
                }
            }
        }
        System.out.println("answer = " + answer);

    }

    public Problem32(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem32 p = new Problem32("동전 개수의 최솟값");
        p.my();
        p.answer();
    }
}
