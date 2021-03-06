/*
package reprac.Memberreposit;

import org.springframework.stereotype.Repository;
import reprac.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

//@Repository
public class Memberreposit implements interfacereposit{


    private static Long sequence = 0L;

    private static HashMap<Long, Member> store = new HashMap<>();


    @Override
    public Member save(Member member) {

        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findByName(String name) {

        return store.values().stream().filter(member -> member.getName().equals(name)).findAny();

    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<Member>(store.values());
    }
}
*/
