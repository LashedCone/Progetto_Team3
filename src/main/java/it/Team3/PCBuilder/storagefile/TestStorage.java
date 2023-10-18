package it.Team3.PCBuilder.storagefile;

import java.util.ArrayList;

public class TestStorage {
    public static void main(String[] args) {
        StorageList storageList = new StorageList();
        ArrayList<Storage> storageListArray = storageList.getStorageList();
        for (Storage storage : storageListArray) {
            if (storage.getManufacture().equals("Western Digital")) {
                System.out.println(storage.toString());
            }
        }
    }
}

