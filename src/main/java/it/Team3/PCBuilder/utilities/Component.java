package it.Team3.PCBuilder.utilities;

import java.util.ArrayList;

public class Component {
    private int id;
    private double price;

    public Component(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
