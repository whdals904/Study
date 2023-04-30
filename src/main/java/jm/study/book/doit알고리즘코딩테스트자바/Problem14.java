package jm.study.book.doit알고리즘코딩테스트자바;


import java.util.*;

public class Problem14 {
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

        int n = 18;
        int[] input = {1,-1,0,0,0,1,1,-1,-1,2,-2,0,0,0,0,0,0,0};

        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)->{
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs){ // 절댓값이 같은 경우 음수 우선
                return o1 < o2 ? -1 : 1;
            }
            return first_abs - second_abs; // 절댓값 작은 데이터 우선
        });

        for(int i = 0 ; i < n ; i++){

            if(input[i] == 0){
                if(myQueue.isEmpty()){
                    System.out.print("0 ");
                }else{
                    System.out.print(myQueue.poll() + " ");
                }
            }
            else{
                myQueue.add(input[i]);
            }
        }

       /* for(int a : input){
            if(list.size() == 0){
                list.add(a);
            }else{

                if(a == 0){
                    if(list.size() > 0){
                        System.out.println("list.remove(0) = " + list.remove(0));
                    }
                    System.out.println("0 : " + 0 );
                }else{

                    int maxIndex = list.size()-1;
                    int idx = 0;

                    for(Integer b : list){

                        if(Math.abs(a) > Math.abs(b)){
                            list.add(idx++, b);
                            break;
                        }else if (Math.abs(a) == Math.abs(b)){
                            if(a > b) {
                                list.add(idx++,b);
                                break;
                            }
                        }else{
                            list.add(++idx, b);
                        }
                        idx++;
                        if(maxIndex <= idx) break;
                    }
                }
            }

        }*/

        long end = System.currentTimeMillis();
        System.out.println("[answer] total = " + totalLoopCnt + ", answer : " + count + ", time(ms) : " + (end-start));
    }

    public Problem14(String title){
        System.out.println("====================================");
        System.out.println(title);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Problem14 p = new Problem14("절대값 힙 구현하기");
        p.my();
        p.answer();
    }
}
