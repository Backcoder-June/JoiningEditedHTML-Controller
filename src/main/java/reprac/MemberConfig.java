package reprac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reprac.MemberService.MemberService;
//import reprac.Memberreposit.Memberreposit;
//import reprac.Memberreposit.JPAreposit;
import reprac.Memberreposit.interfacereposit;

import javax.persistence.EntityManager;

@Configuration
public class MemberConfig {

    private final interfacereposit interfaceREposit;
    @Autowired
    public MemberConfig(interfacereposit interfaceREposit) {
        this.interfaceREposit = interfaceREposit;
    }


    @Bean
    public MemberService memberService(){
        return new MemberService(interfaceREposit);
    }




/*
    private EntityManager em;

    @Autowired
    public MemberConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    JPAreposit jpAreposit(){
        return new JPAreposit(em);}
    @Bean
    MemberService memberService(){
        return new MemberService(jpAreposit());
    }

*/





    /*@Bean
    public interfacereposit interfaceREposit(){
        return new Memberreposit();
    }


    @Bean
    public MemberService memberservice(){
        return new MemberService(interfaceREposit());
    }

*/

}
