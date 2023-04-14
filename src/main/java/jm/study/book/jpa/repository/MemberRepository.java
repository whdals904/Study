package jm.study.book.jpa.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jm.study.book.jpa.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static jm.study.book.jpa.entity.QMember.member;

@Repository
public class MemberRepository {

    @Autowired
    private JPAQueryFactory query;

    @Autowired
    private EntityManager em;

    public void insertMember(Member m) {
        em.persist(m);
        System.out.println("m = " + m);
    }

    public List<Member> findAllMember() {

//        return query.selectFrom(member).fetch();
//        return query.selectFrom(member).leftJoin(member.school,school).where(member.seq.gt(2)).fetch();
        return query.selectFrom(member)
                .where(member.seq
                        .gt(2))
                .orderBy(member.seq.desc())
                .fetch();
    }
}
