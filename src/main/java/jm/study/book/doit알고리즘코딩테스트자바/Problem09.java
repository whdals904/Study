package jm.study.book.doit알고리즘코딩테스트자바;

import java.util.ArrayList;
import java.util.List;

public class Problem09 {
    //int S = 4;    int P = 2;    char[] ary ={'A','C','G','T'};     int[] inputCnt ={1,0,0,1};     String inputString ="GATA";
    //int S = 9;    int P = 8;    char[] ary ={'A','C','G','T'};     int[] inputCnt ={2,0,1,1};     String inputString ="CCTGGATTG";
    int S = 9;    int P = 4;    char[] ary;     int[] inputCnt ={0,0,2,2};     String inputString ="CCTGGATSTAGATTGGTTGGTG";

    List<Character> li = new ArrayList<Character>();

    List<Character> li2 = new ArrayList<Character>();


    public void my(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;
        ///////////////////////////////////////////


/*        int j =0;
        for(int i = 0 ; i < inputCnt.length ; i++){
            while(inputCnt[i] > j++){
                li.add(ary[i]);
            }
        }
        System.out.println("li = " + li);*/

        for(int i = 0 ; i<= inputString.length()-P ; i++){
            //System.out.println(" = " + inputString.substring(i,i+P));
            String t = inputString.substring(i,i+P);
            //System.out.println("temp = " + t);
            //Arrays.stream(makeArray(t)).forEach(System.out::print);
            //System.out.println("----");
            if (check(makeArray(t))){
                System.out.println("temp = " + t);
                count++;
            }
        }
        ///////////////////////////////////////////
        long end = System.currentTimeMillis();
        System.out.println("[my]     total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }
    public boolean check(int[] t){
        for(int i = 0 ; i < inputCnt.length ; i++){
            if(inputCnt[i] > t[i]){
                return false;
            }
        }
        return true;
    }
    public int[] makeArray(String t){
        int[] r = new int[inputCnt.length];
        for(char a : t.toCharArray()){
            for(int i = 0 ; i < ary.length ; i++){
                if(a == ary[i]) r[i]++;
            }
        }
        return r;
    }

    public void answer(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;
        //todo

        long end = System.currentTimeMillis();
        System.out.println("[answer] total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    public Problem09(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
        ary = new char[]{'A','C','G','T'};
    }

    public static void main(String[] args) {
        Problem09 p = new Problem09("DNS 비밀번호");
        p.my();
        p.answer();
    }
}
