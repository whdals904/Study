package jm.study.book.객체지향의설계와오해.example.answer;

public class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}


