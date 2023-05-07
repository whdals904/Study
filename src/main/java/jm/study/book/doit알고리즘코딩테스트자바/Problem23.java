package jm.study.book.doit알고리즘코딩테스트자바;


import java.util.ArrayList;

public class Problem23 {

    boolean[] visited = new boolean[6+1];
    ArrayList<Integer>[] A = new ArrayList[6+1];

    public void answer(){
        //todo
        int node = 6;
        int edge = 5;


        for(int i = 1; i <= node ; i++){
            A[i] = new ArrayList<Integer>();
        }

        A[1].add(2);
        A[2].add(1);

        A[2].add(5);
        A[5].add(2);

        A[5].add(1);
        A[1].add(5);

        A[3].add(4);
        A[4].add(3);

        A[4].add(6);
        A[6].add(4);

        int count =0;
        for(int i = 1; i < node + 1 ; i++ ){
            if(visited[i] == false){
                count++;
                DFS(i);
            }
        }
        System.out.println("count = " + count);
    }

    private void DFS(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            if(visited[i] == false){
                DFS(i);
            }
        }

    }


    public void my(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;




        long end = System.currentTimeMillis();
        System.out.println("[answer] total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    public Problem23(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem23 p = new Problem23("DFS (스택이네~!!)");
        p.my();
        p.answer();
    }
}
