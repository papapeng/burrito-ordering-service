package com.generali.burritoorderingservice.controller;

import com.generali.burritoorderingservice.dto.OrderRequest;
import com.generali.burritoorderingservice.dto.OrderResponse;
import com.generali.burritoorderingservice.model.Order;
import com.generali.burritoorderingservice.service.OrderService;
import com.generali.burritoorderingservice.utilities.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public OrderResponse createOrder(@Valid @RequestBody OrderRequest newOrderRequest) {
        return orderService.createOrder(newOrderRequest);
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/{orderId}")
    public OrderResponse getOrder(@PathVariable long orderId){
        return orderService.getOrder(orderId);
    }
}
