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
               
               JLabel lbl = new JLabel("<html>To play this game: <br/> Each Player starts with an evenly spit deck of cards." + 
                "<br/>The cards are dealt into 5 stock piles, the first with 1 card, <br/>the second with 2, and so on. " +
                "<br/>The moves you can make are one rank higher or lower (suit doesn't matter) <br/>on either spit pile. " + 
                "<br/>For Player 1 to make a move, they can use <br/>numbers 1-5 on the keyboard to select a stock pile to play from " +
                "<br/>and A or D to play on the left or right spit pile, respectively. " +
                "<br/>For Player 2, they use numbers 1-5 on the number pad, <br/>and the 0 and Delete buttons to play on each spit pile." +
                "<br/>There are no turns; if you see a move, make it as quick as possible! <br/>The other " +
                "player can make a move on either pile as well. <br/>When neither player has a valid move, <br/>they must each flip a " +
                "<br/>card onto a spit pile at the same time, <br/>and keep doing so until someone has a valid move." +
                "<br/>When one player's stock piles are completely finished, both " +
                "<br/>players have to slap the table. <br/>Player 1 does this by pressing the left shift button, <br/>and Player 2 " + 
                "does this by pressing the Enter key. " + "<br/>Whoever slaps first gets the spit pile with less cards." + 
                "<br/>They then must add this number of cards <br/> to their original draw pile, reshuffle, and deal again. " +
                "<br/>This is considered a round. <br/>The game keeps going until one player <br/>has gotten rid of all of their cards.</html>");
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