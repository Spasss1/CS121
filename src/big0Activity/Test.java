// Test class
package bigOActivity;

public class Test {

    // main method
    public static void main(String[] args) {
        // Create an instance of the BigO class
        BigO bigO = new BigO();

        // Call the printOnce method
        System.out.println("Printing Once:");
        bigO.printOnce("Hello");

        // Call the printNTimes method
        System.out.println("\nPrinting N Times:");
        bigO.printNTimes(3);

        // Call the printNSquaredTimes method
        System.out.println("\nPrinting N^2 Times:");
        bigO.printNSquaredTimes(2);
    }
}
