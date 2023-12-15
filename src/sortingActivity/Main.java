
package sortingActivity;

public class Main {


    public static void main(String[] args) {

        Sorting sorting = new Sorting();


        int[] unsortedArray = sorting.getArray();


        System.out.println("Unsorted Array:");
        printArray(unsortedArray);


        int[] sortedArray = sorting.sortArray(unsortedArray);


        System.out.println("\nSorted Array:");
        printArray(sortedArray);
    }


    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
