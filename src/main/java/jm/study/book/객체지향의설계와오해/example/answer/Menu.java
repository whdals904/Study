package jm.study.book.객체지향의설계와오해.example.answer;


import java.util.List;

public class Menu {
    private List<MenuItem> items;
    public Menu(List<MenuItem> items) {
        this.items = items;
    }
    public MenuItem choose(String name) {
        for (MenuItem each : items) {
            if (each.equals(name)) {
                return each;
            }
        }
        return null;
    }
}


