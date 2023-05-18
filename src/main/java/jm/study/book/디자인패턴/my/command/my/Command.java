package jm.study.book.디자인패턴.my.command.my;


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