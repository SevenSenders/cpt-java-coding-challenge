package com.sevensenders.cpt.codingchallenge.model;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Entity
public class Shipment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer shipmentId;

    private String trackingCode;

    private String warehouseAddress;

    private String shipmentStatus;

    private BigDecimal weight;

    private Instant createdAt;

    private Instant updatedAt;
}
