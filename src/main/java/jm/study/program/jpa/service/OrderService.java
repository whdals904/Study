package jm.study.program.jpa.service;

import jm.study.program.jpa.domain.*;
import jm.study.program.jpa.repository.ItemRepository;
import jm.study.program.jpa.repository.MemberRepository;
import jm.study.program.jpa.repository.OrderRepository;
import jm.study.program.jpa.repository.OrderSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    @Autowired
    private final MemberRepository memberRepository;
    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;

    @Transactional
    public Long order(Long memberId, Long itemId, int count){
        Member member = memberRepository.findOne(memberId);
        Item item = itemRepository.findOne(itemId);

        Delivery delivery = new Delivery();
        delivery.setAddress(member.getAddress());
        delivery.setStatus(DeliveryStatus.READY);

        OrderItem orderItem = OrderItem.createOrderItem(item, item.getPrice(), count);
        Order order = Order.createOrder(member, delivery, orderItem);

        orderRepository.save(order);
        return order.getId();
    }
    @Transactional
    public void cancelOrder(Long orderId){

        Order order = orderRepository.findOne(orderId);
        order.cancel();
    }

    @Transactional
    public List<Order> findOrders(OrderSearch orderSearch) {
        return orderRepository.findAllByString(orderSearch);
    }
}
