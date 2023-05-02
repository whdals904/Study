package jm.study.book.객체지향의설계와오해.example.answer;

public class Coffee {
    private String name;
    private int price;
    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.cost();
    }
}
