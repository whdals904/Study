package jm.study.book.designpattern.my.command.my;

import java.util.PriorityQueue;


class Com extends Command{

    Com(String cmd) {
        super(cmd);
    }

    @Override
    public void execution() {
        System.out.println(this.cmd);
    }
}

public class CommandMain {
    public static void main(String[] args) {
        PriorityQueue<Command> list = new PriorityQueue<>(
                (o1, o2) -> {
                    return o1.getCmd().length() - o2.getCmd().length();
                }
        );
        Command com1 = new Com("Cancel Cmd");
        Command com3 = new Com("Act Cmd");
        Command com2 = new Com("do Cmd");
        Command com4= new Com("Execution Cmd");

        list.add(com1);
        list.add(com3);
        list.add(com2);
        list.add(com4);

        System.out.println("list.size() = " + list.size());
        for(int i = 0 ; i < 4; i++){
            list.poll().execution();
        }
    }
}
