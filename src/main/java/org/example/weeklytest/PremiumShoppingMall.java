package org.example.weeklytest;

public class PremiumShoppingMall extends ShoppingMall {
    public PremiumShoppingMall(int idx) {
        super(idx);
    }

    @Override
    public void order(String name) {

        int idx;
        try {
            idx = searchProduct(name);
        } catch (ProductArrayBoundException e) {
            System.out.println(e.getMessage());
            return;
        }

        Product[] searched = getProducts();

        if (checkOrderAvailability(searched[idx])) {

            searched[idx].setStock(searched[idx].getStock() - 1);
            setProducts(searched);
            System.out.println(searched[idx].getName() + " 구매 완료, 가격 : " + searched[idx].calculatePrice());
            System.out.println(searched[idx].getName() + " 남은 재고 : " + searched[idx].getStock());
        } else {
            System.out.println("재고가 부족합니다.");
        }
    }

    @Override
    public Boolean checkOrderAvailability(Product p) {

        if (p.getStock() >= 10) {
            return true;
        }
        return false;
    }
}
