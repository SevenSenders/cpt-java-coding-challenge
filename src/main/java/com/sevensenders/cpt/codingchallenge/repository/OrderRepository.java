package com.sevensenders.cpt.codingchallenge.repository;


import com.sevensenders.cpt.codingchallenge.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
