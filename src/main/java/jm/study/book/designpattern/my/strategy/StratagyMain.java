package jm.study.book.designpattern.my.strategy;

class Kal implements Weapone{

    @Override
    public void attack() {
        System.out.println("칼을 휘두른다");
    }
}
class Gun implements Weapone{

    @Override
    public void attack() {
        System.out.println("총을 쏜다");
    }
}
public class StratagyMain {

    private Weapone weapone;

    public void setWeapone(Weapone weapone) {
        this.weapone = weapone;
    }

    public void attack(){
        weapone.attack();;
    }

    public static void main(String[] args) {
        StratagyMain sm = new StratagyMain();
        sm.setWeapone(new Kal());
        sm.attack();
        sm.setWeapone(new Gun());
        sm.attack();
    }
}
