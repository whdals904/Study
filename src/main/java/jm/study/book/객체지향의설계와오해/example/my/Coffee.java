package jm.study.book.객체지향의설계와오해.example.my;

import lombok.ToString;

@ToString
public class Coffee {

    private String name;
    private int price;

    public Coffee(MenuItem mi){
        this.name = mi.getName();
        this.price = mi.getPrice();
    }
}
