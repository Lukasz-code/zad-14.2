package com.kodilla.good.paterns.challenges.zad134;

public class Aplication {
    public static void main(String[] args) {
        DeliveryRequestData deliveryRequestData = new DeliveryRequestData();
        DeliveryRequest deliveryRequest = deliveryRequestData.data();
        ProductsWarehouse productsWarehouse = new ProductsWarehouse();

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(
                new SendEmail(),
                new Delivery(productsWarehouse),
                new DeliveryRepository());

        deliveryProcessor.process(deliveryRequest);

    }
}
