import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class BlackJackGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackJackGame
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class BlackJackGame
     */
    private int scorePlayer = 0;
    private int scoreDealer = 0;
    public Deck cards;
    private int total = 0;
    public BlackJackGame()
    {
        // initialise instance variables
    }
    public void startGame()
    {
        cards = new Deck();
        cards.shuffle();
        scorePlayer = 0;
        scoreDealer = 0;
    }
    public void runGame()
    {
        while (scorePlayer < 5 && scoreDealer <5)
        {
            JOptionPane.showMessageDialog(null, "Current Score: \nPlayer: " + scorePlayer + "\nDealer: " + scoreDealer);
            total = 0;
            int playerTotal = 0;
            System.out.println("____________________________________");
            System.out.println("Your turn:");
            int player = turn(0);
            if (player == 1) 
            {
                scorePlayer++;
                JOptionPane.showMessageDialog(null, "You won!");
                continue;
            }
            else if (player == 2)
            {
                scoreDealer++;
                JOptionPane.showMessageDialog(null, "You lost!");
                continue;
            }
            playerTotal = total;
            total = 0;
            System.out.println("Dealer's turn:");
            int dealer = turn(1);
            if (dealer == 2)
            {
                scorePlayer++;
                JOptionPane.showMessageDialog(null, "You won!");
                continue;
            }
            else if (dealer == 1)
            {
                scoreDealer++;
                JOptionPane.showMessageDialog(null, "You lost!");
                continue;
            }
            int dealerTotal = total;
            if (playerTotal > dealerTotal)
            {
                scorePlayer++;
                JOptionPane.showMessageDialog(null, "You won!");
                continue;
            }
            else if (playerTotal < dealerTotal)
            {
                scoreDealer++;
                JOptionPane.showMessageDialog(null, "You lost!");
                continue;
            }
            JOptionPane.showMessageDialog(null, "You tied!");
            continue;
        }
        return;
    }
    private int turn(int id)
    {
        boolean flag = true;
        boolean face = false;
        boolean ace = false;
        int numCards = 0;
        while (flag)
        {
            numCards++;
            System.out.println("Drawing a card:");
            Card drawn = cards.draw();
            System.out.println(drawn.getDisplay());
            if (drawn.getValue() == 10 || drawn.getValue() == 11 || drawn.getValue() == 12 || drawn.getValue() == 13)
            {   
                total += 10;
                face = true;
            }
            else total += drawn.getValue();
            if (drawn.getValue() == 1) ace = true;
            System.out.println(total);
            if (ace && face && numCards == 2) return 1;
            else if (total == 21) return 1; // Win
            else if (total > 21) return 2; // Bust
            if (id == 0)
            {
                if (JOptionPane.showInputDialog("Type in STAY to stay, anything else to hit").equals("stay")) flag = false;
            }
            else if (id == 1)
            {
                if (total >= 17) return 0;
            }
        }
        return 0;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
