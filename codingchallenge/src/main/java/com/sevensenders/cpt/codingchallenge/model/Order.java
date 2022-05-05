package com.sevensenders.cpt.codingchallenge.model;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.Instant;

@Data
@Entity(name = "OrderEntity")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private Integer shipmentId;

    private Instant createdAt;

    private Instant updatedAt;
}
