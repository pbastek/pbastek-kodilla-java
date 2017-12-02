package com.kodilla.good.patterns.challenges;

public class RunApp {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.Retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new OrderToRepository(), new OrderItem(), new Messager());

        productOrderService.process(orderRequest);
    }
}
