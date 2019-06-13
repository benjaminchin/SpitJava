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
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        deck.shuffle();
        deck.deal();
        
        gameFrame.setDefaultLookAndFeelDecorated(true);
        gameFrame.add(gamePanel);
        gameFrame.setSize(200, 200);
        gamePanel.setBackground(Color.ORANGE);

        spit.setFont(new Font("Courier New",Font.BOLD,30));
        gamePanel.add(spit);

        start.addActionListener(new Action());
        instructions.addActionListener(new Action());

        gamePanel.add(start);
        gamePanel.add(instructions);

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

                JLabel lbl = new JLabel("To play this game /n Each Player starts with an evenly spit deck of cards." + 
                "The cards are dealt into 5 piles, the first with 1 card, the second with 2, and so on. ");
                lbl.setFont(new Font("Courier New",Font.BOLD,30));
                lbl.setLocation(325, 325);

                help.add(lbl); //Add label to panel
                help.setBackground(Color.CYAN);
                help.setVisible(true); //Display
                helpFrame.setVisible(true);
            }
            else //Source == start
            {
                gameFrame.setSize(750, 750);
                //gameFrame.setBackground(Color.GREEN);
                gamePanel.setSize(750, 750);
                gamePanel.setBackground(Color.GREEN);
                
                gamePanel.remove(start);
                gamePanel.remove(spit);
                //gamePanel.remove(instructions);
            }
        }
    }
}