package WeekFour;

import javax.swing.*;

public class loopsActivites {
    public static void main(String[] args) {
        int num = 50; //number they have to guess
        int totalguess =0;

       //String guess = JOptionPane.showInputDialog("Guess a number between 1 and 100, or enter q if you give up:");
       while (true){
           String guess = JOptionPane.showInputDialog("Guess a number between 1 and 100, or enter q if you give up:");
           totalguess +=1;
           if (guess.equals('q')){
               JOptionPane.showMessageDialog(null,String.format("Quitter! the number was %d%n",num));//add num
               break;
           }
           else {
               int numGuess= Integer.parseInt(guess); //string was to understand if q, then this is converting to int
               if (numGuess > num){
                   JOptionPane.showMessageDialog(null, "Guess too high");
               }
               else if (numGuess<num) {
                   JOptionPane.showMessageDialog(null, "Guess too low");
               }
           else {
               JOptionPane.showMessageDialog(null, String.format("Correct! %nnumber of guesses: %d%n",totalguess));

               break;
               }
           }

       }

    }
}
