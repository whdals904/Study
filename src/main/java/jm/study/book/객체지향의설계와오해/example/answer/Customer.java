package jm.study.book.객체지향의설계와오해.example.answer;

class Customer {
    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println("coffee = " + coffee);
    }
}

