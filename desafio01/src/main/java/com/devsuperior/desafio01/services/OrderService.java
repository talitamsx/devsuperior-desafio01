package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order){

        double basic = order.getBasic();
        double discount = order.getDiscount();

        double valueDiscount = basic * discount/100;

        double basicDiscount = basic - valueDiscount;

        double shipment = shippingService.shipment(order);

        double total = basicDiscount + shipment;
        return total;
    }

}
