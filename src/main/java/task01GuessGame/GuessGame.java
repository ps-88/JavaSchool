package task01GuessGame;

import javax.swing.*;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GuessGame {

    BestScore bestScore = new BestScore();

    public void play(int max) {

        int counter = 1;
        boolean flag = true;

        Random random = new Random();
        int randomNum = random.nextInt(max);
        System.out.println(randomNum);
        while (flag) {
            String answer = JOptionPane.showInputDialog("Please guess the number up to " + max);


            if (!isNumber(answer)) {
                JOptionPane.showMessageDialog(null, "Please enter only numbers");
            } else {

                int input = Integer.parseInt(answer);
                while (input != randomNum) {
                    if (input > randomNum) {

                        answer = JOptionPane.showInputDialog("Less");
                        counter++;

                    } else {

                        answer = JOptionPane.showInputDialog("More");
                        counter++;
                    }
                   input = Integer.parseInt(answer);

                }
                flag = false;
            }

            int result = max / counter;

            if (result > bestScore.getScore()) {
                bestScore.setScore(result);
            }

        }

    }

    public void printBestScore() {

        JOptionPane.showMessageDialog(null, "The best game result is: " + bestScore);

    }

    public boolean isNumber(String input) {

        Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
        Matcher m = p.matcher(input);
        return !m.find();
    }

}
