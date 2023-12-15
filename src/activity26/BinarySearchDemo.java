import java.util.ArrayList;

public class BinarySearchDemo {
    public int binarySearch(int key, ArrayList<Integer> list) {
        int counter = 0; // keeps track of comparisons
        int low = 0;
        int high = list.size() - 1;
        int mid = (low + high) / 2;

        while (low <= high && list.get(mid) != key) {
            if (list.get(mid) < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
            System.out.println("comparison: " + ++counter);
        }

        if (low > high) {
            mid = -1;
        }

        return mid;
    }

    public static void main(String[] args) {
        BinarySearchDemo searchDemo = new BinarySearchDemo();
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Populate your ArrayList with elements
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int keyToSearch = 3;
        int result = searchDemo.binarySearch(keyToSearch, arrayList);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
