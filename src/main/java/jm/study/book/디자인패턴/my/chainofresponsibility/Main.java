package jm.study.book.디자인패턴.my.chainofresponsibility;


class NaverPay extends Pay{


    public NaverPay(String name) {
        super(name);
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
}

class TossPay extends Pay{


    public TossPay(String name) {
        super(name);
    }

    public Pay setNextResp(Pay nextResp) {
        this.nextResp = nextResp;
        return this;
    }
}


public class Main {
    public static void main(String[] args) {
        Pay naverPay = new NaverPay("네이버 페이");
        Pay kakaoPay = new KakaoPay("카카오 페이");
        Pay tossPay = new TossPay("토스 페이");


        naverPay.setNextResp(kakaoPay);
        kakaoPay.setNextResp(tossPay);
        naverPay.process();
    }

}
