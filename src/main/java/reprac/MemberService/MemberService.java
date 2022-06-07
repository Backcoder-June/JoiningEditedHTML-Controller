package reprac.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reprac.Member;
import reprac.Memberreposit.interfacereposit;

import java.util.List;

//@Service
@Transactional
public class MemberService {


    private final interfacereposit interfaceReposit;
//@Autowired
    public MemberService(interfacereposit interfaceReposit) {
        this.interfaceReposit = interfaceReposit;
    }


    public Long join(Member member){

        notsame(member);

        interfaceReposit.save(member);

        return member.getId();
    }

    private void notsame(Member member){

    interfaceReposit.findByName(member.getName()).ifPresent(member1 ->
        {throw new IllegalStateException("이미 존재하는 회원입니다");
        });   }


    public List<Member> findMembers(){

        return interfaceReposit.findAll();
    }








}
