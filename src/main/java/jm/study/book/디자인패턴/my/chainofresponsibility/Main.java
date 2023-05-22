package jm.study.book.디자인패턴.my.chainofresponsibility;


class NaverPay extends Pay{


    public NaverPay(String name) {
        super(name);
    }

    @Override
    public void process(int price) {
        if(price > 3){
            System.out.println(this.name);
        }else{
            nextResp.process(price);
        }
    }

    public Pay setNextResp(Pay nextResp) {
        this.nextResp = nextResp;
        return this;
    }

}
class KakaoPay extends Pay{

    public KakaoPay(String name) {
        super(name);
    }

    public Pay setNextResp(Pay nextResp) {
        this.nextResp = nextResp;
        return this;
    }
    @Override
    public void process(int price) {
        if(price > 2){
            System.out.println(this.name);
        }else{
            nextResp.process(price);
        }
    }
}

class TossPay extends Pay{

    public TossPay(String name) {
        super(name);
    }

    public Pay setNextResp(Pay nextResp) {
        this.nextResp = nextResp;
        return this;
    }

    @Override
    public void process(int price) {
        if(price > 1){
            System.out.println(this.name);
        }else{
            nextResp.process(price);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pay naverPay = new NaverPay("네이버 페이");
        Pay kakaoPay = new KakaoPay("카카오 페이");
        Pay tossPay = new TossPay("토스 페이");

        naverPay.setNextResp(kakaoPay);
        kakaoPay.setNextResp(tossPay);
        naverPay.process(2);
        naverPay.process(3);
        naverPay.process(4);
    }
}
