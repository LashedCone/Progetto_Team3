package it.Team3.product;

import it.Team3.exception.MyException;
import it.Team3.utilities.Components;

public class Product {
    private Components components;
    private String name;
    private String manufacturer;
    private double price;
    
    public Product(Components components, String name, String manufacturer, double price) {
        this.components = components;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }
    
    public Components getComponents() {
        return components;
    }
    
    public String getName() {
        return name;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setComponents(Components components) {
        this.components = components;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public void setPrice(double price) throws MyException {
        if(price < 0) {
            throw new MyException("Il prezzo non può essere minore di 0");
        }
        this.price = price;
    }
}
