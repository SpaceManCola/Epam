package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Products implements ProductDao{
    private Map<Product, Integer> prodList;
    public Products(){
        prodList = new HashMap<>();
    }
    public void addProduct(Product newProduct, int count) {
        prodList.put(newProduct, count);
    }

    public List<Product> getAllProduct() {
        return new ArrayList<>(prodList.keySet());
    }

    public void buyProduct(Product bProd, int count) {
        for (Product key : prodList.keySet()){
            Integer freq = prodList.get(key);
            prodList.put(key, (freq == null) ? 1 : freq - count);
        }
    }

    public Map<Product, Integer> findProduct(Product fProd) {
        Map<Product, Integer> tmp = new HashMap<>(prodList) ;
        for (Iterator<Product> it = tmp.keySet().iterator(); it.hasNext(); )
            if ((it.next().getNameProduct().equals(fProd.getNameProduct())))
                it.remove();
        return tmp;
    }

    public void printList(List<Product> pL) {
        for (Product o : pL)
            System.out.println("Продукт: [" + o.getNameProduct()+"]");
    }

    public void printMap(Map<Product, Integer> pM) {
        for (Product key : pM.keySet())
            System.out.println("Продукт: ['" + key.getNameProduct() + "'] Количесво: " + pM.get(key));
    }
}
