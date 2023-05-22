package jm.study.book.디자인패턴.my.singleton;


class Singleton1{

    private static Singleton1 INSTANCE = null;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton1();
        }
        return INSTANCE;
    }


}

class Singleton2{

    private final static Singleton2 INSTANCE = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return INSTANCE;
    }
}
//요청 시 초기화 홀더 패턴(INITIALIZATION-ON-DEMAND HOLDER PATTERN)
class Singleton3 {

    private static final class Holder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return Singleton3.Holder.INSTANCE;
    }

}

enum Elvis {
    INSTANCE;

    public String getName() {
        return "Elvis";
    }

    public void leaveTheBuilding() {  }
}

public class Main {

    public static void main(String[] args) {
        /*
        문제점
        1.리플렉션 API인 AccessibleObject.setAccessible을 사용해 private 생성자를 호출할 수 있다.

        2. 직렬화 역직렬화시 다른 인스턴스 반환
        이 문제를 해결하기 위해
        private Obejct readResolve() {
        	return INSTANCE;
        }
         */
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton1.getInstance());

        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());

        System.out.println(Singleton3.getInstance());
        System.out.println(Singleton3.getInstance());

        System.out.println("Elvis.INSTANCE.getName() = " + Elvis.INSTANCE.getName());

    }
}
