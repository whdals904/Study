package jm.study.program.jpa.repository;

import jm.study.program.jpa.domain.Address;
import jm.study.program.jpa.domain.Member;
import jm.study.program.jpa.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import javax.validation.constraints.AssertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Slf4j
class MemberRepositoryTest {
    
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberService memberService;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    List<Member> list = new ArrayList<>();

    @Test
    @DisplayName("멤버저장하는 테스트")
    public void 멤버저장() throws Exception {
        //given
        Member m = new Member();
        m.setName("김종민");
        Address a = new Address("김포","김포한강8로","4300-5061");
        m.setAddress(a);

        Long id = memberRepository.save(m);
        Member findMember = memberRepository.findOne(id);

        assertEquals(findMember.getId(),id);
        assertEquals(findMember,m);

        Member m1 = new Member();
        m1.setName("김종윤");
        Address a1 = new Address("김포","김포한강8로","4300-5061");
        m1.setAddress(a1);
        a1.setCity("시애틀");
        
        //when
        Long id1 = memberRepository.save(m1);
        Member findMember1 = memberRepository.findOne(id1);

        a1.setCity("시카고");
        //then
        assertEquals(findMember1.getId(),id1);
        assertEquals(findMember1,m1);

    }
    
    @BeforeEach
    public void 초기화() throws Exception {
        //given
        Member m = new Member();
        m.setName("홍길순");
        Address a = new Address("서울","수유3동","2200-5221");
        m.setAddress(a);
        //when
        Long id = memberRepository.save(m);
        //then
        for(int i = 0 ; i < 10 ; i++){
            Member m1 = new Member();
            m1.setName("김종민-" + i);
            Address a1 = new Address("김포","김포한강8로","4300-5061");
            m1.setAddress(a1);
            list.add(m1);
        }
    }


    @Test
    @Rollback(value = false)
    public void 비동기_테스트() throws Exception {

        long start = System.currentTimeMillis();
        list.forEach((m)->{
              log.warn("inner foreach !!");
              memberRepository.saveCompatableFutureNew(m).thenAccept(p->{
                    log.warn("================== Receive " + p);
               }); //여기까지 별도의 스레드
        });

        long end = System.currentTimeMillis();
        log.warn("======================================");
        log.warn("(end - start) = " + (end - start));
        log.warn("======================================");
    }
}