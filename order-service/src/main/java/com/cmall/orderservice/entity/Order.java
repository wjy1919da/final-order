package com.cmall.orderservice.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Table("Orders")
public class Order {
    @PrimaryKey
    private UUID orderId;
    private UUID customerId;
    private List<String> items;
    private String status;
    private BigDecimal totalAmount;
    private Date createdAt;
    private Date updatedAt;
}
