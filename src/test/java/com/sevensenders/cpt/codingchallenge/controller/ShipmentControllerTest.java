package com.sevensenders.cpt.codingchallenge.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.sevensenders.cpt.codingchallenge.model.Shipment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ShipmentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void shouldFindAllShipments() throws Exception {
        var response = mockMvc.perform(get("/api/shipments"))
                .andExpect(status().isOk())
                .andReturn().getResponse();

        CollectionType type = objectMapper.getTypeFactory().constructCollectionType(List.class, Shipment.class);
        List<Shipment> shipments = objectMapper.readValue(response.getContentAsString(), type);

        assertThat(shipments).hasSize(3);
        assertThat(shipments).extracting(Shipment::getShipmentId).containsExactly(1, 2, 3);
    }
}