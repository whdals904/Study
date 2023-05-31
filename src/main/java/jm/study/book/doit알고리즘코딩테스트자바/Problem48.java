package jm.study.book.doit알고리즘코딩테스트자바;


import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Problem48 {
    public void answer(){
        long start = System.currentTimeMillis();





        long end = System.currentTimeMillis();
        System.out.println("time(ms) : " + (end-start));
    }

    public void DFS(){

    }

    public void my(){
        long start = System.currentTimeMillis();
/*        int ary1Cnt = 2;
        int[][] ary1 = new int[][]{{1,3},{2,3}};
        int ary2Cnt = 4;
        int[][] ary2 = new int[][]{{1,2},{2,3},{3,4},{4,2}};*/






        long end = System.currentTimeMillis();
        System.out.println("time(ms) : " + (end-start));
    }

    public Problem48(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem36 p = new Problem36("이분 그래프 판별하기");
        p.my();
        p.answer();
    }
}
