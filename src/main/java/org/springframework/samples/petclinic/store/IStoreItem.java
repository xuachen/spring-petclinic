package org.springframework.samples.petclinic.store;

public interface IStoreItem {
    /**
     * Get price for store item.
     * @return price as double
     */
    public double getPrice();

    /**
     * Get discount for store item.
     * @return discount as double
     */
    public double getDiscount();
}
