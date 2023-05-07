package jm.study.book.designpattern.my.visitor;

import java.util.ArrayList;
import java.util.List;

abstract class Entry implements Element{

    public String name;

    public Entry(String name) {
        this.name = name;
    }
    public abstract void add(Entry entry);
}

class File extends Entry{

    public File(String name) {
        super(name);
    }

    @Override
    public void add(Entry entry) {

    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
class Directory extends Entry{
    List<Entry> directory = new ArrayList();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void add(Entry entry) {
        this.directory.add(entry);
    }

    public List<Entry> getDirectory() {
        return directory;
    }
}

abstract class Visitor {
    abstract void visit(File file);
    abstract void visit(Directory dictionary);
}

class ViewVisitor extends Visitor{
    private String Path ="";
    @Override
    void visit(File file) {
        System.out.println(Path + "/" + file.name);
    }

    @Override
    void visit(Directory directory) {
        Path = Path + "/" + directory.name;
        System.out.println(Path);
        for(Entry e : directory.getDirectory()){
            e.accept(this);
        }
    }
}

public class VisitorMain {

    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory Lkt = new Directory("Lkt");
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");

        root.add(file1);
        bin.add(file2);
        bin.add(file3);
        Lkt.add(file4);
        root.add(Lkt);
        root.add(bin);

        root.accept(new ViewVisitor());    //경로 출력
    }
}
