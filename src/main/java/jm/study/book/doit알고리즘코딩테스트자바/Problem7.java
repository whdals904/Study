import java.util.ArrayList;
import java.util.Arrays;

public class Problem7 {

    int M = 0;
    int N = 0;
    ArrayList<Integer> ary;
    int[] ary1;

    public Problem7(){
        this.M = 6;
        this.N = 9;
       // this.ary = new ArrayList<Integer>(Arrays.asList(2,7,4,1,5,3));
        ary1 = new int[]{2,7,4,1,5,3};
    }
    public Problem7(int M, int N, int[] ary){
/*        Scanner sc = new Scanner(System.in);
        input = Integer.parseInt(sc.nextLine());
        System.out.println("input = " + input);*/
/*        this.M = M;
        this.N = N;
        this.ary = ary;*/


    }
    public void my(){

        long start = System.currentTimeMillis();
        int totalLoopCnt = 0;
        int count =0;

        for(int i = 0 ; i < ary.size() ; i++){
            for(int j = i+1 ; j < ary.size() ; j++){
                if(ary.get(i)+ ary.get(j) == N){
                    count++;
                }
                totalLoopCnt++;
            }
        }


        long end = System.currentTimeMillis();
        System.out.println("my total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    public void answer(){
        long start = System.currentTimeMillis();
        int totalLoopCnt = 0;
        int count =0;
        int s = 0;
        int e = ary1.length-1;
        Arrays.sort(ary1);
        while(s < e){
            if(ary1[s]+ary1[e] ==M){
                count++;s++;e--;
            }else if(ary1[s]+ary1[e] < M){
                s++;
            }else{
                e--;
            }
            totalLoopCnt++;
        }
        long end = System.currentTimeMillis();
        System.out.println("my total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));

    }

    public static void main(String[] args) {
        Problem7 p = new Problem7();

        p.my();
        System.out.println("===================================");
        p.answer();
    }

}
