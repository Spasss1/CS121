
package sortingActivity;

import java.util.Scanner;

public class Sorting {


    public int[] getArray() {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 unsorted integers:");

        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }


    public int[] sortArray(int[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap array[i-1] and array[i]
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;

                    swapped = true;
                }
            }
        } while (swapped);

        return array;
    }
}
