package dao;

import static dao.ProductDaoImpl.printMap;

public class Run {

    public static void main(String[] args) {
        ProductDaoImpl CatProd = new ProductDaoImpl();

        CatProd.sortListByName();
        CatProd.sortByPrice();

        CatProd.getAllProduct();

        printMap(CatProd.findByName("Ноутбук"));

        printMap(CatProd.findByName("Монитор"));

        CatProd.findById(1);

        CatProd.buyProduct("о", 3);

        CatProd.getAllProduct();

        CatProd.checkByName("ябл");

    }

}
