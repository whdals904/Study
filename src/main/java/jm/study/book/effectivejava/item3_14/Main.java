package jm.study.book.effectivejava.item3_14;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;

@Setter
@Getter
@ToString
class ComparebleImpl implements Comparable<ComparebleImpl> {

    private String name;
    private int age;

    public ComparebleImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(ComparebleImpl p) {
        if(this.age > p.getAge()) return 1;
        if(this.age < p.getAge()) return -1;
        return 0; // 같다면 0
    }
}

public class Main {
    public static void main(String[] args) {

        ComparebleImpl ci1 = new ComparebleImpl("김종민",40);
        ComparebleImpl ci2 = new ComparebleImpl("김종윤",37);
        ComparebleImpl ci3 = new ComparebleImpl("김아름",38);

        ArrayList<ComparebleImpl> list = new ArrayList<>();

        list.add(ci3);
        list.add(ci1);
        list.add(ci2);
        System.out.println("before list = " + list);
        Collections.sort(list);
        System.out.println("after list = " + list);

    }
}