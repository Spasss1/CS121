package weekTwo;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //this is scanner instance, how to use scanner
        Scanner keyboard = new Scanner(System.in);
        //how to prompt the user for an input
        System.out.println("Enter A Number");
        //how to accept the number from the user
        int number = Integer.parseInt(keyboard.nextLine());


        if (number % 2 ==0){
            System.out.println("Even");

        }
        else{
            System.out.println("Odd");
        }
    }
}
