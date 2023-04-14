package jm.study.book.jpa.controller;

import jm.study.book.jpa.entity.Member;
import jm.study.book.jpa.entity.Team;
import jm.study.book.jpa.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.util.List;

@Controller
public class JpaController {

    @Autowired
    private JpaService jpaService;

    @GetMapping("/select/team")
    @ResponseBody
    @Transactional
    public Team selectTeam(Long seq){
        return jpaService.selectTeam(seq);
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
        t.setName("LG트윈스");
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
}
