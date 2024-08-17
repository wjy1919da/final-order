package com.cmall.orderservice.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Table("Carts")
public class Cart {
    @PrimaryKey
    private UUID cartId;

    private UUID userId;
    private Map<String, Integer> items; // Item ID as key, quantity as value
    private Date updatedAt;
}
