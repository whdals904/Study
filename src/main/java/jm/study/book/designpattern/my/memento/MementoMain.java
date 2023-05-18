package jm.study.book.designpattern.my.memento;

import lombok.ToString;

import java.util.Stack;

@ToString
class Memento{
    public String name;

    public Memento(String name) {
        this.name = name;
    }
}
class School{
    private Memento memento;
    private History history = new History();

    public void setMemento(Memento memento) {
        this.memento = memento;
        this.history.addList(memento);
    }

    public void historyBack(){
        this.memento = history.pop();
    }

    @Override
    public String toString() {
        return "School{" +
                "memento=" + memento +
                ", listSize=" + history.getStack().size() +
                '}';
    }
}
@ToString
class History{
    Stack<Memento> stack = new Stack<>();

    public Stack<Memento> getStack() {
        return stack;
    }

    public void addList(Memento m){
        stack.push(m);
    }

    public Memento pop(){
        if(!stack.isEmpty()){
            return stack.pop();
        }
        return null;
    }
}
public class MementoMain {

    public static void main(String[] args) {
        School school = new School();

        Memento memento = new Memento("1오픈");
        school.setMemento(memento);
        Memento memento1= new Memento("2방학");
        school.setMemento(memento1);
        Memento memento0 = new Memento("3개학");
        school.setMemento(memento0);
        Memento memento11= new Memento("4방학");
        school.setMemento(memento11);
        Memento memento10 = new Memento("5개학");
        school.setMemento(memento10);
        Memento memento2= new Memento("6폐교");
        school.setMemento(memento2);


        System.out.println("school = " + school);
        school.historyBack();
        System.out.println("school = " + school);
        school.historyBack();
        school.historyBack();
        school.historyBack();
        System.out.println("school = " + school);


    }



}
