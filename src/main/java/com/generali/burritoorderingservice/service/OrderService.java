package com.generali.burritoorderingservice.service;

import com.generali.burritoorderingservice.dto.OrderRequest;
import com.generali.burritoorderingservice.dto.OrderResponse;
import com.generali.burritoorderingservice.exception.ResourceNotFoundException;
import com.generali.burritoorderingservice.model.Order;
import com.generali.burritoorderingservice.repository.OrderRepository;
import com.generali.burritoorderingservice.utilities.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public OrderResponse createOrder(OrderRequest newOrderRequest){

        Order newOrder = ServiceHelper.convertOrderRequestToOrder(newOrderRequest);
        Order response = orderRepository.save(newOrder);
        return ServiceHelper.convertOrderToOrderResponse(response);
    }

    @Transactional
    public OrderResponse getOrder(long id){

        Order order = orderRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Order", "id", id));
        return ServiceHelper.convertOrderToOrderResponse(order);
    }
}
