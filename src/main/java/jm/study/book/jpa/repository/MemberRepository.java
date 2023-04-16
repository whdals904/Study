package jm.study.book.jpa.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jm.study.book.jpa.entity.Member;
import jm.study.book.jpa.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

import static jm.study.book.jpa.entity.QMember.member;

@Repository
public class MemberRepository {

    @Autowired
    private JPAQueryFactory query;

    @Autowired
    private EntityManager em;

    @Transactional
    public void insertMember(Member m) {
        em.persist(m);
        System.out.println("m = " + m);
    }

    @Transactional
    public Member selectMember(Long seq){
        return em.find(Member.class,seq);
    }

    @Transactional
    public List<Member> findAllMember() {

//        return query.selectFrom(member).fetch();
//        return query.selectFrom(member).leftJoin(member.school,school).where(member.seq.gt(2)).fetch();

        //queryDsl
//        return query.selectFrom(member)
//                .join(member.team)
//                .orderBy(member.seq.desc())
//                .fetch();

        //fetch join
        return em.createQuery("select m from Member m join fetch m.team", Member.class).getResultList();
    }
}
