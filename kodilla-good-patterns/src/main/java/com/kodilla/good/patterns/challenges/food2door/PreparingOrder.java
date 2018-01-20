package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class PreparingOrder {

    private ProcessOrderRunner processOrderRunner;

    public PreparingOrder(ProcessOrderRunner processOrderRunner) {
        this.processOrderRunner = processOrderRunner;
    }

    public void processOrderCreator(AuxiliaryOrderRetriever auxiliaryOrderRetriever) {

        System.out.println("Preparing order process ...");
        processOrderRunner.process(new Order(auxiliaryOrderRetriever.getProduct(), LocalDateTime.now(), auxiliaryOrderRetriever.getQuantity()));
    }
}
