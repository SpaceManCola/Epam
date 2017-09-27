package dao;

import java.util.List;
import java.util.Map;

import dao.Products;

public class Run {

    public static void main(String[] args) {
        Product A = new Product("Принтер", 8600);
        Product B = new Product("Монитор", 6550);
        Product C = new Product("Ноутбук", 25500);
        Products sp = new Products();
        sp.addProduct(A, 12);
        sp.addProduct(B, 8);
        sp.addProduct(C, 5);

        List<Product> allPr  =  sp.getAllProduct();
        sp.printList(allPr);

        sp.buyProduct(C, 2);
        Map<Product,Integer> octPr = sp.findProduct(C);
        sp.printMap(octPr);

    }

}
