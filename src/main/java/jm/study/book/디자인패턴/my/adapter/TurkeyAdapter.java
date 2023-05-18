package jm.study.book.디자인패턴.my.adapter;

public class TurkeyAdapter implements Duck{

    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void DuckDo(String msg){
        turkey.TurkeyDo(msg);
    }

    public void Action(String msg){
        turkey.Action(msg);
    }
}
