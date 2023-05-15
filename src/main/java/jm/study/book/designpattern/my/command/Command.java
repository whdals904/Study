package jm.study.book.designpattern.my.command;


abstract class Command{

    protected final String cmd;

    Command(String cmd) {
        this.cmd = cmd;
    }

    public abstract void execution();

    public String getCmd() {
        return cmd;
    }

}