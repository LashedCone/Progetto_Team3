package it.Team3.PCBuilder.models;

import it.Team3.PCBuilder.IsCompatibleWith;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Storage")
public class Storage extends Component implements IsCompatibleWith {
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

    @Override
    public boolean isCompatibleWith(Component component) {
        return false;
    }
}