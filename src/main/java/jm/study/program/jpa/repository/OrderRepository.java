package jm.study.program.jpa.repository;

import jm.study.program.jpa.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class OrderRepository {
    @Autowired
    private EntityManager em;

    public void save(Order order){
        em.persist(order);
    }

    public Order findOne(Long orderId){
        return em.find(Order.class, orderId);
    }

    //public List<Order> findAll(OrderSearch orderSearch){...}
}
