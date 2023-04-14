package jm.study.book.jpa.controller;

import jm.study.book.jpa.dto.MemberDto;
import jm.study.book.jpa.entity.Member;
import jm.study.book.jpa.entity.Team;
import jm.study.book.jpa.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Controller
public class JpaController {

    @Autowired
    private JpaService jpaService;

    @Autowired
    private EntityManager em;



    @GetMapping("/select/team")
    @ResponseBody
    @Transactional
    public Team selectTeam(Long seq){

        return jpaService.selectTeam(1L);
    }


    @GetMapping("/select/member/{seq}")
    @ResponseBody
    @Transactional
    public MemberDto selectMember(@PathVariable("seq") Long seq){
        Member m = jpaService.selectMember(seq);
        MemberDto md = new MemberDto(m);
        return md;
    }

    @GetMapping("/select/findAllTeam")
    @ResponseBody
    @Transactional
    public List<Team> findAllTeam(){
        List<Team> li = jpaService.findAllTeam();
        System.out.println("teams = " + li);
        return li;
    }

    @GetMapping("/select/findAllMember")
    @ResponseBody
    @Transactional
    public List<Member> findAllMember(){
        List<Member> li = jpaService.findAllMember();
        System.out.println("Member = " + li);
        return li;
    }


    @GetMapping("/insert/member")
    @ResponseBody
    @Transactional
    public String insertMember(){


        Team t = new Team();
        t.setSeq(1L);

        Member m = new Member();
        m.setName("김종민");
        m.setAge(40);
        m.changeTeam(t);

        jpaService.insertMember(m);
        return "member Success";
    }

    @GetMapping("/insert/team")
    @ResponseBody
    @Transactional
    public String insertTeam(){
        Team t = new Team();
        t.setName("LG트윈스");
        jpaService.insertTeam(t);

        return "Team Success";
    }

    @ResponseBody
    @Transactional
    @GetMapping("/init")
    public String init(){

        //  System.out.println("selectTeam ============== " + jpaService.selectTeam(1L));
//
//        Team tt1 = new Team();
//        tt1.setSeq(1L);
//
//        Member m = new Member();
//        m.setName("김종민");
//        m.setAge(40);
//        m.changeTeam(jpaService.selectTeam(1L));
//
//        jpaService.insertMember(m);

        Team t = new Team();
        t.setName("LG트윈스");
        jpaService.insertTeam(t);

        Team t1 = new Team();
        t1.setName("SK와이번스");
        jpaService.insertTeam(t1);

        Team t2 = new Team();
        t2.setName("두산베어스");
        jpaService.insertTeam(t2);

        Member m = new Member();
        m.setName("김종민");
        m.setAge(40);
        m.changeTeam(t);
        jpaService.insertMember(m);

        Member m1 = new Member();
        m1.setName("김아름");
        m1.setAge(38);
        m1.changeTeam(t1);
        jpaService.insertMember(m1);

        Member m2 = new Member();
        m2.setName("김호철");
        m2.setAge(36);
        m2.changeTeam(t2);
        jpaService.insertMember(m2);

        Member m3 = new Member();
        m3.setName("김종윤");
        m3.setAge(37);
        m3.changeTeam(t1);
        jpaService.insertMember(m3);

        return "init";
    }
}
