import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.io.IOException;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
public class Game
{
    private static JButton instructions = new JButton("Instructions");
    public static void main(String[] args) throws IOException
    {
        JFrame frame = new JFrame();
        //JButton instructions = new JButton("Instructions");
        
        frame.add(instructions);
        instructions.addActionListener(new Action());
        Dimension btnSize = instructions.getPreferredSize();
        instructions.setBounds(0, 0, btnSize.width, btnSize.height);
        GamePanel panel = new GamePanel();
        panel.setLayout(null);
        panel.addKeyListener(new KeyInput(panel));
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        instructions.setFocusable(false);
        panel.setFocusable(true);
        frame.setSize(750, 750);
        frame.setVisible(true);
    }
    
    static class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == instructions)
            {
               JFrame helpFrame = new JFrame(); 
               JPanel helpPanel = new JPanel(); //Default flow layout
               helpFrame.add(helpPanel);
               
               helpFrame.setSize(750, 750);
               
               JLabel lbl = new JLabel("<html>To play this game: <br/> The game uses a single deck of cards. <br/>"
                    + "The deck is split into two even piles of 26 cards. <br/>"
                    + "Each player gets one half. The cards are dealt into 5 piles per each player. <br/>"
                    + "The first pile(left to right) has 1 card. <br/>"
                    + "The second pile as 2 cards, third pile has 3, etc. <br/>"
                    + "Player 1's cards are at the top, and Player 2's cards are at the bottom. <br/>"
                    + "There are two 'spit' piles in the center of the table: <br/>"
                    + "Left and right.<br/>"
                    + "The objective is to get rid of all your cards.<br/>"
                    + "The Players can select a pile 1-5, and <br/>"
                    + " place it in the left or right spit piles. <br/>"
                    + "Cards can only be played if they are<br/>"
                    + " one higher or lower than the top card of the spit pile.<br/>"
                    + "If no cards from the 5 piles can be played,<br/>"
                    + "One card from each of the player's draw piles(The no-face piles)<br/>"
                    + " will be placed on to the spit piles until a card can be played.<br/>"
                    + "The first player to get rid of all their cards in the 5 piles<br/>"
                    + " gets to get the pile with the least cards.<br/>"
                    + "The round ends when both players use up all of their cards in the 5 piles.<br/>"
                    + "Each player recieves their respective piles.<br/>"
                    + "They are then redealt into the 5 piles.<br/>"
                    + "The game continues until one player<br/>"
                    + " gets rid of all their cards.<br/><br/><br/>"
                    + "Controls:<br/>"
                    +"  Player1:<br/>"
                    +"      Select Piles 1-5 with Keys 1, 2, 3, 4, 5<br/>"
                    +"      Select Spit Piles with Keys A for Left, D for Right<br/><br/>"
                    +"  Player2:<br/>"
                    +"      Select Piles 1-5 with Keys 1, 2, 3, 4, 5 on NUMPAD<br/>"
                    +"      Select Spit Piles with Keys 0 on NUMPAD for Left, Enter on NUMPAD for Right<html>");
               lbl.setFont(new Font("Courier New",Font.BOLD,15));
               Dimension lblSize = lbl.getPreferredSize();
               lbl.setBounds(0, 0, lblSize.width, lblSize.height);
               
               helpPanel.add(lbl); //Add label to panel
               helpPanel.setBackground(Color.CYAN);
               helpPanel.setVisible(true); //Display
               helpFrame.setVisible(true);    
            }
        }
    }
}