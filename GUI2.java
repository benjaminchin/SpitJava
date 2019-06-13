import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;

import java.awt.Dimension;
public class GUI2 extends Deck
{
    private static JFrame gameFrame = new JFrame();
    private static JPanel gamePanel = new JPanel(new FlowLayout());
    private static JLabel spit = new JLabel("Spit");
    private static JButton start = new JButton("Start");
    private static JButton instructions = new JButton("Instructions");

    private static BufferedImage img;
    private static JLabel player1 = new JLabel();
    private static JLabel oneStockOne = new JLabel();
    private static JLabel oneStockTwo = new JLabel();
    private static JLabel oneStockThree = new JLabel();
    private static JLabel oneStockFour = new JLabel();
    private static JLabel oneStockFive = new JLabel();

    private static JLabel player2 = new JLabel();
    private static JLabel twoStockOne = new JLabel();
    private static JLabel twoStockTwo = new JLabel();
    private static JLabel twoStockThree = new JLabel();
    private static JLabel twoStockFour = new JLabel();
    private static JLabel twoStockFive = new JLabel();

    private static JLabel leftSpit = new JLabel();
    private static JLabel rightSpit = new JLabel();

    private static Deck deck = new Deck();
    
    private static Dimension spitSize;
    private static Dimension startSize;
    private static Dimension instructSize;
    public static void main(String[] args)
    {

        deck.shuffle();
        deck.deal();

        gameFrame.setDefaultLookAndFeelDecorated(true);
        gameFrame.setLayout(null);
        gameFrame.add(gamePanel);
        gameFrame.setSize(750, 750);
        gameFrame.getContentPane().setBackground(Color.ORANGE);
        

        spit.setFont(new Font("Courier New",Font.BOLD,30));
        
        spitSize = spit.getPreferredSize();
        startSize = start.getPreferredSize();
        instructSize = instructions.getPreferredSize();
        
        spit.setBounds(75, 0, spitSize.width, spitSize.height);
        start.setBounds(50, 50, startSize.width, startSize.height);
        instructions.setBounds(100, 50, instructSize.width, instructSize.height);
        
        gameFrame.getContentPane().add(spit);
        gameFrame.getContentPane().add(start);
        gameFrame.getContentPane().add(instructions);
        
        start.addActionListener(new Action());
        instructions.addActionListener(new Action());
        //start.setBounds(20, 50, 100, 100);
        //gamePanel.add(start);
        //gamePanel.add(instructions);

        player1.setBounds(320,10, 72, 96);
        oneStockOne.setBounds(80,130, 72, 96);
        oneStockTwo.setBounds(200,130, 72, 96);
        oneStockThree.setBounds(320,130, 72, 96);
        oneStockFour.setBounds(440,130, 72, 96);
        oneStockFive.setBounds(560,130, 72, 96);

        player2.setBounds(320, 590, 72, 96);
        twoStockOne.setBounds(80, 450, 72, 96);
        twoStockTwo.setBounds(200, 450, 72, 96);
        twoStockThree.setBounds(320, 450, 72, 96);
        twoStockFour.setBounds(440, 450, 72, 96);
        twoStockFive.setBounds(560, 450, 72, 96);

        leftSpit.setBounds(200, 270, 72, 96);
        rightSpit.setBounds(440, 270, 72, 96);
        
        gamePanel.add(player1);
        gamePanel.add(oneStockOne);
        gamePanel.add(oneStockTwo);
        gamePanel.add(oneStockThree);
        gamePanel.add(oneStockFour);
        gamePanel.add(oneStockFive);
        gamePanel.add(player2);
        gamePanel.add(twoStockOne);
        gamePanel.add(twoStockTwo);
        gamePanel.add(twoStockThree);
        gamePanel.add(twoStockFour);
        gamePanel.add(twoStockFive);
        gamePanel.add(leftSpit);
        gamePanel.add(rightSpit);

        //spit.setVisible(true);
        gameFrame.setVisible(true);
    }

