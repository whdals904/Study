package jm.study.book.designpattern.my.bridge;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


class Animal{
    private Hunting hunting;

    public Animal(Hunting hunting) {
        this.hunting = hunting;
    }
    
    public void Find_Quarry(){
        this.hunting.Find_Quarry();
    }
    public void Detect_Quarry(){
        this.hunting.Detect_Quarry();
    }
    public void Attack(){
        this.hunting.Attack();
    }

    public void hunt(){
        Find_Quarry();
        Detect_Quarry();
        Attack();
    }

}

class Lion extends Animal{

    public Lion(Hunting hunting) {
        super(hunting);
    }
}

class Tiger extends Animal{

    public Tiger(Hunting hunting) {
        super(hunting);
    }
}

abstract class Hunting{
    public abstract void Find_Quarry();
    public abstract void Detect_Quarry();
    public abstract void Attack();
}

class HuntingMethod1 extends Hunting{

    @Override
    public void Find_Quarry() {
        System.out.println("사자 사냥법");
    }

    @Override
    public void Detect_Quarry() {
        System.out.println("사자 탐색법");
    }

    @Override
    public void Attack() {
        System.out.println("사자 공격");
    }
}

class HuntingMethod2 extends Hunting{

    @Override
    public void Find_Quarry() {
        System.out.println("호랑이 사냥법");
    }

    @Override
    public void Detect_Quarry() {
        System.out.println("호랑이 탐색법");
    }

    @Override
    public void Attack() {
        System.out.println("호랑이 공격");
    }
}
public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Lion(new HuntingMethod1());
       // animal1.hunt();
        Animal animal2 = new Tiger(new HuntingMethod2());
       // animal2.hunt();

        List<Animal> list = new ArrayList<>();
        list.add(animal1);
        list.add(animal2);
        list.stream().forEach(Animal::hunt);
    }

    
}
