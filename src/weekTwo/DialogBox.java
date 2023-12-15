package weekTwo;
import javax.swing.*;

public class DialogBox {
    public static void main(String[] args) {

        String name =JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
       // JOptionPane.show
    }

}
