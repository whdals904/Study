package jm.study.book.디자인패턴.my.chainofresponsibility;

public abstract class Pay {
        Pay nextResp = null;
        private String name;

    public Pay(String name) {
        this.name = name;
    }

    public void process(){
        System.out.println("this.name = " + this.name);
        processNextResp();
    }

        public abstract Pay setNextResp(Pay nextResp);

        public void processNextResp(){
           if(this.nextResp != null){
               this.nextResp.process();
           }
        }
}
