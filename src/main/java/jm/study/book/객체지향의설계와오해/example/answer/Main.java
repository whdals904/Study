package jm.study.book.객체지향의설계와오해.example.answer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> list = new ArrayList<>();
        MenuItem mi = new MenuItem("카푸치노", 10000);
        MenuItem mi1 = new MenuItem("아메리카노", 5000);
        list.add(mi);
        list.add(mi1);
        Menu menu = new Menu(list);
        Barista barista = new Barista();
        Customer customer = new Customer();
        customer.order("아메리카노", menu, barista );
    }
}
