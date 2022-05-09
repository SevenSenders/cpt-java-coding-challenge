package com.sevensenders.cpt.codingchallenge.service;

import com.sevensenders.cpt.codingchallenge.model.Shipment;
import com.sevensenders.cpt.codingchallenge.model.ShipmentStatus;
import com.sevensenders.cpt.codingchallenge.repository.ShipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public List<Shipment> findAllShipments() {
        return (List<Shipment>) shipmentRepository.findAll();
    }

    public void changeShipmentStatus(Integer id, ShipmentStatus status) {
        Shipment shipment = shipmentRepository.findById(id).get();
        ShipmentStatus currentStatus = shipment.getShipmentStatus();
        if (currentStatus == null && status == ShipmentStatus.NEW
                || currentStatus == ShipmentStatus.NEW && status == ShipmentStatus.IN_TRANSIT
                || currentStatus == ShipmentStatus.IN_TRANSIT && status == ShipmentStatus.DELIVERED) {
            shipment.setShipmentStatus(status);
            shipmentRepository.save(shipment);
        }
    }
}
