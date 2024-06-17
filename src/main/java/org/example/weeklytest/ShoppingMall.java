package org.example.weeklytest;

public abstract class ShoppingMall {

    private Product[] products;
    private int lastIdx = -1;

    public ShoppingMall(int idx) {
        products = new Product[idx];
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    private void addSome(Product p) {
        if (lastIdx == products.length - 1) {
            Product[] newProducts = new Product[products.length * 2];
            for (int i = 0; i < products.length; i++) {
                newProducts[i] = products[i];
            }
            products = newProducts;
            products[lastIdx] = p;
        } else {
            products[lastIdx + 1] = p;
            lastIdx++;
        }
    }

    public void addProduct(Clothing clothing) {

        clothing.setType(Type.CLOTHING);
        addSome(clothing);
    }

    public void addProduct(Food food) {

        food.setType(Type.FOOD);
        addSome(food);
    }

    public void addProduct(Electronics electronics) {

        electronics.setType(Type.ELECTRONICS);
        addSome(electronics);
    }

    public void removeProduct() throws ProductArrayBoundException {
        if (lastIdx >= 0) {
            products[lastIdx] = null;
            lastIdx--;
        } else {
            throw new ProductArrayBoundException("상품 목록 초과");
        }
    }

    public void removeProduct(String name) throws ProductArrayBoundException {
        if (lastIdx >= 0) {
            for (int i = 0; i < products.length; i++) {
                if (products[i].getName().equals(name)) {
                    products[i] = null;
                }
            }
            lastIdx--;
        } else {
            throw new ProductArrayBoundException("상품 목록 초과");
        }
    }

    private void printProducts(Product product) {
        System.out.print("이름 : " + product.getName() +
                ", 가격 : " + product.getPrice() + ", 재고 : " + product.getStock());
        switch (product.getType()) {
            case CLOTHING:
                System.out.print(", 종류 : 의류");
                break;
            case ELECTRONICS:
                System.out.print(", 종류 : 가전제품");
                break;
            case FOOD:
                System.out.print(", 종류 : 음식");
                break;
        }
        System.out.println();
    }

    protected int searchProduct(String name) throws ProductArrayBoundException {
        for (int i = 0; i < lastIdx; i++) {
            if (products[i].getName().equals(name)) {
                return i;
            }
        }

        throw new ProductArrayBoundException("존재하지 않는 상품입니다.");
    }

    public void displayProducts() {

        System.out.println("상품 전체 검색");
        for (int i = 0; i <= lastIdx; i++) {
            printProducts(products[i]);
        }
    }

    public void displayProducts(String name) {

        System.out.println("상품명 검색");
        try {
            int i = searchProduct(name);
            System.out.println(products[i]);
        } catch (ProductArrayBoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayProducts(Type type) {

        System.out.println("분류별 검색");
        for (int i = 0; i <= lastIdx; i++) {
            if (products[i].getType().equals(type)) {
                printProducts(products[i]);
            }
        }
    }

    public abstract void order(String name);

    public abstract Boolean checkOrderAvailability(Product p);
}
