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
import java.util.ArrayList;
import java.awt.Dimension;

public class GUI3 implements ActionListener
{
    private static JFrame gameFrame = new JFrame();
    private static JPanel gamePanel = new JPanel();
    private static JLabel spit = new JLabel("Spit");
    private static JButton start = new JButton("Start");
    private static JButton instructions = new JButton("Instructions");
    public  static int p2selected = 0;
    public static String p2pile;
    public static int p1selected = 0;
    public static String p1pile;

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
        gameFrame.setSize(300, 200);
        gameFrame.getContentPane().setBackground(Color.ORANGE);

        spit.setFont(new Font("Courier New",Font.BOLD,30));

        //Sizes
        spitSize = spit.getPreferredSize();
        startSize = start.getPreferredSize();
        instructSize = instructions.getPreferredSize();

        //Coordinates
        spit.setBounds(110, 0, spitSize.width, spitSize.height);
        start.setBounds(50, 50, startSize.width, startSize.height);
        instructions.setBounds(150, 50, instructSize.width, instructSize.height);
        
        
        start.addActionListener(new ActionInput());
        instructions.addActionListener(new ActionInput());
        
        gameFrame.addKeyListener(new KeyInput());
        
        
    }
    
    public static void repaintCards() throws IOException
    {
        img = ImageIO.read(new File("cards.png"));

        BufferedImage swapPlayer1 = img.getSubimage(936, 0, 72, 96);
        BufferedImage swapOneStockOne = img.getSubimage(deck.OneStockOne.get(0).getX(), deck.OneStockOne.get(0).getY(), 72, 96);
        BufferedImage swapOneStockTwo = img.getSubimage(deck.OneStockTwo.get(0).getX(), deck.OneStockTwo.get(0).getY(), 72, 96);
        BufferedImage swapOneStockThree = img.getSubimage(deck.OneStockThree.get(0).getX(), deck.OneStockThree.get(0).getY(), 72, 96);
        BufferedImage swapOneStockFour = img.getSubimage(deck.OneStockFour.get(0).getX(), deck.OneStockFour.get(0).getY(), 72, 96);
        BufferedImage swapOneStockFive = img.getSubimage(deck.OneStockFive.get(0).getX(), deck.OneStockFive.get(0).getY(), 72, 96);

        BufferedImage swapPlayer2 = img.getSubimage(936, 0, 72, 96);
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