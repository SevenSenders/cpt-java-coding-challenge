package com.sevensenders.cpt.codingchallenge.controller;

import com.sevensenders.cpt.codingchallenge.model.Order;
import com.sevensenders.cpt.codingchallenge.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    private final OrderService orderService;

    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public List<Order> findAllOrders() {
        return orderService.findAllOrders();
    }

}
