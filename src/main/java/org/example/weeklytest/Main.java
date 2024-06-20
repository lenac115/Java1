package org.example.weeklytest;

public class Main {
    public static void main(String[] args) {
        ShoppingMall shoppingMall = new PremiumShoppingMall(5);

        try {
            shoppingMall.removeProduct("옷");
        } catch (ProductArrayBoundException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 1; i < 4; i++) {
            shoppingMall.addProduct(new Clothing("옷" + i, i * 1000, 10, "L"));
        }

        try {
            shoppingMall.removeProduct(shoppingMall.searchProduct("옷3"));
        } catch (ProductArrayBoundException e) {
            System.out.println(e.getMessage());
        }


        shoppingMall.displayProducts();

        for (int i = 1; i < 4; i++) {
            shoppingMall.addProduct(new Food("음식" + i, i * 5000, 10, 6));
        }

        shoppingMall.addStock("음식2", 10);


        try {
            shoppingMall.removeProduct("음식2");
        } catch (ProductArrayBoundException e) {
            System.out.println(e.getMessage());
        }


        for (int i = 1; i < 4; i++) {
            shoppingMall.addProduct(new Electronics("전자제품" + i, i * 5000, 10, "Apple"));
        }

        shoppingMall.displayProducts();
        shoppingMall.order("음식2");
        shoppingMall.order("음식2");
        shoppingMall.displayProducts(Type.ELECTRONICS);
        shoppingMall.displayProducts(Type.FOOD);
        shoppingMall.displayProducts("옷");
    }
}
