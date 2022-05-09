package com.sevensenders.cpt.codingchallenge.model;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

    private Integer orderId;

    private String trackingCode;

    private String warehouseAddress;

    @Enumerated(EnumType.STRING)
    private ShipmentStatus shipmentStatus;

    private BigDecimal weight;

    private Instant createdAt;

    private Instant updatedAt;
}
