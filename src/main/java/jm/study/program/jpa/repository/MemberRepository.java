package jm.study.program.jpa.repository;

import jm.study.program.jpa.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public Long save(Member m) {
        entityManager.persist(m);
        return m.getId();
    }
    @Transactional
    public Member find(Long id){
        return entityManager.find(Member.class,id);
    }
}