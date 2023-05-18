package jm.study.book.디자인패턴.my.prototype;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
class Employees implements Cloneable{

    private List<String> list;

    public Employees() {
        this.list = new ArrayList<>();
    }
    public Employees(List<String> list) {
        this.list = list;
    }
    public void add(String e){
        list.add(e);
    }

    public void remove(String e){
        list.remove(e);
    }
    public List<String> getList(){
        return list;
    }

    public void loadData(){
        list.add("1황선홍");
        list.add("2손흥민");
    }

    @Override
    public Employees clone() {
        List<String> paramList = new ArrayList<String>();
        for(String a : this.list){
            paramList.add(a);
        }
        return new Employees(paramList);
    }
}

public class PrototypeMain {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.loadData();

        Employees e1 = employees.clone();
        System.out.println("e1 = " + e1);

        employees.remove("1황선홍");
        System.out.println("employees = " + employees);

    }
}
