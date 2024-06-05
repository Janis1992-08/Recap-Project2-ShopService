package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public Order getOrder(String id) {
        for (Order order : orders) {
            if (order.orderId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }


}
