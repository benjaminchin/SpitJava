//author:Ben Chin
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
public class DisplayImage extends Deck
{
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
    
    private static BufferedImage img;
    private static Deck deck = new Deck();
    public static void main(String[] args) throws IOException
    {
        img = ImageIO.read(new File("cards.png"));
        deck.shuffle();
        deck.deal();
        DisplayImage abc = new DisplayImage();
        repaint();
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
    public DisplayImage() throws IOException
    {
        BufferedImage img = ImageIO.read(new File("cards.png"));
        
        /* BufferedImage clubs1 = img.getSubimage(0, 0, 72, 96);
        BufferedImage clubs2 = img.getSubimage(72, 0, 72, 96);
        BufferedImage hearts1 = img.getSubimage(0 ,192, 72, 96);
        BufferedImage hearts2 = img.getSubimage(72, 192, 72, 96);
        BufferedImage hearts3 = img.getSubimage(144, 192, 72, 96);
        BufferedImage spades13 = img.getSubimage(864, 96, 72, 96);
        
        BufferedImage clubs12 = img.getSubimage(792, 0, 72, 96);
        BufferedImage diamonds3 = img.getSubimage(144, 288, 72, 96);
        BufferedImage hearts8 = img.getSubimage(504 ,192, 72, 96);
        BufferedImage hearts10 = img.getSubimage(648, 192, 72, 96);
        BufferedImage spades1 = img.getSubimage(0, 96, 72, 96);
        BufferedImage spades7 = img.getSubimage(432, 96, 72, 96);
        */
        BufferedImage noFace1 = img.getSubimage(936, 0, 72, 96);
        BufferedImage noFace2 = img.getSubimage(936, 0, 72, 96);
        
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.getContentPane().setBackground(Color.GREEN);
        
        JLabel player1 = new JLabel();
        //JLabel oneStockOne = new JLabel();
        //JLabel oneStockTwo = new JLabel();
        //JLabel oneStockThree = new JLabel();
        //JLabel oneStockFour = new JLabel();
        //JLabel oneStockFive = new JLabel();
        
        JLabel player2 = new JLabel();
        //JLabel twoStockOne = new JLabel();
        //JLabel twoStockTwo = new JLabel();
        //JLabel twoStockThree = new JLabel();
        //JLabel twoStockFour = new JLabel();
        //JLabel twoStockFive = new JLabel();
        
        //JLabel leftSpit = new JLabel();
        //JLabel rightSpit = new JLabel();
        
        
        
        player1.setIcon(new ImageIcon(noFace1));
        /*oneStockOne.setIcon(new ImageIcon(clubs2));
        oneStockTwo.setIcon(new ImageIcon(hearts1));
        oneStockThree.setIcon(new ImageIcon(hearts2));
        oneStockFour.setIcon(new ImageIcon(hearts3));
        oneStockFive.setIcon(new ImageIcon(spades13));
        */
        
        player2.setIcon(new ImageIcon(noFace2));
        /*twoStockOne.setIcon(new ImageIcon(diamonds3));
        twoStockTwo.setIcon(new ImageIcon(hearts8));
        twoStockThree.setIcon(new ImageIcon(hearts10));
        twoStockFour.setIcon(new ImageIcon(spades1));
        twoStockFive.setIcon(new ImageIcon(spades7));
        
        leftSpit.setIcon(new ImageIcon(noFace1));
        rightSpit.setIcon(new ImageIcon(noFace2));
        */
        frame.add(player1);
        frame.add(oneStockOne);
        frame.add(oneStockTwo);
        frame.add(oneStockThree);
        frame.add(oneStockFour);
        frame.add(oneStockFive);
        frame.add(player2);
        frame.add(twoStockOne);
        frame.add(twoStockTwo);
        frame.add(twoStockThree);
        frame.add(twoStockFour);
        frame.add(twoStockFive);
        frame.add(leftSpit);
        frame.add(rightSpit);
        
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
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
}