package jm.study.book.객체지향의설계와오해.example.answer;

class MenuItem {
    private String name;
    private int price;
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int cost() {
        return price;
    }
}

