package jm.study.basic.generics;


import java.util.ArrayList;
import java.util.List;

class Sport<T>{
    protected String name;
    protected List<T> Members = new ArrayList<>();
    public void play(){
        System.out.println(name + " play");
    }
    protected List<T> getMembers() {
        return Members;
    }
}

class Football<T> extends Sport<T>{
    private String ball;
    public void playsub(){
        System.out.println(name + "," + ball);
    }
}

class Skating<T> extends Sport<T>{
    private String skate;
    public void playsub(){
        System.out.println(name + "," + skate);
    }
}

public class GenericMain<T> {

    public void test(List<T> list){
        System.out.println("list = " + list);
    }
    public void test1(List<? extends Sport> list){
        System.out.println("list = " + list);
    }
    public <K extends Sport> void test2(List<K> list){
        System.out.println("list = " + list);
    }
    public static void main(String[] args) {
        System.out.println("=============Generics Main !! ================");

        GenericMain<Football> gm = new GenericMain();
        List<Football> lf = new ArrayList<>();
        List<Skating> sf = new ArrayList<>();
        gm.test(lf);
        // gm.test(sf);

        gm.test1(lf);
        gm.test1(sf);

        gm.test2(lf);
        gm.test2(sf);

    }
}
