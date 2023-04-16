package jm.study.book.effectivejava.item2_9;

public class TryWithResource {

    public static void main(String[] args) throws Exception {
        System.out.println("TryWithResources !!");
        try (Example1 e1 = new Example1()){
            e1.getName();
        }
    }
}
