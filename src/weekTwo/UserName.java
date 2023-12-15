package weekTwo;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        //An instance of the scanner class
        //An object
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your First Name And Last Name: \n");
        String firstLastName = console.nextLine();
        String Cap = firstLastName.toUpperCase();
        String lower = firstLastName.toLowerCase();
        System.out.printf("Your First And last Name in all uppercase is: %s\n",firstLastName.toUpperCase());
        System.out.printf("Your First And last Name in all lowercase is: %s\n",firstLastName.toLowerCase());

        //Option 1: Stringbuilder instance
        StringBuilder revName = new StringBuilder(firstLastName);
        String finalName = String.valueOf(revName.reverse());
        System.out.printf("Your Name in reverse is %s%n",finalName);

    }
}
