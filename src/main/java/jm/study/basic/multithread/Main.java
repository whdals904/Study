package jm.study.basic.multithread;


import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class Main {

    public static void threadStart1(){
         Worker worker = new Worker();
        worker.start();

        Worker worker1 = new Worker();
        worker1.start();
    }

    public static void main(String[] args) throws InterruptedException {
        log.info("Multi Thread Programming");
        ExecutorService executor = Executors.newFixedThreadPool(10);


        CoinMine coinMine = new CoinMine();
        Coin[] coins = coinMine.getCoin();
/*        for(Coin coin : coins){
            System.out.println(coin);
        }*/

        Worker worker = new Worker();
        worker.setType("A");
        worker.setCoins(coins);

        Worker worker1 = new Worker();
        worker1.setType("B");
        worker1.setCoins(coins);

        executor.execute(worker);
        executor.execute(worker1);

        for(int i = 0 ; i < 5 ; i++){
            Arrays.stream(coins).forEach(System.out::print);
            Thread.sleep(1000);
        }
    }
}

@Slf4j
class Worker extends Thread{

    private Coin[] coins;
    private String type;
    private int workCnt;


    public void setCoins(Coin[] coins) {
        this.coins = coins;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void run() {
        log.info("worker start !! " + Thread.currentThread().getName());
        int startNum = 0;

        if(type != null && type.equals("A")){
            startNum = 1;
        }
        for(int i = startNum; i < coins.length ; i=i+2){
            log.info(this.toString());
            coins[i] = null;
            workCnt++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        log.info("worker end !! " + Thread.currentThread().getName());
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName() +
                "{" +
           //     "coins=" + Arrays.toString(coins) +
                ", type='" + type + '\'' +
                ", workCnt=" + workCnt +
                '}';
    }
}

enum Coin {
    BITCOIN("BITCOIN",2000000), ECASH("ECASH",5000), ETHREERUM("ETHREERUM",1000000), RIPPLE("RIPPLE",200);
    String name;
    int price;

    Coin(String name, int i) {
        this.name = name;
        this.price = i;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class CoinMine {
    private Coin[] coin = new Coin[100];

    public CoinMine() {
        for(int i = 0 ; i < coin.length ; i++){
            if(i%4 == 0){
                coin[i] = Coin.BITCOIN;
            }else if(i%4 == 1){
                coin[i] = Coin.ECASH;
            }else if(i%4 == 2){
                coin[i] = Coin.ETHREERUM;
            }else if(i%4 == 3){
                coin[i] = Coin.RIPPLE;
            }
        }
    }

    public Coin[] getCoin() {
        return coin;
    }
}