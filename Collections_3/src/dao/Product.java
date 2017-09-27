package dao;

public class Product {
    private String nameProduct;
    private int priceProduct;

    public Product(String name, int price) {
        this.setNameProduct(name);
        this.setPrice(price);
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return priceProduct;
    }

    public void setPrice(int price) {
        this.priceProduct = price;
    }
}
