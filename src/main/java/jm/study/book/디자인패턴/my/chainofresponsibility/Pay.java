package jm.study.book.디자인패턴.my.chainofresponsibility;

public abstract class Pay {
    Pay nextResp = null;
    protected String name;

    public Pay(String name) {
        this.name = name;
    }

    public abstract void process(int price);

   public abstract Pay setNextResp(Pay nextResp);

   public void processNextResp(int price){
    if(this.nextResp != null){
        this.nextResp.process(price);
    }
   }
}
