package org.springframework.samples.petclinic.items;

import org.springframework.samples.petclinic.store.IStoreItem;

public class Litter implements IStoreItem {

    @Override
    public double getPrice() {
        return 125.0;
    }

    @Override
    public double getDiscount() {
        return 15.0;
    }

}
