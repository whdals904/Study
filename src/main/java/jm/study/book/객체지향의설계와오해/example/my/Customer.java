package jm.study.book.객체지향의설계와오해.example.my;

public class Customer {

    public void order(Barista barista, MenuItem mi){
        System.out.println("Rcv Coffee = " + barista.order(mi));
    }
}
