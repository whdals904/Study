package jm.study.program.jpa.repository;

import jm.study.program.jpa.domain.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Repository
@Slf4j
@RequiredArgsConstructor
public class MemberRepository {

    @PersistenceContext
    private EntityManager entityManager;

    private final ThreadPoolTaskExecutor threadPoolTaskExecutor;


    long i = 0L;

    public Long save(Member m) {
        entityManager.persist(m);
        return m.getId();
    }

    public CompletableFuture<Long> saveCompatableFutureNew(Member m) {
        entityManager.persist(m);
        log.warn ("saveCompatableFutureNew1 =========== ");

        return CompletableFuture.supplyAsync(()->{ //여기부터 별도의 스레드
            log.warn ("saveCompatableFutureNew2 =========== " + i);
           // try{Thread.sleep(1000);}catch (Exception e){e.printStackTrace();}
            return m.getId();
            }, threadPoolTaskExecutor
        );
    }
    public Member findOne(Long id){
        return entityManager.find(Member.class,id);
    }

    public List<Member> findAll(){
        return entityManager.createQuery("select m from Member m", Member.class).getResultList();
    }

    public List<Member> findByName(String name){
        return entityManager.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }

}