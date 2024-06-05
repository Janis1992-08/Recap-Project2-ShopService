package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ProductRepo productRepo = new ProductRepo();

        productRepo.addProduct(new Product ("Bionella", "B192828", 4.99));
        productRepo.addProduct(new Product ("Erdnussbutter", "E138328", 3.69));


//        OrderListRepo orderListRepo = new OrderListRepo();
//        ShopService shopService = new ShopService(productRepo, orderListRepo);
//
//        shopService.placeOrder("O221", Arrays.asList("B192828", "E138328"));
//        shopService.placeOrder("O222", Arrays.asList("E138328", "M029340"));


        OrderMapRepo orderMapRepo = new OrderMapRepo();
        ShopService shopServiceMap = new ShopService(productRepo, orderMapRepo);


        shopServiceMap.placeOrder("O221", Arrays.asList("B192828", "E138328"));
        shopServiceMap.placeOrder("O221", Arrays.asList("B192828", "M029340"));

        System.out.println(orderMapRepo);




    }
}