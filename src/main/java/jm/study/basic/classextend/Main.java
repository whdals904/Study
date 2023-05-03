package jm.study.basic.classextend;

class Parent{
    public Parent() {
        System.out.println("Parent class");
    }

    public void method1() {
        System.out.println("Parent Method1 ");
        method2();
    }

    public void method2() {
        System.out.println("Parent method2 ");
    }
}
class Child extends Parent{
    public Child() {
        System.out.println("Child class");
    }
    @Override
    public void method1() {
        super.method1();
        System.out.println("Child Method1 ");
    }

    public void method2() {
        System.out.println("Child method2 ");
    }
}
public class Main {
    public static void main(String[] args) {
        Child  child = new Child();
        child.method1();
    }
}
