package jm.study.program.jpa.service;

import jm.study.program.jpa.domain.Member;
import jm.study.program.jpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long join(Member m){
        validateDuplicatedMember(m);
        memberRepository.save(m);
        return m.getId();
    }

    private void validateDuplicatedMember(Member m){
        if(!memberRepository.findByName(m.getName()).isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Member findOne(Long memberId){
        return memberRepository.findOne(memberId);
    }
}
