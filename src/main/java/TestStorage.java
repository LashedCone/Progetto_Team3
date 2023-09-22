import java.util.ArrayList;

public class TestStorage {
    public static void main(String[] args) {
        StorageList storageList = new StorageList();
        ArrayList<Storage> storageListArray = storageList.getStorageList();
        for (Storage storage : storageListArray) {
            if (storage.manufacture().equals("Western Digital")) {
                System.out.println(storage.toString());
            }
        }
    }
}

