package jm.study.book.designpattern.my.command.answer;

class Button{
    private Command command;

    public Button(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressed(){
        command.execution();
    }
}

class Lamp {
    public void turnOn(){ System.out.println("Lamp On"); }
}
class Alarm {
    public void start(){ System.out.println("Alarming"); }
}

class LampOnCommand implements Command{
    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }
    @Override
    public void execution() {
        lamp.turnOn();
    }
}


class AlarmStartCommand implements Command{

    private Alarm alram;

    public AlarmStartCommand(Alarm alram) {
        this.alram = alram;
    }

    @Override
    public void execution() {
        alram.start();
    }
}

class CommandMain {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        Alarm alarm = new Alarm();
        Command alarmStartCommand = new AlarmStartCommand(alarm);

        Button button1 = new Button(lampOnCommand); // 램프 켜는 Command 설정
        button1.pressed(); // 램프 켜는 기능 수행

        Button button2 = new Button(alarmStartCommand); // 알람 울리는 Command 설정
        button2.pressed(); // 알람 울리는 기능 수행
        button2.setCommand(lampOnCommand); // 다시 램프 켜는 Command로 설정
        button2.pressed(); // 램프 켜는 기능 수행
    }
}

