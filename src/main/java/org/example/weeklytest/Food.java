package org.example.weeklytest;

public class Food extends Product {

    private int expirationDate;

    public Food(String name, int price, int stock, int expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }


    public int calculatePrice() {

        if (expirationDate <= 7) {
            return getPrice() - getPrice() / 5;
        }

        return getPrice();
    }
}
