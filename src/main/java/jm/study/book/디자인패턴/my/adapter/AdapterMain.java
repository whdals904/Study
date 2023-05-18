package jm.study.book.디자인패턴.my.adapter;


import java.util.ArrayList;
import java.util.List;

public class AdapterMain {
    public static void main(String[] args) {
        System.out.println("Adapter Main !!!");

        Duck duck = new GoodDuck();
        Turkey turkey = new GoodTurkey();

/*        duck.DuckDo("Duck Duck Do");
        turkey.TurkeyDo("turkey turkey Do");
        duck.Action("Duck Duck Action");
        turkey.Action("turkey turkey Action");*/

        TurkeyAdapter ta = new TurkeyAdapter(turkey);
/*        ta.DuckDo("TurkeyAdapter TurkeyAdapter Do");
        ta.Action("TurkeyAdapter TurkeyAdapter Action");*/

        List<Duck> list = new ArrayList<>();
        list.add(duck);
        list.add(ta);

        list.forEach(n->n.DuckDo("Adapter DuckDo"));
        list.forEach(n->n.Action("Adapter Action"));


    }
}
