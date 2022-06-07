/*
package reprac.Memberreposit;

import org.springframework.beans.factory.annotation.Autowired;
import reprac.Member;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class JPAreposit implements interfacereposit{

    private final EntityManager em;
@Autowired
    public JPAreposit(EntityManager em) {
        this.em = em;
    }


    @Override
    public Member save(Member member) {

    em.persist(member);
    return member;
    }

    @Override
    public Optional<Member> findByName(String name) {

        List result = em.createQuery("select m from Member m where m.name =: name", Member.class)
                .setParameter("name", name).getResultList();
        return result.stream().findAny();
    }

    @Override
    public Optional<Member> findById(Long id) {

        Member fm = em.find(Member.class, id);
        return Optional.ofNullable(fm);
    }

    @Override
    public List<Member> findAll() {

        List<Member> resultList = em.createQuery("select m from Member m", Member.class)
                .getResultList();
        return resultList;
    }
}
*/
