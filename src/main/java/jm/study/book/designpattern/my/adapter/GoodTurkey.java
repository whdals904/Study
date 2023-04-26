package jm.study.book.designpattern.my.adapter;

public class GoodTurkey implements Turkey{
    @Override
    public void TurkeyDo(String msg) {
        System.out.println("Do " + msg);
    }

    @Override
    public void Action(String msg) {
        System.out.println("Action " + msg);

    }
}
