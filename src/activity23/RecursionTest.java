// RecursionTest.java
public class RecursionTest {

    public static void main(String[] args) {
        // Create an instance of the Recursion class
        Recursion recursion = new Recursion();

        // Test the countDown method
        System.out.println("Counting down from 5:");
        recursion.countDown(5);

        // Test the alphaBackwards method
        System.out.println("\nAlphabets backwards from 'E':");
        recursion.alphaBackwards('E');
    }
}
