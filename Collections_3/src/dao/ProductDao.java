package dao;

import java.util.List;
import java.util.Map;

public interface ProductDao {
    public List<Product> getAllProduct();

    public void buyProduct(Product bProd, int count);

    public Map<Product, Integer> findProduct(Product fProd);

}
