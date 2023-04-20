package jm.study.program.jpa.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jm.study.program.jpa.domain.Order;
import jm.study.program.jpa.domain.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import java.util.List;

import static jm.study.program.jpa.domain.QOrder.order;
import static jm.study.program.jpa.domain.QMember.member;


@Repository
public class OrderRepository {
    @Autowired
    private JPAQueryFactory query;

    @Autowired
    private EntityManager em;

    public void save(Order order){
        em.persist(order);
    }

    public Order findOne(Long orderId){
        return em.find(Order.class, orderId);
    }

    public List<Order> findAllByString(OrderSearch orderSearch){

        return query.selectFrom(order).join(order.member, member)
                .where(statusEq(orderSearch.getOrderStatus()),
                        nameLike(orderSearch.getMemberName()))
                .limit(1000)
                .fetch();
    }
    private BooleanExpression statusEq(OrderStatus statusCond){
        if(statusCond == null){
            return null;
        }
        return order.status.eq(statusCond);
    }


    private BooleanExpression nameLike(String nameCond){
        if(!StringUtils.hasText(nameCond)){
            return null;
        }
        return member.name.like(nameCond);
    }

}
