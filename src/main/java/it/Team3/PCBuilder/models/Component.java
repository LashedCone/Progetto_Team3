package it.Team3.PCBuilder.models;

public class Component {
    private int id;
    private double price;

    public Component(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public Component() {
    }

    public Component(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
