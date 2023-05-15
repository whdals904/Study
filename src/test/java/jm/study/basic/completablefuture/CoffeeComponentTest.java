package jm.study.basic.completablefuture;

import lombok.extern.slf4j.Slf4j;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration(classes={CoffeeComponent.class,CoffeeRepository.class,TaskConfig.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CoffeeComponentTest {

    Executor executor = Executors.newFixedThreadPool(10);

    @Autowired
    private CoffeeComponent coffeeComponent;

    @Test
    public void T1_가격_조회_동기_블록킹_호출_테스트(){
        int expectedPrice =1100;
        int resultPrice = coffeeComponent.getPrice("latte");
        log.info("최종 가격 전달 받음");
        assertEquals(expectedPrice,resultPrice);
    }

    @Test
    public void T2_가격_조회_비동기_블록킹_호출_테스트(){
        int expectedPrice =1100;
        CompletableFuture<Integer> future = coffeeComponent.getPriceAsync("latte");
        log.info("아직 최동 데이트를 전달 받지는 않았지만, 다른 작업 수행 가능");
        int resultPrice = future.join();
        log.info("최종 가격 전달 받음");
        assertEquals(expectedPrice,resultPrice);
    }

    @Test
    public void T3_가격_조회_비동기_블록킹_호출_테스트_NEW(){
        int expectedPrice =1100;
        CompletableFuture<Integer> future = coffeeComponent.getPriceAsyncNew("latte");
        log.info("아직 최동 데이트를 전달 받지는 않았지만, 다른 작업 수행 가능");
        int resultPrice = future.join();
        log.info("최종 가격 전달 받음");
        assertEquals(expectedPrice,resultPrice);
    }

    @Test
    public void T4_가격_조회_비동기_호출_콜백_반환없음_테스트(){
        Integer expectedPrice =1100;
        CompletableFuture<Void> future = coffeeComponent
            .getPriceAsyncNew("latte")
            .thenAccept( p -> {
                log.info("콜백, 가격은 " + p + "원, 하지만 데이터를 반환하지는 않음");
                assertEquals(expectedPrice,p);
             });
        log.info("아직 최동 데이트를 전달 받지는 않았지만, 다른 작업 수행 가능, 논블록킹");
                /*
        아래 구문이 없으면, main thread 가 종료되기 때문에, thenAccept 확인하기 전에 끝나버림.
        그래서, 테스트를 위해서 메인쓰레드가 종료되지 않도록 블록킹으로 대기하기 위한 코드
        future 가 complete 가 되면 위에 작성한 thenAccept 코드가 실행이 됨
        */
        assertNull(future.join());
    }

    @Test
    public void T5_가격_조회_비동기_호출_콜백_반환_테스트(){
        Integer expectedPrice =1100 + 100;
        CompletableFuture<Void> future = coffeeComponent
                .getPriceAsyncNew("latte")
                .thenApply( p -> {
                    log.info("같은 쓰레드로 동작");
                    return p + 100;
                }).thenAccept( p -> {
                    log.info("콜백, 가격은 " + p + "원, 하지만 데이터를 반환하지는 않음");
                    assertEquals(expectedPrice,p);
                });
        log.info("아직 최동 데이트를 전달 받지는 않았지만, 다른 작업 수행 가능, 논블록킹");
                /*
        아래 구문이 없으면, main thread 가 종료되기 때문에, thenAccept 확인하기 전에 끝나버림.
        그래서, 테스트를 위해서 메인쓰레드가 종료되지 않도록 블록킹으로 대기하기 위한 코드
        future 가 complete 가 되면 위에 작성한 thenAccept 코드가 실행이 됨
        */
        assertNull(future.join());
    }

    @Test
    public void T6_가격_조회_비동기_호출_콜백_반환_테스트_별도쓰레드(){
        Integer expectedPrice =1100 + 100;
        CompletableFuture<Void> future = coffeeComponent
                .getPriceAsyncNew("latte")
                .thenApplyAsync( p -> {
                    log.info("같은 쓰레드로 동작");
                    return p + 100;
                },executor).thenAcceptAsync( p -> {

                    log.info("콜백, 가격은 " + p + "원, 하지만 데이터를 반환하지는 않음");
                    assertEquals(expectedPrice,p);
                },executor);
        log.info("아직 최동 데이트를 전달 받지는 않았지만, 다른 작업 수행 가능, 논블록킹");
                /*
        아래 구문이 없으면, main thread 가 종료되기 때문에, thenAccept 확인하기 전에 끝나버림.
        그래서, 테스트를 위해서 메인쓰레드가 종료되지 않도록 블록킹으로 대기하기 위한 코드
        future 가 complete 가 되면 위에 작성한 thenAccept 코드가 실행이 됨
        */
        assertNull(future.join());
    }
}
