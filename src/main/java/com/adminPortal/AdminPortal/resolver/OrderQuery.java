package com.adminPortal.AdminPortal.resolver;

import com.adminPortal.AdminPortal.dao.OrderProxy;
import com.adminPortal.AdminPortal.model.Order;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderQuery implements GraphQLQueryResolver {

    private OrderProxy orderProxy;

    public OrderQuery(OrderProxy orderProxy) {
        this.orderProxy = orderProxy;
    }

    public Order getOrderById(String id) {
        ResponseEntity<Order> order = orderProxy.getOrderById(id);
        log.info("res = " + order.getBody());
        return order.getBody();
    }
}




