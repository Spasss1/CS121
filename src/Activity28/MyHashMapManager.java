import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMapManager {
    private Map<String, String> myHashMap;

    public MyHashMapManager() {
        this.myHashMap = new HashMap<>();
    }

    // Method to add a key/value pair to the HashMap
    public void addKeyValuePair(String key, String value) {
        myHashMap.put(key, value);
    }

    // Method to remove a key/value pair from the HashMap
    public void removeKeyValuePair(String key) {
        myHashMap.remove(key);
    }

    // Method to get the value from the map based on the key
    public String getValueByKey(String key) {
        return myHashMap.get(key);
    }

    // Method to display both the key and the value
    public void displayKeyValuePairs() {
        Set<Map.Entry<String, String>> entrySet = myHashMap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyHashMapManager hashMapManager = new MyHashMapManager();

        // Adding key/value pairs
        hashMapManager.addKeyValuePair("A", "Apple");
        hashMapManager.addKeyValuePair("B", "Banana");
        hashMapManager.addKeyValuePair("C", "Cherry");

        // Displaying all key/value pairs
        System.out.println("Key/Value pairs:");
        hashMapManager.displayKeyValuePairs();

        // Removing one key/value pair
        hashMapManager.removeKeyValuePair("B");

        // Displaying key/value pairs again
        System.out.println("\nKey/Value pairs after removal:");
        hashMapManager.displayKeyValuePairs();
    }
}
