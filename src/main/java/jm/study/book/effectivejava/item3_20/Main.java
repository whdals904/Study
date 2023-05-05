package jm.study.book.effectivejava.item3_20;

class Warrior implements Character{
    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public void hunt() {
        System.out.println("Warrior hunt");
    }

    @Override
    public void levelUp() {
        System.out.println("levelUp");
    }

    @Override
    public void process() {
        create();
        hunt();
        levelUp();
        System.out.println("============");
    }
}

class Archer implements Character {

    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public void hunt() {
        System.out.println("archer hunt");
    }

    @Override
    public void levelUp() {
        System.out.println("levelup");
    }

    @Override
    public void process() {
        create();
        hunt();
        levelUp();
        System.out.println("============");
    }

}

abstract class AbstractCharacter implements Character{
    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public void levelUp() {
        System.out.println("levelup");
    }

    @Override
    public void process() {
        create();
        hunt();
        levelUp();
        System.out.println("============");
    }
}

class WarriorNew extends AbstractCharacter {

    @Override
    public void hunt() {
        System.out.println("WarriorNew hunt");
    }
}

class ArcherNew extends AbstractCharacter {

    @Override
    public void hunt() {
        System.out.println("ArcherNew hunt");
    }
}

public class Main{
    public static void main(String[] args) {
        Warrior w = new Warrior();
        w.process();

        WarriorNew wn = new WarriorNew();
        wn.process();
    }
}