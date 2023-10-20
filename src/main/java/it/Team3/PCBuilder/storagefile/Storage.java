package it.Team3.PCBuilder.storagefile;

import it.Team3.PCBuilder.utilities.Component;
import it.Team3.PCBuilder.utilities.IsCompatibleWith;
import lombok.Data;

import java.util.Objects;
@Data
public class Storage extends Component implements IsCompatibleWith {
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
    public boolean isCompatibleWith(Component component) {
        return false;
    }
}