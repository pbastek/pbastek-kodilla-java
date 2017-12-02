package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private OrderRepository orderRepository;
    private OrderService orderService;
    private InformationService informationService;

    public ProductOrderService(OrderRepository orderRepository, OrderService orderService, InformationService informationService) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
        this.informationService = informationService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getOrderDate());

        if (isOrdered) {
            informationService.announcement(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getOrderDate());
            orderRepository.addOrderToDatabase(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getOrderDate(), true);

            return new OrderDto(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getOrderDate(), true);
        } else {
            orderRepository.addOrderToDatabase(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getOrderDate(), false);
            return new OrderDto(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getOrderDate(), false);
        }
    }
}
