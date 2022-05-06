package com.sevensenders.cpt.codingchallenge.service;

import com.sevensenders.cpt.codingchallenge.model.Shipment;
import com.sevensenders.cpt.codingchallenge.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    public List<Shipment> fetchShipments() {
        return (List<Shipment>) shipmentRepository.findAll();
    }
}
