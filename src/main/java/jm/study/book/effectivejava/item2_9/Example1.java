package jm.study.book.effectivejava.item2_9;

public class Example1 implements AutoCloseable{

    private String name;

    public Example1(){
        name ="sample";
    }

    public String getName(){
        return name;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Example1 AutoClose !!");
    }
}
