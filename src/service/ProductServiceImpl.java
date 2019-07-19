package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"IPHONE 6 Plus", 12000000, "white"));
        products.put(2, new Product(2,"SamSung A5", 7000000, "Blue"));
        products.put(3, new Product(3,"IPHONE XS", 30000000, "Pink"));
        products.put(4, new Product(4,"OPPO F1", 10000000, "white"));
        products.put(5, new Product(5,"Xiaomi", 5000000, "Green"));
        products.put(6, new Product(6,"Black berri", 12000000, "white"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
