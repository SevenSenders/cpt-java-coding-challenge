package com.sevensenders.cpt.codingchallenge.service;

import com.sevensenders.cpt.codingchallenge.model.Shipment;
import com.sevensenders.cpt.codingchallenge.model.ShipmentStatus;
import com.sevensenders.cpt.codingchallenge.repository.ShipmentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ShipmentServiceTest {

    @Mock
    private ShipmentRepository repository;
    @InjectMocks
    private ShipmentService shipmentService;

    @Test
    public void shouldChangeShipmentStatus() {
        Shipment shipment = new Shipment();
        shipment.setShipmentId(1);
        when(repository.findById(1)).thenReturn(Optional.of(shipment));

        shipmentService.changeShipmentStatus(1, ShipmentStatus.NEW);

        // assert status changed
        assertThat(shipment.getShipmentStatus()).isEqualTo(ShipmentStatus.NEW);
    }

    @Test
    public void shouldFailToChangeShipmentStatus() {
        Shipment shipment = new Shipment();
        shipment.setShipmentId(1);
        shipment.setShipmentStatus(ShipmentStatus.IN_TRANSIT);
        when(repository.findById(1)).thenReturn(Optional.of(shipment));

        shipmentService.changeShipmentStatus(1, ShipmentStatus.NEW);

        // assert status not changed
        assertThat(shipment.getShipmentStatus()).isEqualTo(ShipmentStatus.IN_TRANSIT);
    }
}