package jm.study.book.designpattern.my.composite.answer;

import java.util.ArrayList;
import java.util.Iterator;

//Entry.java
//담길 수 있는 형태의 interface 우리는 Composite 객체에 Entry를 담는다.
abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public void printList(){
        printList(" ");
    }

    protected abstract void printList(String prefix);
    public String toString(){
        return getName() + " (" + getSize() + ")";
    }
}
//FileTreatmentException.java
//예외 처리
class FileTreatmentException extends RuntimeException{
    public FileTreatmentException(){
    }
    public FileTreatmentException(String msg){
        super(msg);
    }
}
//Entry.java
//leaf 객체 이다. 무언가를 담을 수는 없지만 Entry를 상속함으로서 담길 수는 있다.
class File extends Entry{
    private String name;
    private int size;
    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }

    protected void printList(String prefix){
        System.out.println(prefix + "/" + this);
    }
}
//Directory.java
//Entry들을 담을 수 있는 Composite 클래스 이다. Composite class도 Entry를 상속함으로서 다른 Composite의 entry가 될수 있다.

class Directory extends Entry{
    private String name;
    private ArrayList directory = new ArrayList();
    public Directory(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        int size = 0 ;
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }

    protected void printList(String prefix){
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
//Main.java
public class CompositeMain {
    public static void main(String args[]){
        try{
            System.out.println("Making root entries ... ");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");

            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.printList();
        }catch(FileTreatmentException e){
            e.printStackTrace();
        }
    }
}

