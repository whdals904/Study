package jm.study.book.jpa.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jm.study.book.jpa.entity.Member;
import jm.study.book.jpa.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

import static jm.study.book.jpa.entity.QTeam.team;
@Repository
public class TeamRepository {

    @Autowired
    private JPAQueryFactory query;

    @Autowired
    private EntityManager em;

    @Transactional
    public void insertTeam(Team t) {
        em.persist(t);
    }
    @Transactional
    public Team selectTeam(Long seq){
        return em.find(Team.class,seq);
    }
    @Transactional
    public List<Team> findAllTeam() {
        System.out.println("=================QUERY_DSL=====================");
//        return query.selectFrom(member).fetch();
//        return query.selectFrom(member).leftJoin(member.school,school).where(member.seq.gt(2)).fetch();
        return query.selectFrom(team).fetch();
    }
}
