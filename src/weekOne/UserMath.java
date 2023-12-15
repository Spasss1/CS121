package weekOne;
import java.util.Scanner;
public class UserMath {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    //prompt user
        System.out.println("Enter your first integer: \n");
        int numOne = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter your second integer: \n");
        int numTwo = Integer.parseInt(keyboard.nextLine());

        //add
        System.out.printf("%d plus (+) %d %n",numOne,numTwo,(numOne + numTwo));
        //subtract
        System.out.printf("%d subtract (-) %d %n",numOne,numTwo,(numOne - numTwo));
        //divide
        System.out.printf("Integer Division: %d divide (/) %d%n",numOne,numTwo,(numOne / numTwo));
        System.out.printf("Real Division: %d divide (/) %d = %.2f%n",numOne,numTwo,((double)numOne / numTwo));
        //multiply
        System.out.printf("%d multiply (*) %d %n",numOne,numTwo,(numOne * numTwo));
        //square root
        double sqrt1 = Math.sqrt(numOne);
        double sqrt2 = Math.sqrt(numTwo);
        System.out.printf(" The square root of %d is %.2f%n",numOne,sqrt1);
        System.out.printf(" The square root of %d is %.2f%n",numOne,sqrt2);
        //power
        double powerOF= Math.pow(numOne, numTwo);
        System.out.printf(" The power of %d and %d is %.2f%n",numOne,numTwo,powerOF);
        //log
        double log1 = Math.log(numOne);
        double log2 = Math.log(numTwo);
        System.out.printf(" The logarithm of %d is %.2f%n",numOne,log1);
        System.out.printf(" The logarithm of %d is %.2f%n",numTwo,log2);



    }
}
