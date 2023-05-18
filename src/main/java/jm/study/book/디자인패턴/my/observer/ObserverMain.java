package jm.study.book.디자인패턴.my.observer;

import java.util.ArrayList;
import java.util.List;

class Observer{
    private List<Client> list = new ArrayList<>();

    public void subscribe(Client client){
        list.add(client);
    }
    public void broadcast(String msg){
        for (Client c : list) {
            c.update(msg);
        }
    }
    public int getSubscribes(){
        return list.size();
    }
}

public class ObserverMain {
    public static void main(String[] args) {
        System.out.println("Design Pattern ObserverPattern Start!!");
        Observer ob = new Observer();
        ob.subscribe(new Client() {
            @Override
            public void update(String msg) {
                System.out.println("first Client : " + msg);
            }
        });

        ob.subscribe(new Client() {
            @Override
            public void update(String msg) {
                System.out.println("second Client : " + msg);
            }
        });

        ob.broadcast("broadCasting Msg !!!!!!!");
        System.out.println("ob.getSubscribes() = " + ob.getSubscribes());

    }
}
