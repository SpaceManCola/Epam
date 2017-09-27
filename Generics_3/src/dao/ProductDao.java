package dao;

import java.util.Map;

public interface ProductDao {
    public void getAllProduct();

    public void buyProduct(String name, int count);

    public void addProduct(int id, String name, double price, int count);

    public void checkByName(String name);

    public void findById(int id);

    public Map<Product, Integer> findByName(String name);

    public void sortListByName();

    public void sortByPrice();

}
