package jm.study.book.doit알고리즘코딩테스트자바;


public class Problem27 {



    int ary[][] = new int[4][6];

    public Problem27(){
        ary[0] = new int[]{1,0,1,1,1,1};
        ary[1] = new int[]{1,0,1,0,1,0};
        ary[2] = new int[]{1,0,1,0,1,1};
        ary[3] = new int[]{1,1,1,0,1,1};
    }

    public void answer(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;
        //todo

        long end = System.currentTimeMillis();
        System.out.println("[my]     total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }
    public void BFS(int row, int col, int depth){

        


        if(ary[row][col+1] == 1){
            ary[row][col+1] = depth +1;
            BFS(row, col+1, depth +1);
        }
        if(col > 0 && ary[row][col-1] == 1){
            ary[row][col-1] = depth +1;
            BFS(row, col-1, depth +1);
        }
        if(ary[row+1][col] == 1){
            ary[row+1][col] = depth +1;
            BFS(row+1, col, depth +1);

        }
        if(row > 0 && ary[row-1][col] == 1){
            ary[row][col-1] = depth +1;
            BFS(row, col-1, depth +1);
        }
    }

    public void my(){
        long start = System.currentTimeMillis();
        Integer totalLoopCnt = 0;
        Integer count =0;
        //todo
        int n = 4;
        int m = 6;





        for(int i = 0 ; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                BFS(i, j, 1);
            }
        }







        long end = System.currentTimeMillis();
        System.out.println("[answer] total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    public Problem27(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem27 p = new Problem27("스택과 큐");
        p.my();
        p.answer();
    }
}
