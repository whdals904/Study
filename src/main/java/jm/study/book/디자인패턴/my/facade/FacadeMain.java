package jm.study.book.디자인패턴.my.facade;


class Beverage{
    private final String name;

    Beverage(String name) {
        this.name = name;
    }

    public void Prepare()
    {
        System.out.println(name+" 음료 준비 완료 ");
    }
}
class RemoteControl{
    public void TurnOnTv(){
        System.out.println("TV를 킨다.");
    }
    public void TurnOffTv(){
        System.out.println("TV를 끈다.");
    }
}
class Movie{
    private final String name;

    Movie(String name) {
        this.name = name;
    }
    public void SearchMovie(){
        System.out.println(name + " 영화를 찾는다.");
    }
    public void ChargeMovie(){
        System.out.println("영화를 결제하다.");
    }
    public void PlayMovie(){
        System.out.println("영화 재생");
    }
}

class Facade{
    private String movie_name;
    private String beverage_name;

    public Facade(String movie, String beverage) {
        this.movie_name = movie;
        this.beverage_name = beverage;
    }

    public void Movie_View(){
        Beverage beverage = new Beverage(beverage_name);
        RemoteControl remote= new RemoteControl();
        Movie movie = new Movie(movie_name);

        beverage.Prepare();
        remote.TurnOnTv();
        movie.SearchMovie();
        movie.ChargeMovie();
        movie.PlayMovie();
    }
}

public class FacadeMain {
    public static void main(String[] args) {
        Facade facade = new Facade("벤허","콜라");
        facade.Movie_View();
    }
}
