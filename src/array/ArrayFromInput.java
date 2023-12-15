import java.util.Scanner;

public class ArrayFromInput {
    private String[] stringArray = new String[3];
    private int[] intArray = new int[3];
    private double[] floatArray = new double[3];

    public void populateArrays() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for the string array (at least 3 elements):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            stringArray[i] = scanner.next();
        }

        System.out.println("\nEnter values for the integer array (at least 3 elements):");
        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    System.out.print("Element " + (i + 1) + ": ");
                    intArray[i] = scanner.nextInt();
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Please enter a valid integer.");
                    scanner.next();  // Clear the input buffer
                }
            }
        }

        System.out.println("\nEnter values for the float array (at least 3 elements):");
        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    System.out.print("Element " + (i + 1) + ": ");
                    floatArray[i] = scanner.nextDouble();
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Please enter a valid float.");
                    scanner.next();  // Clear the input buffer
                }
            }
        }
    }

    public void printArrays() {
        System.out.println("\nArrays Contents:");
        System.out.format("%-15s %-15s %-15s%n", "String Array", "Integer Array", "Float Array");

        for (int i = 0; i < Math.max(stringArray.length, intArray.length, floatArray.length); i++) {
            String strElem = (i < stringArray.length) ? stringArray[i] : "";
            String intElem = (i < intArray.length) ? Integer.toString(intArray[i]) : "";
            String floatElem = (i < floatArray.length) ? Double.toString(floatArray[i]) : "";

            System.out.format("%-15s %-15s %-15s%n", strElem, intElem, floatElem);
        }
    }

    public static void main(String[] args) {
        ArrayFromInput arrayInput = new ArrayFromInput();
        arrayInput.populateArrays();
        arrayInput.printArrays();
    }
}
