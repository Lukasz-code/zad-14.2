package com.kodilla.good.paterns.challenges.zad132;

public class SellingProcessor {

    private InformationService informationService;
    private SellRepository sellRepository;
    private SellService sellService;

    public SellingProcessor(final InformationService informationService, final SellRepository sellRepository, final SellService sellService) {
        this.informationService = informationService;
        this.sellRepository = sellRepository;
        this.sellService = sellService;
    }

    public SellingDTO process(final SellRequest sellRequest) {

        boolean isSold = sellService.sell(sellRequest.getUser(), sellRequest.getBuyDate(), sellRequest.getDeliveryDate(), sellRequest.getProduct());

        if (isSold) {
            informationService.inform(sellRequest.getUser(), sellRequest.getProduct());
            sellRepository.createSellRepository(sellRequest.getUser(), sellRequest.getBuyDate(), sellRequest.getDeliveryDate(), sellRequest.getProduct());
            sellService.sell(sellRequest.getUser(), sellRequest.getBuyDate(), sellRequest.getDeliveryDate(), sellRequest.getProduct());
            return new SellingDTO(sellRequest.getUser(), sellRequest.getProduct(), true);
        } else {
            return new SellingDTO(sellRequest.getUser(), sellRequest.getProduct(), false);
        }
    }
}
