package org.example;

import java.util.List;
import java.util.ArrayList;

public class ShopService {

    private ProductRepo productRepo;
//    private OrderListRepo orderListRepo;
    private OrderMapRepo orderMapRepo;

    public ShopService(ProductRepo productRepo, OrderMapRepo orderMapRepo) {
        this.productRepo = productRepo;
//        this.orderListRepo = orderRepo;
        this.orderMapRepo = orderMapRepo;
    }

    public void placeOrder(String orderId, List<String> productIds) {

        List<Product> products = new ArrayList<>();
        for (String productId : productIds) {
            Product product = productRepo.getProduct(productId);
            if (product == null) {
                System.out.println("Product with ID " + productId + " does not exist.");
                return;
            }
            products.add(product);
        }
        Order order = new Order(orderId, products);

//        orderListRepo.addOrder(order);
        orderMapRepo.addOrder(order);
        System.out.println("Order placed successfully.");
    }


}
