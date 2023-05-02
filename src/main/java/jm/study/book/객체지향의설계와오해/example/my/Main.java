package jm.study.book.객체지향의설계와오해.example.my;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Barista barista = new Barista();
        MenuItem mi = new MenuItem();
        mi.setName("카푸치노");
        mi.setPrice(10000);
        customer.order(barista,mi);
    }

}
