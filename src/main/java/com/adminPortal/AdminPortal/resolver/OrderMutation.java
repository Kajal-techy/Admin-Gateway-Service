package com.adminPortal.AdminPortal.resolver;

import com.adminPortal.AdminPortal.dao.OrderProxy;
import com.adminPortal.AdminPortal.model.Order;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderMutation implements GraphQLMutationResolver {

    private OrderProxy orderProxy;

    public OrderMutation(OrderProxy orderProxy) {
        this.orderProxy = orderProxy;
    }

    public Order createOrder(String productId, String userId, int quantity) {
        Order order = Order.builder().productId(productId).userId(userId).quantity(quantity).build();
        ResponseEntity<Order> responseEntity = orderProxy.createOrder(order);
        return responseEntity.getBody();
    }
}
