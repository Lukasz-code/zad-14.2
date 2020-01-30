package com.kodilla.good.paterns.challenges.zad132;

public class Application {

    public static void main(String[] args) {

        SellRequestRetriver sellRequestRetriver = new SellRequestRetriver();
        SellRequest sellRequest = sellRequestRetriver.retrive();

        SellingProcessor sellingProcessor = new SellingProcessor(new MailService(), new ProductRepository(), new ProductOrderService());
        sellingProcessor.process(sellRequest);
    }
}
