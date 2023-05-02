package jm.study.book.객체지향의설계와오해.example.my;

public class Barista {

    public Coffee order(MenuItem mi){
        Coffee coffee = new Coffee(mi);
        return coffee;
    }
}
