package reprac.Memberreposit;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import reprac.Member;

import java.util.List;
import java.util.Optional;

public interface SpringJPAreposit extends JpaRepository<Member, Long>, interfacereposit {


    @Override
    Member save(Member member);
    @Override
    Optional<Member> findByName(String name);

    @Override
    Optional<Member> findById(Long id);

    @Override
    List<Member> findAll();
}
