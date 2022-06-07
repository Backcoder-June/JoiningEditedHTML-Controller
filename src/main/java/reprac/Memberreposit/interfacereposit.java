package reprac.Memberreposit;

import reprac.Member;

import java.util.List;
import java.util.Optional;

public interface interfacereposit {

    Member save(Member member);

    Optional<Member> findByName(String name);

    Optional<Member> findById(Long id);

    List<Member> findAll();




}
