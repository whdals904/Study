package jm.study.book.디자인패턴.my;

import java.util.ArrayList;
import java.util.List;

abstract class IFactory{
    abstract Button createButton();
    abstract CheckBox createCheck();
}

abstract class Button{
    public void push(){
        System.out.println("Button이 눌려졌습니다.");
    }
}
abstract class CheckBox{
    public void check(){
        System.out.println("checkbox가 체크되었습니다.");
    }
}
class WindowButton extends Button{
    @Override
    public void push() {
        System.out.println("window Button이 눌려졌습니다.");
    }
}
class WindowCheckBox extends CheckBox{

    @Override
    public void check(){
        System.out.println("window checkbox가 체크되었습니다.");
    }
}
class WindowFactory extends IFactory{

    @Override
    Button createButton() {
        return new WindowButton();
    }
    @Override
    CheckBox createCheck() {
        return new WindowCheckBox();
    }
}
class LinuxButton extends Button{
    @Override
    public void push() {
        System.out.println("Linux Button이 눌려졌습니다.");
    }
}
class LinuxCheckBox extends CheckBox{
    @Override
    public void check(){
        System.out.println("Linux checkbox가 체크되었습니다.");
    }
}
class LinuxFactory extends IFactory{

    @Override
    Button createButton() {
        return new LinuxButton();
    }

    @Override
    CheckBox createCheck() {
        return new LinuxCheckBox();
    }
}
public class AbstractFactoryMain {
    public static void main(String[] args) {
        IFactory iFactory = new WindowFactory();
        Button button = iFactory.createButton();
        CheckBox checkbox = iFactory.createCheck();

        button.push();
        checkbox.check();

        IFactory iFactory1 = new LinuxFactory();
        Button button1 = iFactory1.createButton();
        CheckBox checkbox1 = iFactory1.createCheck();

        button1.push();
        checkbox1.check();
    }
}
