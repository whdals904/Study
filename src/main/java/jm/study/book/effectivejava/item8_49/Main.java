package jm.study.book.effectivejava.item8_49;

import org.apache.commons.lang3.Validate;

import java.util.Objects;

public class Main {

    private String userId;

    public static void method1(String name){
        name = Objects.requireNonNull(name,"입력이 null 입니다.!");
    }

    public static void method2(String name){
        if(name == null){
            throw new NullPointerException("입력이 null 입니다.!");
        }
    }

    public Main(String userId){
        Validate.notNull(userId, "userId는 Null이 올 수 없습니다.");
    }

    public static void main(String[] args) {

       // method1(null);
        //method2();
        for(String a : args){
            System.out.println("a = " + a);
        }
        //Main main = new Main(null);

        int value = -1;
        assert value >=0:" 음수값입니다.";
        System.out.println("value = " + value);

    }
}
