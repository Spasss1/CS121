package weekTwo;

import javax.swing.*;

public class Triangles {
    public static void main(String[] args) {
        // Declare Variables
        int Side1,Side2,Side3;
        String triangle;
        Side1 = Integer.parseInt(JOptionPane.showInputDialog("Length Of Side 1"));
        Side2 = Integer.parseInt(JOptionPane.showInputDialog("Length Of Side 2"));
        Side3 = Integer.parseInt(JOptionPane.showInputDialog("Length Of Side 3"));
        if (Side1 !=Side2 && Side1 !=Side3 && Side2 !=Side3){
        triangle = "Scalene";

        } else if (Side1 ==Side2 && Side2==Side3 ) {
            triangle = "Equiliateral";



        }
        else if(Side1 == Side2 || Side1==Side3 || Side2==Side3 )
        {
                      triangle = "Isosceles";
        }
        else {
            triangle = "not a triangle";

        }
        JOptionPane.showMessageDialog(null, String.format("The triangle is %s",triangle));

    }
}
