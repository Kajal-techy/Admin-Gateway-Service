package com.adminPortal.AdminPortal.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Order {

    String orderId;

    String productId;

    String userId;

    int quantity;

    int points;

    LocalDateTime orderDate;

    LocalDateTime expectedDeliveryDate;
}
