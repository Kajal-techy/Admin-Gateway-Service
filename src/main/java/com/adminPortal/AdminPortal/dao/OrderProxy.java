package com.adminPortal.AdminPortal.dao;

import com.adminPortal.AdminPortal.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("order-service")
public interface OrderProxy {

    @GetMapping("/v1/order/{id}")
    ResponseEntity<Order> getOrderById(@PathVariable(value = "id") String id);

    @PostMapping("/v1/order")
    ResponseEntity<Order> createOrder(Order order);
}
