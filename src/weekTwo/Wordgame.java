package weekTwo;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Wordgame {
    public static void main(String[] args) {
        //Prompting with dialog box
       String name = JOptionPane.showInputDialog(null,"Enter your name!");
       int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
       String city = JOptionPane.showInputDialog("Enter the City you are from");
       String college = JOptionPane.showInputDialog("The College you go to");
       String major = JOptionPane.showInputDialog("The Major you are in");
       String pet = JOptionPane.showInputDialog("Pet name");
       System.out.printf("You entered the name: %s",name);
        JOptionPane.showMessageDialog(null,String.format("There once was a person named %s .%nThey are %d years old.%n They are from %s.%n They go to %s.%n They are majoring in %s %n Their pet's name is %s",name,age,city,college,major,pet));

    //Scanner
    //    Scanner console = new Scanner(System.in);
    //    System.out.print("Enter Your name");
    //      String name2 = console.nextLine();
    //    System.out.printf("Their once was a person named %s",name2);

    }
}
