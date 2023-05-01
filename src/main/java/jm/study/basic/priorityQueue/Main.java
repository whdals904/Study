package jm.study.basic.priorityQueue;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        System.out.println(" priorityQueue start !! " );

        extracted();
        extracted2();

    }

    private static void extracted() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (o1, o2) -> {
                return o1 - o2;
            }
        );
        pq.add(2);
        pq.add(6);
        pq.add(3);
        pq.add(1);

        System.out.println("pq = " + pq);

        System.out.println("pq.poll() = " + pq.poll());
        System.out.println("pq.poll() = " + pq.poll());
        System.out.println("pq.poll() = " + pq.poll());
        System.out.println("pq.poll() = " + pq.poll());

    }
    private static void extracted2() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (o1, o2) -> {
                    return o2 - o1;
                }
        );
        pq.add(2);
        pq.add(6);
        pq.add(3);
        pq.add(1);
        System.out.println("pq = " + pq);

        System.out.println("pq.poll() = " + pq.poll());
        System.out.println("pq.poll() = " + pq.poll());
        System.out.println("pq.poll() = " + pq.poll());
        System.out.println("pq.poll() = " + pq.poll());

    }
}
