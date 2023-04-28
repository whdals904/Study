package jm.study.book.designpattern.my.templatemethod;

abstract class TemplateMethod{
    abstract void Method1();
    abstract void Method2();
    abstract void Method3();

    public void executeMethod(){
        Method1();
        Method2();
        Method3();
    }
}

class TemplateMethodImpl extends TemplateMethod{

    @Override
    void Method1() {
        System.out.println("Method 1 execution !!");
    }

    @Override
    void Method2() {
        System.out.println("Me1thod 2 execution !!");
    }

    @Override
    void Method3() {
        System.out.println("Method 3 execution !!");

    }
}

public class TemplateMethodMain {

    public static void main(String[] args) {
        System.out.println("TemplateMethodMain start !!");
        TemplateMethod tmi = new TemplateMethodImpl();
        tmi.executeMethod();

    }
}
