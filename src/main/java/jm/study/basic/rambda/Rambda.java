package jm.study.basic.rambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rambda {


    public static void main(String[] args) {
        List<String> s5 = Arrays.asList("aaa", "bbb", "ccc");
        System.out.println("s5 = " + s5);

        s5.stream().filter(x->x.equals("aaa")).forEach(System.out::println);
    }
}
