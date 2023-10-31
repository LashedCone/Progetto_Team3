package it.Team3.PCBuilder.models;

import it.Team3.PCBuilder.IsCompatibleWith;
import jakarta.persistence.*;


@Entity
@Table(name = "storage")
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String manufacture;
    private String model;
    private String serial;
    private short capacity;
    private String type;
    private String formFactor;
    private String interfaceConnector;
    private boolean isNvme;

    public Storage() {
    }

    public Storage(int id, String manufacture, String model,
                   String serial, short capacity, String type, String formFactor,
                   String interfaceConnector, boolean isNvme) {
        this.id = id;
        this.manufacture = manufacture;
        this.model = model;
        this.serial = serial;
        this.capacity = capacity;
        this.type = type;
        this.formFactor = formFactor;
        this.interfaceConnector = interfaceConnector;
        this.isNvme = isNvme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public short getCapacity() {
        return capacity;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getInterfaceConnector() {
        return interfaceConnector;
    }

    public void setInterfaceConnector(String interfaceConnector) {
        this.interfaceConnector = interfaceConnector;
    }

    public boolean isNvme() {
        return isNvme;
    }

    public void setNvme(boolean nvme) {
        isNvme = nvme;
    }

    @Override
    public String toString() {
        return "Storage details:" +
                "\nManufacture: " + manufacture + '\'' +
                "\nModel: " + model +
                "\nSerial: " + serial +
                "\nCapacity: " + capacity +
                "\nType: " + type + '\'' +
                "\nForm factor: " + formFactor + '\'' +
                "\nInterface connector: " + interfaceConnector + '\'' +
                "\nIs nvme=" + isNvme;
    }

//    @Override
//    public boolean isCompatibleWith(Component component) {
//        return false;
//    }
}