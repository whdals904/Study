package jm.study.book.doit알고리즘코딩테스트자바;


import java.util.Stack;

public class Problem03_5 {
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

/*        int number = 8; //1<= n <= 100,000
        int[] ary = {4,3,6,8,7,5,2,1};*/

        int number = 5; //1<= n <= 100,000
        int[] ary = {1,2,5,3,4};

        StringBuffer sb = new StringBuffer();
        int aryIdx = 0;
        int n = 1;
        Stack<Integer> stack = new Stack<Integer>();

        int i = 1;
        int stackIdx = -1;
        String result = "nob";
        boolean fail = false;
        while( n <= number){
            //ary[aryIdx] < stack.get(stackIdx) 의 경우는 발생하면 에러
            if(stackIdx == -1 || ary[aryIdx] >= stack.get(stackIdx)){
                stack.push(n);
                sb.append("+");
                stackIdx++;
                while(stackIdx > -1 && ary[aryIdx] == stack.get(stackIdx)){
                    stack.pop();
                    sb.append("-");
                    stackIdx--;
                    aryIdx++;

                    if(stackIdx > -1 && ary[aryIdx] < stack.get(stackIdx)){
                        fail = true;
                        break;
                    }
                }
            }else{
                fail = true;
                break;
            }
            if(fail) break;
            n++;

        }
       result = sb.toString();
       System.out.println("result = " + result);
       System.out.println("fail = " + fail);




        // for(int n = 1 ; n <= 8 ; n++){
        /*while(n <= ary[aryIdx]){

            stack.push(n);

            if(ary[aryIdx] ==  n){
                sb.append("-");
                stack.pop();
                aryIdx++;
            }
            else if (ary[aryIdx] != n){
                sb.append("+");
                n++;
            }
        }*/

        long end = System.currentTimeMillis();
        System.out.println("[answer] total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    public Problem03_5(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem03_5 p = new Problem03_5("스택과 큐");
        p.my();
        p.answer();
    }
}
