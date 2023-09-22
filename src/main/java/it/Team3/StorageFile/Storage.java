package it.Team3.StorageFile;

import java.util.Objects;

public record Storage(String manufacture, String model, String serial,
                      short capacity, String type, String formFactor,
                      String interfaceConnector, boolean isNvme) {
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
}