package jm.study.book.designpattern.my.state;


class On implements PowerState{

    @Override
    public void PowerPush() {
        System.out.println("Power Off");
    }
}

class Off implements PowerState{
    @Override
    public void PowerPush() {
        System.out.println("Saving Mode");
    }
}

class Saving implements PowerState{

    @Override
    public void PowerPush() {
        System.out.println("Power on");
    }
}

class Laptop{

    private PowerState powerState;

    public Laptop() {
        this.powerState = new Off();
    }

    public void PowerPush(){
        this.powerState.PowerPush();
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }
}


public class StateMain {
    public static void main(String[] args) {
        System.out.println(" State Design Pattern !!");
        Off off = new Off();
        On on = new On();
        Saving saving = new Saving();

        Laptop laptop = new Laptop();

        laptop.PowerPush();
        laptop.setPowerState(on);
        laptop.PowerPush();
        laptop.setPowerState(off);
        laptop.PowerPush();
        laptop.setPowerState(saving);
        laptop.PowerPush();

    }
}
