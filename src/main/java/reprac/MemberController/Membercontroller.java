package reprac.MemberController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import reprac.Member;
import reprac.MemberService.MemberService;

import java.util.List;

@Controller
public class Membercontroller {

    private final MemberService memberservice;
@Autowired
    public Membercontroller(MemberService memberservice) {
        this.memberservice = memberservice;
    }


    @GetMapping("/members/join")
    public String joinpage(){
        return "Members/joinpage";
    }

    @PostMapping("/members/join")
    public String dojoin(memberForm memberform){
        Member member = new Member();
        member.setName(memberform.getName());
     try { memberservice.join(member);}
     catch(IllegalStateException e){return "error"; }
         return "Home2";
}

    @GetMapping("/members")
    public String memberList(Model model){
        List<Member> members = memberservice.findMembers();
        model.addAttribute("students", members);
        return "Members/memberlist";
    }











}
