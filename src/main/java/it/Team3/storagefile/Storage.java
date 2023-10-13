package it.Team3.storagefile;

import it.Team3.utilities.Component;

import java.util.Objects;

public class Storage extends Component {
        private String manufacture;
        private String model;
        private String serial;
        private short capacity;
        private String type;
        private String formFactor;
        private String interfaceConnector;
        private boolean isNvme;
    
    public Storage(String name, double price, String manufacture, String model,
                   String serial, short capacity, String type, String formFactor,
                   String interfaceConnector, boolean isNvme) {
        super(name, price);
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