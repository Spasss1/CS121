package WeekThree;

import javax.swing.*;

public class RestaurantSelector {
    public static void main(String[] args) {
        String vegetarian = JOptionPane.showInputDialog("Is anyone in your party a vegetarian?");
        String vegan = JOptionPane.showInputDialog("is anyone in your party a vegan?");
        String gluten = JOptionPane.showInputDialog(("is anyone in your party gluten free?"));
        String message ="Here are your restaurant choices:\n";
       if(vegan.equals("no")){
           message =  message + "\nMain Street Pizza Company";
       }
       if(vegan.equals("no") && gluten.equals("no")) {
          message =  message + "\nMama's Fine Italian";
       }
       if(vegan.equals("no") && gluten.equals("no") && vegetarian.equals("no")) {
            message =  message + "\nJoe's Gourment Burgers";
       }
        message = message + "\n The Chef's Kitchen or \n Corner Café";
        JOptionPane.showMessageDialog(null, message);
       }

}
