package jm.study.program.jpa.controller;

import jm.study.program.jpa.domain.Address;
import jm.study.program.jpa.domain.Member;
import jm.study.program.jpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/members/new")
    public String createForm(Model model){
        model.addAttribute("memberForm", new MemberForm());
        return  "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form, BindingResult result){
        if(result.hasErrors()){
            return "members/createMemberForm";
        }
        Address a = new Address(form.getCity(),form.getStreet(),form.getZipcode());

        Member member = new Member();
        member.setName(form.getName());
        member.setAddress(a);

        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}
