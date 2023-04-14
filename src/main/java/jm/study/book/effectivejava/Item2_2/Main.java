package jm.study.book.effectivejava.Item2_2;

import static jm.study.book.effectivejava.Item2_2.NyPizza.Size.*;
import static jm.study.book.effectivejava.Item2_2.Pizza.Topping.*;

public class Main {

    public static void main(String[] args) {
        NyPizza pizza   = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
        JmPizza jmpizza = new JmPizza.Builder().addTopping(SAUSAGE).chiessCrust().addTopping(ONION).build();

        System.out.println("pizza = " + pizza);
        System.out.println("calzone = " + calzone);
        System.out.println("jmpizza = " + jmpizza);

    }
}
