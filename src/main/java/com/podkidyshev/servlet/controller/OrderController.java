package com.podkidyshev.servlet.controller;

import com.podkidyshev.servlet.entity.Order;
import com.podkidyshev.servlet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;


    @GetMapping("{id}")
    public Order getById(@PathVariable Long id) {
        return orderService.getById(id);
    }

    @GetMapping("/all")
    public List<Order> getAll() {
        return orderService.getAll();
    }
}
