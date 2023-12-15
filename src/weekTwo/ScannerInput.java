package weekTwo;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
    int numOne = 5;
    int numTwo = Integer.parseInt(console.nextLine());
    int add = (numOne + numTwo);
    int sub = (numOne - numOne);
    //multiplication
    //division
    //square root
    double sqrt1 = (double)Math.sqrt(numOne);

    System.out.printf("The number %d + %d = ", numOne,numTwo,add);
    System.out.printf("The number %d - %d =", numOne,numTwo,sub);
    //print multiplication
    //print division

    //prints square root of num one
    System.out.printf("The square root of %d is = %.2f", sqrt1);
    //print square root of the 2nd number,
    double power1 = Math.pow(numOne, numTwo);
    System.out.printf("The power of %d and %d is :", numOne, numTwo, power1);
    //2nd number print
    double log1 = Math.log(numOne);
    System.out.printf("The log of %d is : %.2f", numOne, log1);
    //Math.max()
    System.out.println(Math.max(3,5));
  //Math.min()
    System.out.println(Math.min(3,7));
    System.out.println(Math.abs(-29));
    }
}
