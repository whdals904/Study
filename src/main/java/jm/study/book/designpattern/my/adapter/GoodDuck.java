package jm.study.book.designpattern.my.adapter;

public class GoodDuck implements Duck{
    @Override
    public void DuckDo(String msg) {
        System.out.println("Do " + msg);
    }

    @Override
    public void Action(String msg) {
        System.out.println("Action " + msg);

    }
}
