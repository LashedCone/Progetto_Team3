package it.Team3.PCBuilder.storagefile;

import it.Team3.PCBuilder.utilities.Component;
import it.Team3.PCBuilder.utilities.isCompatibleWith;

import java.util.Objects;

public class Storage extends Component implements isCompatibleWith {
    private String manufacture;
    private String model;
    private String serial;
    private short capacity;
    private String type;
    private String formFactor;
    private String interfaceConnector;
    private boolean isNvme;

    public Storage(int id, double price, String manufacture, String model,
                   String serial, short capacity, String type, String formFactor,
                   String interfaceConnector, boolean isNvme) {
        super(id, price);
        this.manufacture = manufacture;
        this.model = model;
        this.serial = serial;
        this.capacity = capacity;
        this.type = type;
        this.formFactor = formFactor;
        this.interfaceConnector = interfaceConnector;
        this.isNvme = isNvme;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public String getSerial() {
        return serial;
    }

    public short getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getInterfaceConnector() {
        return interfaceConnector;
    }

    public boolean isNvme() {
        return isNvme;
    }

    @Override
    public String toString() {
        return "ObjStorage{" +
                "manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", interfaceConnector='" + interfaceConnector + '\'' +
                ", isNvme=" + isNvme +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Storage that)) return false;
        return capacity == that.capacity && isNvme() == that.isNvme() && Objects.equals(manufacture, that.manufacture) && Objects.equals(model, that.model) && Objects.equals(serial, that.serial) && Objects.equals(type, that.type) && Objects.equals(formFactor, that.formFactor) && Objects.equals(interfaceConnector, that.interfaceConnector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacture, model, serial, capacity, type, formFactor, interfaceConnector, isNvme());
    }

    @Override
    public boolean isCompatibleWith(Component other) {
        return false;
    }
}