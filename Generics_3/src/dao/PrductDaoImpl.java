package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class ProductDaoImpl implements ProductDao {
    private static Map<Product, Integer> prodList;

    public ProductDaoImpl() {
        prodList = new HashMap<>();

        addProduct(1, "Азбука", 600, 10);
        addProduct(2, "Принтер", 8600, 5);
        addProduct(3, "Монитор", 6550, 12);
        addProduct(4, "Ноутбук", 25500, 6);
        addProduct(5, "Яблоко", 600, 3);
    }

    public void addProduct(int id, String name, double price, int count) {
        prodList.put(new Product(id, name, price), count);
    }

    public void getAllProduct() {
        System.out.println("\n");
        printList(new ArrayList<>(prodList.keySet()));
    }

    public void buyProduct(String name, int count) {
        Map<Product, Integer> tmp = findByName(name);
        for (Product key : tmp.keySet()) {
            Integer freq = prodList.get(key);
            prodList.put(key, ((freq != null) && ((freq - count) >= 0)) ? freq - count : freq);
            System.out.println("\nКуплен товар по наименованию: " + name + ". Остаток: "+ prodList.get(key));
        }
    }

    public void checkByName(String name) {
        Boolean b = false;
        Map<Product, Integer> tmp = findByName(name);
        for (Product key : tmp.keySet()) {
            Integer freq = prodList.get(key);
            b = ((freq != null) && (freq > 0)) ? true : false;
        }
        System.out.println("\nТовар на складе: " + b);
    }

    public void findById(int id) {
        Map<Product, Integer> tmp = new HashMap<>();
        Iterator<Map.Entry<Product, Integer>> it = prodList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Product, Integer> entry = it.next();
            if (String.valueOf(entry.getKey().getId()).toLowerCase().contains(String.valueOf(id).toLowerCase()))
                tmp.put(entry.getKey(), entry.getValue());
        }
        System.out.print("\nНайден продукт:");
        printMap(tmp);
    }

    public Map<Product, Integer> findByName(String name) {
        Map<Product, Integer> tmp = new HashMap<>();
        Iterator<Map.Entry<Product, Integer>> it = prodList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Product, Integer> entry = it.next();
            if (entry.getKey().getName().toLowerCase().contains(name.toLowerCase()))
                tmp.put(entry.getKey(), entry.getValue());
        }
        return tmp;
    }

    public void sortListByName() {
        List<Product> a = new ArrayList<>(prodList.keySet());
        Collections.sort(a, new Comparator<Product>() {
            public int compare(Product o1, Product o2) {
                return o1.getName().toString().compareTo(o2.getName().toString());
            }
        });
        System.out.println("\nСортировка по имени:");
        printList(a);
    }

    public void sortByPrice() {
        List<Product> a = new ArrayList<>(prodList.keySet());
        Collections.sort(a, new Comparator<Product>() {
            public int compare(Product o1, Product o2) {
                return new Double(o1.getPrice()).compareTo(new Double(o2.getPrice()));
            }
        });
        System.out.println("\nСортировка по цене:");
        printList(a);
    }

    public static void printList(List<Product> pL) {
        for (Product o : pL) {
            Integer freq = prodList.get(o);
            System.out.println("Продукт: [" + o.getName() + "] Количество: " + freq + " Цена: " + o.getPrice());
        }
    }

    public static void printMap(Map<Product, Integer> pM) {
        for (Product key : pM.keySet())
            System.out.println("Продукт: ['" + key.getName() + "'] Количесво: " + pM.get(key));
    }

}
