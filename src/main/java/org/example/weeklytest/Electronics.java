package org.example.weeklytest;

public class Electronics extends Product {

    private String brand;

    public Electronics(String name, int price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }

    public int calculatePrice() {

        if (brand.equals("Apple")) {
            return getPrice() + getPrice() / 5;
        }
        return getPrice();
    }
}
