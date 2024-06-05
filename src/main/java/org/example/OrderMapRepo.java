package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OrderMapRepo implements OrderRepo {

    private Map<String, Order> orderMap;

    public OrderMapRepo() {
        orderMap = new HashMap<>();
    }


    @Override
    public void addOrder(Order order) {
        orderMap.put(order.orderId(), order);
    }

    @Override
    public void removeOrder(Order order) {
        orderMap.remove(order.orderId());
    }

    @Override
    public Order getOrder(String orderId) {
        return orderMap.get(orderId);
    }

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orderMap.values());
    }


}
