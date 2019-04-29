package org.springframework.samples.petclinic.items;

import org.springframework.samples.petclinic.store.IStoreItem;

public class Collar implements IStoreItem {
    private String collarName = "Unused dog collar";

    @Override
    public double getPrice() {
        return 100.0;
    }

    @Override
    public double getDiscount() {
        return 5.0;
    }

}
