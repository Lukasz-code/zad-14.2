package com.kodilla.good.paterns.challenges.zad134;

public class DeliveryProcessor {


    private InformationService informationService;
    private DeliveryService deliveryService;
    private SystemRepository systemRepository;
    private ShopService shopService;

    public DeliveryProcessor(final InformationService informationService, final DeliveryService deliveryService, final SystemRepository systemRepository, final ShopService shopService) {


        this.informationService = informationService;
        this.deliveryService = deliveryService;
        this.systemRepository = systemRepository;
        this.shopService = shopService;
    }

    public DeliveryDTO process (DeliveryRequest deliveryRequest) {

        boolean isDelivered = deliveryService.delivery(deliveryRequest.getCustomer(),deliveryRequest.getDeliveryDate(), deliveryRequest.getOrderList());

        if (isDelivered) {
            shopService.process();
            informationService.sendInformation(deliveryRequest.getCustomer());
            systemRepository.createDeliveryRepository(deliveryRequest.getCustomer(), deliveryRequest.getOrderList(), deliveryRequest.getDeliveryDate());
            return new DeliveryDTO(deliveryRequest.getCustomer(),deliveryRequest.getOrderList(), true);

        } else {
            return new DeliveryDTO(deliveryRequest.getCustomer(),deliveryRequest.getOrderList(), false);
        }
    }
}
