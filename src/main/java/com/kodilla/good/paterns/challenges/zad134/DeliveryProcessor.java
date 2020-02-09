package com.kodilla.good.paterns.challenges.zad134;

public class DeliveryProcessor {

    private OrderToShopsService orderToShopsService;
    private InformationService informationService;
    private DeliveryService deliveryService;
    private SystemRepository systemRepository;

    public DeliveryProcessor( final OrderToShopsService orderToShopsService, final InformationService informationService, final DeliveryService deliveryService, final SystemRepository systemRepository) {

        this.orderToShopsService = orderToShopsService;
        this.informationService = informationService;
        this.deliveryService = deliveryService;
        this.systemRepository = systemRepository;
    }

    public deliveringDTO process (DeliveryRequest deliveryRequest) {

        boolean isDelivered = DeliveryService.delivery();

        if (isDelivered) {



        } else {



        }




    }


}
