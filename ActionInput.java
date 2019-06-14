import java.awt.event.*;
import java.awt.*;

public class ActionInput implements ActionListener
{

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == instructions)
        {
            JFrame helpFrame = new JFrame(); //Create frame and panel
            JPanel help = new JPanel(new FlowLayout());
            helpFrame.add(help); //Add panel to window
            helpFrame.setSize(720, 720);

            JLabel lbl = new JLabel("<html>To play this game: <br/> Each Player starts with an evenly spit deck of cards." + 
                    "<br/>The cards are dealt into 5 stock piles, the first with 1 card, the second with 2, and so on. " +
                    "<br/>The moves you can make are one rank higher or lower (suit doesn't matter) on either spit pile. " + 
                    "<br/>For Player 1 to make a move, they can use numbers 1-5 on the keyboard to select a stock pile to play from " +
                    "<br/>and A or D to play on the left or right spit pile, respectively. " +
                    "<br/>For Player 2, they use numbers 1-5 on the number pad, and the 0 and Delete buttons to play on each spit pile." +
                    "<br/>There are no turns; if you see a move, make it as quick as possible! <br/>The other " +
                    "player can make a move on either pile as well. <br/>When neither player has a valid move, they must each flip a " +
                    "<br/>card onto a spit pile at the same time, <br/>and keep doing so until someone has a valid move." +
                    "<br/>When one player's stock piles are completely finished, both " +
                    "<br/>players have to slap the table. <br/>Player 1 does this by pressing the left shift button, <br/>and Player 2 " + 
                    "does this by pressing the Enter key. " + "<br/>Whoever slaps first gets the spit pile with less cards." + 
                    "<br/>They then must add this number of cards <br/> to their original draw pile, reshuffle, and deal again. " +
                    "This is considered a round. <br/>The game keeps going until one player <br/>has gotten rid of all of their cards.</html>");
            lbl.setFont(new Font("Courier New",Font.BOLD,15));
            Dimension lblSize = lbl.getPreferredSize();
            lbl.setBounds(0, 0, lblSize.width, lblSize.height);

            help.add(lbl); //Add label to panel
            help.setBackground(Color.CYAN);
            help.setVisible(true); //Display
            helpFrame.setVisible(true);
        }
        else //Source == start
        {

            gameFrame.setSize(750, 750);
            //gameFrame.setLayout(null);
            gameFrame.getContentPane().setBackground(Color.GREEN);

            //gamePanel.setBackground(Color.GREEN);

            gameFrame.getContentPane().remove(start);
            gameFrame.getContentPane().remove(spit);
            instructions.setBounds(0, 0, instructSize.width, instructSize.height);
            //gamePanel.remove(instructions);

            try
            {
                repaintCards();
            }
            catch(Exception ex)
            {
                //Nothing
            }
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
        }
    }
}