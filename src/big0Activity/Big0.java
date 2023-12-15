// Create a package named bigOActivity
package bigOActivity;

// BigO class
public class BigO {

    // Method that runs in O(1) time
    public void printOnce(Object parameter) {
        System.out.println(parameter);
    }

    // Method that runs in O(n) time
    public void printNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Printing " + (i + 1) + " times");
        }
    }

    // Method that runs in O(n^2) time
    public void printNSquaredTimes(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Printing " + (i + 1) + " times squared " + (j + 1) + " times");
            }
        }
    }
}
