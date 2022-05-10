package com.sevensenders.cpt.codingchallenge.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.Instant;

@Data
@Entity(name = "OrderEntity")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private String shopOrderId;

    private String shopOrderUrl;

    private Instant createdAt;

    private Instant updatedAt;
}
