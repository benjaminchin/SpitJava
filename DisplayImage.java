import java.awt.FlowLayout;
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
    
    public static void main(String[] args) throws IOException
    {
        DisplayImage abc = new DisplayImage();
    }

    public DisplayImage() throws IOException
    {
        BufferedImage img = ImageIO.read(new File("cards.png"));
        
        BufferedImage clubs1 = img.getSubimage(0, 0, 72, 96);
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
        
        BufferedImage diamonds10 = img.getSubimage(648, 288, 72, 96);
        BufferedImage hearts6 = img.getSubimage(360, 288, 72, 96);
        
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.getContentPane().setBackground(Color.GREEN);
        
        JLabel player1 = new JLabel();
        JLabel oneStockOne = new JLabel();
        JLabel oneStockTwo = new JLabel();
        JLabel oneStockThree = new JLabel();
        JLabel oneStockFour = new JLabel();
        JLabel oneStockFive = new JLabel();
        
        JLabel player2 = new JLabel();
        JLabel twoStockOne = new JLabel();
        JLabel twoStockTwo = new JLabel();
        JLabel twoStockThree = new JLabel();
        JLabel twoStockFour = new JLabel();
        JLabel twoStockFive = new JLabel();
        
        JLabel leftSpit = new JLabel();
        JLabel rightSpit = new JLabel();
        
        
        
        player1.setIcon(new ImageIcon(clubs1));
        oneStockOne.setIcon(new ImageIcon(clubs2));
        oneStockTwo.setIcon(new ImageIcon(hearts1));
        oneStockThree.setIcon(new ImageIcon(hearts2));
        oneStockFour.setIcon(new ImageIcon(hearts3));
        oneStockFive.setIcon(new ImageIcon(spades13));
        
        
        player2.setIcon(new ImageIcon(clubs12));
        twoStockOne.setIcon(new ImageIcon(diamonds3));
        twoStockTwo.setIcon(new ImageIcon(hearts8));
        twoStockThree.setIcon(new ImageIcon(hearts10));
        twoStockFour.setIcon(new ImageIcon(spades1));
        twoStockFive.setIcon(new ImageIcon(spades7));
        
        leftSpit.setIcon(new ImageIcon(diamonds10));
        rightSpit.setIcon(new ImageIcon(hearts6));
       
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