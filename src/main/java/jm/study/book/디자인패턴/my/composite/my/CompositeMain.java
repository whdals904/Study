package jm.study.book.디자인패턴.my.composite.my;

import java.util.ArrayList;
import java.util.List;

abstract class Entry {
    protected final String name;
    private int size;
    public String getName(){
        return name;
    }
    public int getSize() {
        return size;
    }

    public Entry(String name) {
        this.name = name;
    }

    protected abstract void printList(String prefix);

    public String toString(){
        return getName() + " (" + getSize() + ")";
    }
}
class Directory extends Entry{

    List<Entry> list = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(Entry e){
        list.add(e);
    }
    @Override
    protected void printList(String prefix){
        System.out.println("this = " + this);
        System.out.println("prefix = " + prefix);

        System.out.println(prefix + "/" + this);

        for(Entry e : list){
            e.printList(prefix + "/" + name);
        }
    }
}
class File extends Entry{

    public File(String name) {
        super(name);
    }

    protected void printList(String prefix){
        System.out.println(prefix + "/" + this);
    }
}
public class CompositeMain {
    public static void main(String[] args) {
        Directory d = new Directory("Root");
        Directory d1 = new Directory("Programming");
        File f1 = new File("java.ppt");
        Directory d2= new Directory("Programming1");
        File f2 = new File("java.ppt1");
        File f3 = new File("java.ppt2");
        File f4 = new File("java.ppt3");
        d1.add(f1);
        d.add(d1);

        d2.add(f2);
        d2.add(f3);
        d2.add(f4);
        d.add(d2);

        d.printList(" ");
    }
}
