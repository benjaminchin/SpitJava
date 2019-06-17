//test class
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
public class TestGUI extends JFrame
{
    private static JLabel spit = new JLabel("Spit");
    private static JButton start = new JButton("Start");
    private static JButton instructions = new JButton("Instructions");
    private static JFrame frame = new JFrame();

    public static void start()
    {
        JPanel startMenu = new JPanel(new FlowLayout());
        frame.setDefaultLookAndFeelDecorated(true);

        frame.add(startMenu);//Add startMenu window to the frame
        frame.setSize(400, 100);
        spit.setLocation(200, 50); //Set locations of label and buttons
        start.setLocation(50, 150);
        instructions.setLocation(550, 150);
        spit.setFont(new Font("Courier New",Font.BOLD,30));
        startMenu.add(spit); //Add label and buttons to panel
        startMenu.add(start);
        start.addActionListener(new Action());
        startMenu.add(instructions);
        instructions.addActionListener(new Action());
        startMenu.setBackground(Color.ORANGE);
        startMenu.setVisible(true); //Make visible
        frame.setVisible(true);
        
    }

    public static void main(String[] args)
    {
        start();
    }

    static class Action extends Deck implements ActionListener
    {  
        private JFrame playGame = new JFrame();
        private JPanel game = new JPanel();

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
        
        public void actionPerformed (ActionEvent e)
        {
            if (e.getSource() == instructions) //If "instructions" button is pressed, display how to play game.
            {
                JFrame helpFrame = new JFrame(); //Create frame and panel
                JPanel help = new JPanel(new FlowLayout());
                helpFrame.add(help); //Add panel to window
                helpFrame.setSize(750, 750);

                JLabel lbl = new JLabel("To play this game "); //Label text
                lbl.setFont(new Font("Courier New",Font.BOLD,30));
                lbl.setLocation(325, 325);

                help.add(lbl); //Add label to panel
                help.setBackground(Color.CYAN);
                help.setVisible(true); //Display
                helpFrame.setVisible(true);
            }
            else //If start button is pressed, display table and start playing game.
            {
                
            
                deck.shuffle();
                deck.deal();
                
                playGame.add(game);
                playGame.setSize(750, 750);

                game.setBackground(Color.GREEN);

                try
                {
                    img = ImageIO.read(new File("cards.png"));
                }
                catch(Exception ex)
                {
                    //Nothing
                }

                playGame.add(player1);
                playGame.add(oneStockOne);
                playGame.add(oneStockTwo);
                playGame.add(oneStockThree);
                playGame.add(oneStockFour);
                playGame.add(oneStockFive);
                playGame.add(player2);
                playGame.add(twoStockOne);
                playGame.add(twoStockTwo);
                playGame.add(twoStockThree);
                playGame.add(twoStockFour);
                playGame.add(twoStockFive);
                playGame.add(leftSpit);
                playGame.add(rightSpit);

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
                
                game.setVisible(true);
                playGame.setVisible(true);
                playGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        }
        public static void repaint()
        {
            //BufferedImage img = ImageIO.read(new File("cards.png"));
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
    
        
        public void keyPressed(KeyEvent e)
        {

        }

        public void keyReleased(KeyEvent e)
        {
        }

        public void keyTyped(KeyEvent e)
        {
        }

    }
}