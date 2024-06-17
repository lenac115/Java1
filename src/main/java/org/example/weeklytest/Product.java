package org.example.weeklytest;

public class Product {

    private String name;
    private int price;
    private int stock;
    private Type type;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int calculatePrice() {
        return price;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
