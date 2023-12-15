package weekTwelve.binaryLinear;
import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(17);
        arrayList.add(12);
        arrayList.add(90);
        arrayList.add(84);
        arrayList.add(38);
        arrayList.add(5);
        arrayList.add(77);
        arrayList.add(44);

        System.out.print("unsorted: ");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // sort array
        ArrayList<Integer> sortedList = selectionSort(arrayList);
        System.out.print("sorted: ");
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // search for number
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());
        int found = demo.binarySearch(key, sortedList);
        if (found == -1) {
            System.out.println("Item not found.");
        } else {
            System.out.printf("Item found at index %d, position %d", found, found + 1);
        }
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unsortedList) {
        ArrayList<Integer> sortedList = new ArrayList<>(unsortedList);
        for (int i = 0; i < sortedList.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < sortedList.size(); j++) {
                if (sortedList.get(j) < sortedList.get(min)) {
                    min = j;
                }
            }
            int temp = sortedList.get(i);
            sortedList.set(i, sortedList.get(min));
            sortedList.set(min, temp);
        }
        return sortedList;
    }
}
