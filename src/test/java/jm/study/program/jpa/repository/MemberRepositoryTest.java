package jm.study.program.jpa.repository;

import jm.study.program.jpa.domain.Address;
import jm.study.program.jpa.domain.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {
    
    @Autowired
    private MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void 멤버저장() throws Exception {
        //given
        Member m = new Member();
        m.setName("김종민");
        Address a = new Address("김포","김포한강8로","4300-5061");
        m.setAddress(a);

        Long id = memberRepository.save(m);
        Member findMember = memberRepository.find(id);

        assertEquals(findMember.getId(),id);
        assertEquals(findMember,m);

        Member m1 = new Member();
        m1.setName("김종윤");
        Address a1 = new Address("김포","김포한강8로","4300-5061");
        m1.setAddress(a1);

        a1.setCity("시애틀");
        
        //when
        Long id1 = memberRepository.save(m1);
        Member findMember1 = memberRepository.find(id);
        //then
        assertEquals(findMember1.getId(),id);
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
    
    }
}