package com.generali.burritoorderingservice.repository;

import com.generali.burritoorderingservice.constant.Protein;
import com.generali.burritoorderingservice.constant.Salsa;
import com.generali.burritoorderingservice.constant.Tortilla;
import com.generali.burritoorderingservice.constant.Vegetable;
import com.generali.burritoorderingservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    // this default method is only for temporary mocking of getting database data.
    default Optional<Order> findById(Long aLong){

        Order mockingOrder = new Order();
        mockingOrder.setId(new Long(1234));
        mockingOrder.setTortilla(Tortilla.CORN.toString());
        mockingOrder.setProtein(Protein.BEEF.toString());
        mockingOrder.setSalsa(Salsa.MEDIUM.toString());
        mockingOrder.setVegetables(Vegetable.CABBAGE.toString()+","+Vegetable.CORN.toString());
        mockingOrder.setAvocadoCount(2);
        return Optional.of(mockingOrder);
    }

    // this default method is only for temporary mocking of saving data into database.
    default Order save(Order order){

        Order mockingSavedOrder = new Order();
        mockingSavedOrder.setId(new Long(4567));
        mockingSavedOrder.setTortilla(order.getTortilla());
        mockingSavedOrder.setProtein(order.getProtein());
        mockingSavedOrder.setSalsa(order.getSalsa());
        mockingSavedOrder.setVegetables(order.getVegetables());
        mockingSavedOrder.setAvocadoCount(order.getAvocadoCount());
        return mockingSavedOrder;
    }
}
