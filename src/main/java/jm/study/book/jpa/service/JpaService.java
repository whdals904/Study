package jm.study.book.jpa.service;

import jm.study.book.jpa.entity.Member;
import jm.study.book.jpa.entity.Team;
import jm.study.book.jpa.repository.MemberRepository;
import jm.study.book.jpa.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class JpaService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Transactional
    public void insertTeam(Team team){
        teamRepository.insertTeam(team);
    }
    @Transactional
    public Team selectTeam(Long seq){
        return teamRepository.selectTeam(seq);
    }

    public List<Team> findAllTeam(){
        return teamRepository.findAllTeam();
    }

    public void insertMember(Member member){
        memberRepository.insertMember(member);
    }

    public List<Member> findAllMember(){
        return memberRepository.findAllMember();
    }


}
