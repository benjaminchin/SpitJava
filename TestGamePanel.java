import javax.swing.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

public class TestGamePanel  extends JPanel
{
    private JLabel card = new JLabel();
    private Deck deck = new Deck();
    private BufferedImage img;
    public TestGamePanel() throws IOException
    {
        this.setBackground(Color.GREEN);
        deck.shuffle();
        deck.deal();
        
        img = ImageIO.read(new File("cards.png"));
        
        
        card.setBounds(200, 130, 72, 96);
        BufferedImage firstCard = img.getSubimage(deck.OneStockOne.get(0).getX(), deck.OneStockOne.get(0).getY(), 72, 96);
        card.setIcon(new ImageIcon(firstCard));
        
        //repaintCards();
        
        this.add(card);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(true);
        
        
    }
    
    public void makeMove()
    {
        deck.LeftSpit.add(deck.OneStockTwo.get(0));
        deck.OneStockTwo.remove(0);
    }
    public void repaintCards()
    {
        //card.setBounds(320, 10, 72, 96);
        BufferedImage tempCard = img.getSubimage(deck.OneStockTwo.get(0).getX(), deck.OneStockTwo.get(0).getY(), 72, 96);
        card.setIcon(new ImageIcon(tempCard));
    }
}