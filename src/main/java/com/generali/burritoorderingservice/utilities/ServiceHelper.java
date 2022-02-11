package com.generali.burritoorderingservice.utilities;

import com.generali.burritoorderingservice.constant.Protein;
import com.generali.burritoorderingservice.constant.Salsa;
import com.generali.burritoorderingservice.constant.Tortilla;
import com.generali.burritoorderingservice.constant.Vegetable;
import com.generali.burritoorderingservice.dto.OrderRequest;
import com.generali.burritoorderingservice.dto.OrderResponse;
import com.generali.burritoorderingservice.model.Order;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceHelper {

    public static Order convertOrderRequestToOrder(OrderRequest orderRequest){

        Order newOrder = new Order();
        newOrder.setTortilla(orderRequest.getTortilla().toString());
        newOrder.setProtein(orderRequest.getProtein().toString());
        newOrder.setVegetables(orderRequest.getVegetables().stream().map(Enum::toString).collect(Collectors.joining(",")));
        newOrder.setSalsa(orderRequest.getSalsa().toString());
        newOrder.setAvocadoCount(orderRequest.getAvocadoCount());
        return newOrder;
    }

    public static OrderResponse convertOrderToOrderResponse(Order order){

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(order.getId());
        orderResponse.setTortilla(Tortilla.valueOf(order.getTortilla()));
        orderResponse.setProtein(Protein.valueOf(order.getProtein()));
        orderResponse.setSalsa(Salsa.valueOf(order.getSalsa()));
        orderResponse.setAvocadoCount(order.getAvocadoCount());
        List<Vegetable> vegetableList = Arrays.stream(order.getVegetables()
                .split(","))
                .map(v -> Vegetable.valueOf(v)).collect(Collectors.toList());
        orderResponse.setVegetables(vegetableList);
        return orderResponse;
    }
}
