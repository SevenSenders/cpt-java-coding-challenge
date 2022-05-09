package com.sevensenders.cpt.codingchallenge.controller;

import com.sevensenders.cpt.codingchallenge.model.Shipment;
import com.sevensenders.cpt.codingchallenge.service.ShipmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShipmentController {

    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @GetMapping("/shipments")
    public List<Shipment> getAllShipments() {
        return shipmentService.fetchShipments();
    }
}
