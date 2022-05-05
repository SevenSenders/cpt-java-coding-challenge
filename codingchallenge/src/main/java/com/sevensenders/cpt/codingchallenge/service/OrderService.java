package com.sevensenders.cpt.codingchallenge.service;

import com.sevensenders.cpt.codingchallenge.model.Order;
import com.sevensenders.cpt.codingchallenge.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> fetchOrders() {
        return (List<Order>) orderRepository.findAll();
    }

}
