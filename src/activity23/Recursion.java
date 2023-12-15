// Recursion.java
public class Recursion {

    // Method to count down from a given number to 0
    public void countDown(int number) {
        if (number == 0) {
            System.out.println("Blast Off!");
        } else {
            System.out.println(number);
            countDown(number - 1);  // Recursive call with a parameter of (number - 1)
        }
    }

    // Method to print alphabets backwards from a given letter to 'a'
    public void alphaBackwards(char letter) {
        if (letter == 'a') {
            System.out.println(letter);
        } else {
            System.out.println(letter);
            alphaBackwards((char) (letter - 1));  // Recursive call with a parameter of (letter - 1)
        }
    }
}
