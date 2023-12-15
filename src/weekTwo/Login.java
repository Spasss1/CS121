package weekTwo;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String userName ="User";
        String password ="1234";
        String name,pass;
        name = JOptionPane.showInputDialog("Enter your user");
        pass = JOptionPane.showInputDialog("Enter your password");

        if (userName.equals(name)&& password.equals(pass)){
            JOptionPane.showMessageDialog(null,"Welcome to Cs121");

        } else if (!userName.equals(name)&& password.equals(pass)) {
            JOptionPane.showMessageDialog(null, "Your Username was incorrect");

        }
        else if (userName.equals(name)&& !password.equals(pass)) {
            JOptionPane.showMessageDialog(null, "Your Password was incorrect");



        }
        else {
            JOptionPane.showMessageDialog(null ,"your username and password are both incorrect");


        }
    }
}
