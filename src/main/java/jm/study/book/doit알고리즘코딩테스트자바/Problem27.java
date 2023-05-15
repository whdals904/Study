package jm.study.book.doit알고리즘코딩테스트자바;

import java.util.LinkedList;
import java.util.Queue;

public class Problem27 {

    static int N = 4;
    static int M = 6;

    static int A[][] = new int[N][M];
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    static boolean[][] visited;
    public Problem27(){

    }

    public void answer(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;
        //todo

        long end = System.currentTimeMillis();
        System.out.println("[my]     total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }
    public void my(){
        BFS(0, 0);
        System.out.println("A[N-1][M-1] = " + A[N-1][M-1]);
    }

    public static void BFS(int i, int j){

        Queue<int[]> queue= new LinkedList<>();
        queue.offer(new int[]{i,j});
        visited[i][j] = true;
        while(!queue.isEmpty()){

            int now[] = queue.poll();
            for(int k = 0 ; k < 4 ; k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if(x >= 0 && y >= 0 && x < N && y < M){

                    if(A[x][y] != 0 && !visited[x][y])
                    {
                       visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;
                        System.out.println("A[x][y] : " +A[x][y] + " | x,y = " +x + "," + y);
                        queue.add(new int[]{x,y});
                    }
                }
            }
        }
    }

    public Problem27(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");

        A[0] = new int[]{1,1,0,1,1,0};
        A[1] = new int[]{1,1,0,1,1,0};
        A[2] = new int[]{1,1,1,1,1,1};
        A[3] = new int[]{1,1,1,1,0,1};
    }

    public static void main(String[] args) {
        Problem27 p = new Problem27("스택과 큐");
        visited = new boolean[N][M];
        p.my();
        p.answer();
    }
}
