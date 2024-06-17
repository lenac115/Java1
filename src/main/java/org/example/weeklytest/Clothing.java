package org.example.weeklytest;

public class Clothing extends Product {

    private String size;

    public Clothing(String name, int price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }


    public int calculatePrice() {

        if (size.equals("L")) {
            return getPrice() + getPrice() / 10;
        }
        return getPrice();
    }
}
