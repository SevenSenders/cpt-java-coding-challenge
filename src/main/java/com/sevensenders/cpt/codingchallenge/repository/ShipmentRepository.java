package com.sevensenders.cpt.codingchallenge.repository;


import com.sevensenders.cpt.codingchallenge.model.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, Integer> {
}
