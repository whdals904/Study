package jm.study.book.designpattern.my.mediator;

import java.util.ArrayList;
import java.util.List;

abstract class Mediator{
    protected List<Member> list = new ArrayList<>();

    public void addMember(Member m){
        list.add(m);
    }
    public abstract void mediate(String data);
}

class ChatMediator extends Mediator{
    public void mediate(String data){
        for(Member m : list){
            m.receive(data);
        }
    }
}
abstract class Member{

    protected Mediator mediator;
    protected String name;

    public Member(String name) {
        this.name = name;
    }

    public void regMediator(Mediator mediator){
        this.mediator = mediator;
        mediator.addMember(this);
    }
    public void send(String data){
        this.mediator.mediate(data);
    }
    public abstract void receive(String msg);
}

class ChatMember extends Member{
    public ChatMember(String name) {
        super(name);
    }

    public void receive(String msg){
        System.out.println(this.name + ", msg = " + msg);
    }
}
public class MediatorMain {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();
        ChatMember chatMember1 = new ChatMember("홍길순");
        ChatMember chatMember2 = new ChatMember("김종민");
        ChatMember chatMember3 = new ChatMember("김종윤");

        chatMember1.regMediator(chatMediator);
        chatMember2.regMediator(chatMediator);
        chatMember3.regMediator(chatMediator);

        chatMember1.send("가가가");
        chatMember2.send("나나나");
        chatMember3.send("다다다");
    }
}
