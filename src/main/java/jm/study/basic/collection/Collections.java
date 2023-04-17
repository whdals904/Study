package jm.study.basic.collection;

import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Collections {

    public static void main(String[] args) {
        System.out.println("Collections Test !!");

        //결합도를 낮추고 의존성 분리를 위해 interface로 받는다.
        List<String> li = new ArrayList<String>();

        List<Integer> stack = new Stack<Integer>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println("stack = " + stack);
        stack.remove(3);
        System.out.println("stack = " + stack);

        Stack<Integer> st = new Stack<Integer>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println("st = " + st);
        st.pop();
        System.out.println("st = " + st);


    }
}
