package it.Team3.storefile;

import it.Team3.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private String name;
    private List<Product> productList;
    
    public Store(String name, List<Product> productList) {
        this.name = name;
        this.productList = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Product> getProductList() {
        return productList;
    }
    
    public boolean productAvailable(String product) {
        return productList.stream().anyMatch(p -> p.getName().equals(product));
    }
    
    public List<Product> searchProducts(String productName) {
        return productList.stream().filter(p -> p.getName().equals(productName))
                .collect(Collectors.toList());
    }
}
