package it.Team3.PCBuilder.utilities;

import lombok.Data;

@Data
public class Component {
    private int id;
    private double price;
    
    public Component(int id, double price) {
        this.id = id;
        this.price = price;
    }
}
