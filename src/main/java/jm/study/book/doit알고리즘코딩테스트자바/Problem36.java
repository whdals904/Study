package jm.study.book.doit알고리즘코딩테스트자바;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem36 {
    public void answer(){
        long start = System.currentTimeMillis();





        long end = System.currentTimeMillis();
        System.out.println("time(ms) : " + (end-start));
    }

    public int sum(String[] param){
        int sum = 0;
        for(String p : param){
            sum += Integer.parseInt(p);
        }
        return sum;
    }

    public void my(){
        long start = System.currentTimeMillis();

        List<Integer> list = new ArrayList<>(Arrays.asList(100, 40, 50, 74, 30, 29, 45, 43, 11));
        List<String> operator = new ArrayList<>(Arrays.asList("-","+","+","-","+","-","+","+"));
        String input = "100-40+50+74-30+29-45+43+11";
        
        String[] inputAry = input.split("-");

/*        for(String s : inputAry){
            String[] inputAry2 = s.split("[+]");
            sum(inputAry2);
        }*/

        int answer = 0;
        for(int i = 0 ; i < inputAry.length ; i++){

            String[] inputAry2 = inputAry[i].split("[+]");
            if(i == 0){
                answer = sum(inputAry2);
            }else {
                answer -= sum(inputAry2);
            }
        }

        System.out.println("answer = " + answer);
        
        long end = System.currentTimeMillis();
        System.out.println("time(ms) : " + (end-start));
    }

    public Problem36(String title){
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