    static class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == instructions)
            {
                JFrame helpFrame = new JFrame(); //Create frame and panel
                JPanel help = new JPanel(new FlowLayout());
                helpFrame.add(help); //Add panel to window
                helpFrame.setSize(750, 750);

                JLabel lbl = new JLabel("To play this game: \n Each Player starts with an evenly spit deck of cards." + 
                        "The cards are dealt into 5 stock piles, the first with 1 card, the second with 2, and so on. " +
                        "\nThe moves you can make are one rank higher or lower (suit doesn't matter) on either spit pile. " + 
                        "For Player 1 to make a move, they can use numbers 1-5 on the keyboard to select a stock pile to play from " +
                        "and A or D to play on the left or right spit pile, respectively. " +
                        "For Player 2, they use numbers 1-5 on the number pad, and the 0 and Delete buttons to play on each spit pile." +
                        "\nThere are no turns; if you see a move, make it as quick as possible! The other " +
                        "player can make a move on either pile as well. \nWhen one player's stock piles are completely finished, both " +
                        "players have to slap the table. \nPlayer 1 does this by pressing the left shift button, and Player 2 " + 
                        "does this by pressing the Enter key. " + "Whoever slaps first gets the spit pile with less cards." + 
                        "They then must add this number of cards to their original draw pile, reshuffle, and deal again. " +
                        "\nThis is considered a round. The game keeps going until one player has gotten rid of all of their cards.");
                lbl.setFont(new Font("Courier New",Font.BOLD,30));
                lbl.setLocation(325, 325);

                help.add(lbl); //Add label to panel
                help.setBackground(Color.CYAN);
                help.setVisible(true); //Display
                helpFrame.setVisible(true);
            }
            else //Source == start
            {
                
                //gameFrame.setSize(750, 750);
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
            }
        }

        public static void repaintCards() throws IOException
        {
            img = ImageIO.read(new File("cards.png"));
            
            BufferedImage swapPlayer1 = img.getSubimage(deck.player1Cards.get(0).getX(), deck.player1Cards.get(0).getY(), 72, 96);
            BufferedImage swapOneStockOne = img.getSubimage(deck.OneStockOne.get(0).getX(), deck.OneStockOne.get(0).getY(), 72, 96);
            BufferedImage swapOneStockTwo = img.getSubimage(deck.OneStockTwo.get(0).getX(), deck.OneStockTwo.get(0).getY(), 72, 96);
            BufferedImage swapOneStockThree = img.getSubimage(deck.OneStockThree.get(0).getX(), deck.OneStockThree.get(0).getY(), 72, 96);
            BufferedImage swapOneStockFour = img.getSubimage(deck.OneStockFour.get(0).getX(), deck.OneStockFour.get(0).getY(), 72, 96);
            BufferedImage swapOneStockFive = img.getSubimage(deck.OneStockFive.get(0).getX(), deck.OneStockFive.get(0).getY(), 72, 96);

            BufferedImage swapPlayer2 = img.getSubimage(deck.player2Cards.get(0).getX(), deck.player2Cards.get(0).getY(), 72, 96);
            BufferedImage swapTwoStockOne = img.getSubimage(deck.TwoStockOne.get(0).getX(), deck.TwoStockOne.get(0).getY(), 72, 96);
            BufferedImage swapTwoStockTwo = img.getSubimage(deck.TwoStockTwo.get(0).getX(), deck.TwoStockTwo.get(0).getY(), 72, 96);
            BufferedImage swapTwoStockThree = img.getSubimage(deck.TwoStockThree.get(0).getX(), deck.TwoStockThree.get(0).getY(), 72, 96);
            BufferedImage swapTwoStockFour = img.getSubimage(deck.TwoStockFour.get(0).getX(), deck.TwoStockFour.get(0).getY(), 72, 96);
            BufferedImage swapTwoStockFive = img.getSubimage(deck.TwoStockFive.get(0).getX(), deck.TwoStockFive.get(0).getY(), 72, 96);

            BufferedImage swapLeftSpit = img.getSubimage(deck.LeftSpit.get(0).getX(), deck.LeftSpit.get(0).getY(), 72, 96);
            BufferedImage swapRightSpit = img.getSubimage(deck.RightSpit.get(0).getX(), deck.RightSpit.get(0).getY(), 72, 96);

            player1.setIcon(new ImageIcon(swapPlayer1));
            oneStockOne.setIcon(new ImageIcon(swapOneStockOne));
            oneStockTwo.setIcon(new ImageIcon(swapOneStockTwo));
            oneStockThree.setIcon(new ImageIcon(swapOneStockThree));
            oneStockFour.setIcon(new ImageIcon(swapOneStockFour));
            oneStockFive.setIcon(new ImageIcon(swapOneStockFive));

            player2.setIcon(new ImageIcon(swapPlayer2));
            twoStockOne.setIcon(new ImageIcon(swapTwoStockOne));
            twoStockTwo.setIcon(new ImageIcon(swapTwoStockTwo));
            twoStockThree.setIcon(new ImageIcon(swapTwoStockThree));
            twoStockFour.setIcon(new ImageIcon(swapTwoStockFour));
            twoStockFive.setIcon(new ImageIcon(swapTwoStockFive));

            leftSpit.setIcon(new ImageIcon(swapLeftSpit));
            rightSpit.setIcon(new ImageIcon(swapRightSpit));
        }
    }
}