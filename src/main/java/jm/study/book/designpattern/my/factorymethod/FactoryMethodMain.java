package jm.study.book.designpattern.my.factorymethod;

abstract class User{
    public abstract void singup();
}

class NaverUser extends User{

    @Override
    public void singup() {
        System.out.println("NaverUser singup");
    }
}

class KakaoUser extends User{

    @Override
    public void singup() {
        System.out.println("KakaoUser singup");
    }
}

abstract class Factory{
    public abstract User newInstance();
}
class NaverFactory extends Factory{
    @Override
    public User newInstance() {
        return new NaverUser();
    }
}
class KakaoFactory extends Factory{
    @Override
    public User newInstance() {
        return new KakaoUser();
    }
}


public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory factory = new KakaoFactory();
        User user = factory.newInstance();
        user.singup();;

        factory = new NaverFactory();
        user = factory.newInstance();
        user.singup();;
    }
}
