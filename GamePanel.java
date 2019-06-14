import javax.swing.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

public class GamePanel  extends JPanel
{
    private JLabel player1 = new JLabel();
    private JLabel oneStockOne = new JLabel();
    private JLabel oneStockTwo = new JLabel();
    private JLabel oneStockThree = new JLabel();
    private JLabel oneStockFour = new JLabel();
    private JLabel oneStockFive = new JLabel();
        
    private JLabel player2 = new JLabel();
    private JLabel twoStockOne = new JLabel();
    private JLabel twoStockTwo = new JLabel();
    private JLabel twoStockThree = new JLabel();
    private JLabel twoStockFour = new JLabel();
    private JLabel twoStockFive = new JLabel();
        
    private JLabel leftSpit = new JLabel();
    private JLabel rightSpit = new JLabel();
    
    private Deck deck = new Deck();
    private BufferedImage img;
    public GamePanel() throws IOException
    {
        this.setBackground(Color.GREEN);
        deck.shuffle();
        deck.deal();
        
        img = ImageIO.read(new File("cards.png"));
        
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
        
        //BufferedImage first1s1 = img.getSubimage(deck.OneStockOne.get(0).getX(), deck.OneStockOne.get(0).getY(), 72, 96);
        
        
        //repaintCards();
        //Add labels to panel
        this.add(player1);
        this.add(oneStockOne);
        this.add(oneStockTwo);
        this.add(oneStockThree);
        this.add(oneStockFour);
        this.add(oneStockFive);
        this.add(player2);
        this.add(twoStockOne);
        this.add(twoStockTwo);
        this.add(twoStockThree);
        this.add(twoStockFour);
        this.add(twoStockFive);
        
        this.add(leftSpit);
        this.add(rightSpit);
 
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(true);
        
        repaintCards();
    }
    
    public void makeMove()
    {
        deck.LeftSpit.add(deck.OneStockTwo.get(0));
        deck.OneStockTwo.remove(0);
    }
    
    public void repaintCards()
    {
        
    }
    //Player 1 moves
    public void p1OneToLeft()
    {
        deck.LeftSpit.add(deck.OneStockOne.get(0));
        deck.OneStockOne.remove(0);
    }
    
    public void p1OneToRight()
    {
        deck.RightSpit.add(deck.OneStockOne.get(0));
        deck.OneStockOne.remove(0);
    }

    public void p1TwoToLeft()
    {
        deck.LeftSpit.add(deck.OneStockTwo.get(0));
        deck.OneStockTwo.remove(0);
    }
    
    public void p1TwoToRight()
    {
        deck.RightSpit.add(deck.OneStockTwo.get(0));
        deck.OneStockTwo.remove(0);
    }
    
    public void p1ThreeToLeft()
    {
        deck.LeftSpit.add(deck.OneStockThree.get(0));
        deck.OneStockThree.remove(0);
    }
    
    public void p1ThreeToRight()
    {
        deck.RightSpit.add(deck.OneStockThree.get(0));
        deck.OneStockThree.remove(0);
    }
    
    public void p1FourToLeft()
    {
        deck.LeftSpit.add(deck.OneStockFour.get(0));
        deck.OneStockFour.remove(0);
    }
    
    public void p1FourToRight()
    {
        deck.RightSpit.add(deck.OneStockFour.get(0));
        deck.OneStockFour.remove(0);
    }
    
    public void p1FiveToLeft()
    {
        deck.LeftSpit.add(deck.OneStockFive.get(0));
        deck.OneStockFive.remove(0);
    }
    
    public void p1FiveToRight()
    {
        deck.RightSpit.add(deck.OneStockFive.get(0));
        deck.OneStockFive.remove(0);
    }
    
    //Player 2 moves
    public void p2OneToLeft()
    {
        deck.LeftSpit.add(deck.TwoStockOne.get(0));
        deck.TwoStockOne.remove(0);
    }
    
    public void p2OneToRight()
    {
        deck.RightSpit.add(deck.TwoStockOne.get(0));
        deck.TwoStockOne.remove(0);
    }
    
    public void p2TwoToLeft()
    {
        deck.LeftSpit.add(deck.TwoStockTwo.get(0));
        deck.TwoStockTwo.remove(0);
    }
    
    public void p2TwoToRight()
    {
        deck.RightSpit.add(deck.TwoStockTwo.get(0));
        deck.TwoStockTwo.remove(0);
    }
    
    public void p2ThreeToLeft()
    {
        deck.LeftSpit.add(deck.TwoStockThree.get(0));
        deck.TwoStockThree.remove(0);
    }
    
    public void p2ThreeToRight()
    {
        deck.RightSpit.add(deck.TwoStockThree.get(0));
        deck.TwoStockThree.remove(0);
    }
    
    public void p2FourToLeft()
    {
        deck.LeftSpit.add(deck.TwoStockFour.get(0));
        deck.TwoStockFour.remove(0);
    }
    
    public void p2FourToRight()
    {
        deck.RightSpit.add(deck.TwoStockFour.get(0));
        deck.TwoStockFour.remove(0);
    }
    
    public void p2FiveToLeft()
    {
        deck.LeftSpit.add(deck.TwoStockFive.get(0));
        deck.TwoStockFive.remove(0);
    }
    
    public void p2FiveToRight()
    {
        deck.RightSpit.add(deck.TwoStockFive.get(0));
        deck.TwoStockFive.remove(0);
    }
}