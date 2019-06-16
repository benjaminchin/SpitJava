import javax.swing.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.JOptionPane;
import java.util.Collections;
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
    public GamePanel() throws IOException //Ben C, Revanth S
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

        BufferedImage p1Image = img.getSubimage(936, 0, 72, 96);
        BufferedImage p2Image = img.getSubimage(936, 0, 72, 96);

        player1.setIcon(new ImageIcon(p1Image));
        player2.setIcon(new ImageIcon(p2Image));

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
        if(canPlay() == false)
            drawCard();
    }

    public void repaintCards() //Ben C
    {
        if(deck.OneStockOne.size() > 0)
        {    
            BufferedImage swapOneStockOne = img.getSubimage(deck.OneStockOne.get(0).getX(), deck.OneStockOne.get(0).getY(), 72, 96);
            oneStockOne.setIcon(new ImageIcon(swapOneStockOne));
        }
        else
            oneStockOne.setIcon(null);
        if(deck.OneStockTwo.size() > 0)
        {    
            BufferedImage swapOneStockTwo = img.getSubimage(deck.OneStockTwo.get(0).getX(), deck.OneStockTwo.get(0).getY(), 72, 96);
            oneStockTwo.setIcon(new ImageIcon(swapOneStockTwo));
        }
        else
            oneStockTwo.setIcon(null);
        if(deck.OneStockThree.size() > 0)
        {    
            BufferedImage swapOneStockThree = img.getSubimage(deck.OneStockThree.get(0).getX(), deck.OneStockThree.get(0).getY(), 72, 96);
            oneStockThree.setIcon(new ImageIcon(swapOneStockThree));
        }
        else
            oneStockThree.setIcon(null);
        if(deck.OneStockFour.size() > 0)
        {    
            BufferedImage swapOneStockFour = img.getSubimage(deck.OneStockFour.get(0).getX(), deck.OneStockFour.get(0).getY(), 72, 96);
            oneStockFour.setIcon(new ImageIcon(swapOneStockFour));
        }
        else
            oneStockFour.setIcon(null);
        if(deck.OneStockFive.size() > 0)
        {    
            BufferedImage swapOneStockFive = img.getSubimage(deck.OneStockFive.get(0).getX(), deck.OneStockFive.get(0).getY(), 72, 96);
            oneStockFive.setIcon(new ImageIcon(swapOneStockFive));
        }
        else
            oneStockFive.setIcon(null);
        //if(deck.player2Cards.size() > 0)
        //player2.setIcon(new ImageIcon(swapPlayer2));
        if(deck.TwoStockOne.size() > 0)
        {    
            BufferedImage swapTwoStockOne = img.getSubimage(deck.TwoStockOne.get(0).getX(), deck.TwoStockOne.get(0).getY(), 72, 96);
            twoStockOne.setIcon(new ImageIcon(swapTwoStockOne));
        }
        else
            twoStockOne.setIcon(null);
        if(deck.TwoStockTwo.size() > 0)
        {    
            BufferedImage swapTwoStockTwo = img.getSubimage(deck.TwoStockTwo.get(0).getX(), deck.TwoStockTwo.get(0).getY(), 72, 96);
            twoStockTwo.setIcon(new ImageIcon(swapTwoStockTwo));
        }
        else
            twoStockTwo.setIcon(null);
        if(deck.TwoStockThree.size() > 0)
        {    
            BufferedImage swapTwoStockThree = img.getSubimage(deck.TwoStockThree.get(0).getX(), deck.TwoStockThree.get(0).getY(), 72, 96);
            twoStockThree.setIcon(new ImageIcon(swapTwoStockThree));
        }
        else
            twoStockThree.setIcon(null);
        if(deck.TwoStockFour.size() > 0)
        {    
            BufferedImage swapTwoStockFour = img.getSubimage(deck.TwoStockFour.get(0).getX(), deck.TwoStockFour.get(0).getY(), 72, 96);
            twoStockFour.setIcon(new ImageIcon(swapTwoStockFour));    
        }
        else
            twoStockFour.setIcon(null);
        if(deck.TwoStockFive.size() > 0)
        {    
            BufferedImage swapTwoStockFive = img.getSubimage(deck.TwoStockFive.get(0).getX(), deck.TwoStockFive.get(0).getY(), 72, 96);
            twoStockFive.setIcon(new ImageIcon(swapTwoStockFive));    
        }
        else
            twoStockFive.setIcon(null);
        if(deck.LeftSpit.size() > 0)
        {
            BufferedImage swapLeftSpit = img.getSubimage(deck.LeftSpit.get(0).getX(), deck.LeftSpit.get(0).getY(), 72, 96);
            leftSpit.setIcon(new ImageIcon(swapLeftSpit));
        }
        else
            leftSpit.setIcon(null);
        if(deck.RightSpit.size() > 0)
        {    
            BufferedImage swapRightSpit = img.getSubimage(deck.RightSpit.get(0).getX(), deck.RightSpit.get(0).getY(), 72, 96);
            rightSpit.setIcon(new ImageIcon(swapRightSpit));
        }
        else
            rightSpit.setIcon(null);
    }
    //Player 1 moves
    public void p1OneToLeft() //Ben C, Revanth S
    {

        if(deck.OneStockOne.size() > 0 && (deck.OneStockOne.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.OneStockOne.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {    
            deck.LeftSpit.add(0, deck.OneStockOne.get(0));
            deck.OneStockOne.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }//If no cards can be placed, auto-draw
        gameIsOver();
        roundIsOver();//Checks for round over, restarts round if so
    }

    public void p1OneToRight() //Ben C, Revanth S
    {

        if(deck.OneStockOne.size() > 0 && (deck.OneStockOne.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.OneStockOne.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.OneStockOne.get(0));
            deck.OneStockOne.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p1TwoToLeft() //Ben C, Revanth S
    {

        if(deck.OneStockTwo.size() > 0 && (deck.OneStockTwo.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.OneStockTwo.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {    
            deck.LeftSpit.add(0, deck.OneStockTwo.get(0));
            deck.OneStockTwo.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p1TwoToRight() //Ben C, Revanth S
    {

        if(deck.OneStockTwo.size() > 0 && (deck.OneStockTwo.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.OneStockTwo.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.OneStockTwo.get(0));
            deck.OneStockTwo.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p1ThreeToLeft() //Ben C, Revanth S
    {

        if(deck.OneStockThree.size() > 0 && (deck.OneStockThree.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.OneStockThree.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.OneStockThree.get(0));
            deck.OneStockThree.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p1ThreeToRight() //Ben C, Revanth S
    {

        if(deck.OneStockThree.size() > 0 && (deck.OneStockThree.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.OneStockThree.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.OneStockThree.get(0));
            deck.OneStockThree.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p1FourToLeft() //Ben C, Revanth S
    {

        if(deck.OneStockFour.size() > 0 && (deck.OneStockFour.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.OneStockFour.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.OneStockFour.get(0));
            deck.OneStockFour.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p1FourToRight() //Ben C, Revanth S
    {

        if(deck.OneStockFour.size() > 0 && (deck.OneStockFour.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.OneStockFour.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.OneStockFour.get(0));
            deck.OneStockFour.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p1FiveToLeft() //Ben C, Revanth S
    {

        if(deck.OneStockFive.size() > 0 && (deck.OneStockFive.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.OneStockFive.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.OneStockFive.get(0));
            deck.OneStockFive.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p1FiveToRight() //Ben C, Revanth S
    {

        if(deck.OneStockFive.size() > 0 && (deck.OneStockFive.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.OneStockFive.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.OneStockFive.get(0));
            deck.OneStockFive.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    //Player 2 moves
    public void p2OneToLeft() //Ben C, Revanth S
    {

        if(deck.TwoStockOne.size() > 0 && (deck.TwoStockOne.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.TwoStockOne.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.TwoStockOne.get(0));
            deck.TwoStockOne.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p2OneToRight() //Ben C, Revanth S
    {

        if(deck.TwoStockOne.size() > 0 && (deck.TwoStockOne.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.TwoStockOne.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.TwoStockOne.get(0));
            deck.TwoStockOne.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p2TwoToLeft() //Ben C, Revanth S
    {

        if(deck.TwoStockTwo.size() > 0 && (deck.TwoStockTwo.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.TwoStockTwo.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.TwoStockTwo.get(0));
            deck.TwoStockTwo.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p2TwoToRight() //Ben C, Revanth S
    {

        if(deck.TwoStockTwo.size() > 0 && (deck.TwoStockTwo.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.TwoStockTwo.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.TwoStockTwo.get(0));
            deck.TwoStockTwo.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p2ThreeToLeft() //Ben C, Revanth S
    {

        if(deck.TwoStockThree.size() > 0 && (deck.TwoStockThree.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.TwoStockThree.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.TwoStockThree.get(0));
            deck.TwoStockThree.remove(0);
            repaintCards();
        }
        if(canPlay()== false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p2ThreeToRight() //Ben C, Revanth S
    {

        if(deck.TwoStockThree.size() > 0 && (deck.TwoStockThree.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.TwoStockThree.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.TwoStockThree.get(0));
            deck.TwoStockThree.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p2FourToLeft() //Ben C, Revanth S
    {

        if(deck.TwoStockFour.size() > 0 && (deck.TwoStockFour.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.TwoStockFour.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.TwoStockFour.get(0));
            deck.TwoStockFour.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p2FourToRight() //Ben C, Revanth S
    {

        if(deck.TwoStockFour.size() > 0 && (deck.TwoStockFour.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.TwoStockFour.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.TwoStockFour.get(0));
            deck.TwoStockFour.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p2FiveToLeft() //Ben C, Revanth S
    {

        if(deck.TwoStockFive.size() > 0 && (deck.TwoStockFive.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.TwoStockFive.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.TwoStockFive.get(0));
            deck.TwoStockFive.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public void p2FiveToRight() //Ben C, Revanth S
    {

        if(deck.TwoStockFive.size() > 0 &&(deck.TwoStockFive.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.TwoStockFive.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.TwoStockFive.get(0));
            deck.TwoStockFive.remove(0);
            repaintCards();
        }
        if(canPlay()==false)
        {
            drawCard();
        }
        gameIsOver();
        roundIsOver();
    }

    public boolean canPlay() // Dhruv G, Ben C
    {
        if(deck.OneStockOne.size() > 0)
            if(((deck.OneStockOne.get(0).getRank() - 1) == deck.LeftSpit.get(0).getRank()) || ((deck.OneStockOne.get(0).getRank() + 1) == deck.LeftSpit.get(0).getRank()) ||
            ((deck.OneStockOne.get(0).getRank() - 1) == deck.RightSpit.get(0).getRank()) || ((deck.OneStockOne.get(0).getRank() + 1) == deck.RightSpit.get(0).getRank()))
                return true;
        if(deck.OneStockTwo.size() > 0)
            if(((deck.OneStockTwo.get(0).getRank() - 1) == deck.LeftSpit.get(0).getRank()) || ((deck.OneStockTwo.get(0).getRank() + 1) == deck.LeftSpit.get(0).getRank()) ||
            ((deck.OneStockTwo.get(0).getRank() - 1) == deck.RightSpit.get(0).getRank()) || ((deck.OneStockTwo.get(0).getRank() + 1) == deck.RightSpit.get(0).getRank()))
                return true;        
        if(deck.OneStockThree.size() > 0)
            if(((deck.OneStockThree.get(0).getRank() - 1) == deck.LeftSpit.get(0).getRank()) || ((deck.OneStockThree.get(0).getRank() + 1) == deck.LeftSpit.get(0).getRank()) ||
            ((deck.OneStockThree.get(0).getRank() - 1) == deck.RightSpit.get(0).getRank()) || ((deck.OneStockThree.get(0).getRank() + 1) == deck.RightSpit.get(0).getRank()))
                return true;        
        if(deck.OneStockFour.size() > 0)
            if(((deck.OneStockFour.get(0).getRank() - 1) == deck.LeftSpit.get(0).getRank()) || ((deck.OneStockFour.get(0).getRank() + 1) == deck.LeftSpit.get(0).getRank()) ||
            ((deck.OneStockFour.get(0).getRank() - 1) == deck.RightSpit.get(0).getRank()) || ((deck.OneStockFour.get(0).getRank() + 1) == deck.RightSpit.get(0).getRank()))
                return true;
        if(deck.OneStockFive.size() > 0)
            if(((deck.OneStockFive.get(0).getRank() - 1) == deck.LeftSpit.get(0).getRank()) || ((deck.OneStockFive.get(0).getRank() + 1) == deck.LeftSpit.get(0).getRank()) ||
            ((deck.OneStockFive.get(0).getRank() - 1) == deck.RightSpit.get(0).getRank()) || ((deck.OneStockFive.get(0).getRank() + 1) == deck.RightSpit.get(0).getRank()))
                return true;

        if(deck.TwoStockOne.size() > 0)
            if(((deck.TwoStockOne.get(0).getRank() - 1) == deck.LeftSpit.get(0).getRank()) || ((deck.TwoStockOne.get(0).getRank() + 1) == deck.LeftSpit.get(0).getRank()) ||
            ((deck.TwoStockOne.get(0).getRank() - 1) == deck.RightSpit.get(0).getRank()) || ((deck.TwoStockOne.get(0).getRank() + 1) == deck.RightSpit.get(0).getRank()))
                return true;
        if(deck.TwoStockTwo.size() > 0)
            if(((deck.TwoStockTwo.get(0).getRank() - 1) == deck.LeftSpit.get(0).getRank()) || ((deck.TwoStockTwo.get(0).getRank() + 1) == deck.LeftSpit.get(0).getRank()) ||
            ((deck.TwoStockTwo.get(0).getRank() - 1) == deck.RightSpit.get(0).getRank()) || ((deck.TwoStockTwo.get(0).getRank() + 1) == deck.RightSpit.get(0).getRank()))
                return true;
        if(deck.TwoStockThree.size() > 0)
            if(((deck.TwoStockThree.get(0).getRank() - 1) == deck.LeftSpit.get(0).getRank()) || ((deck.TwoStockThree.get(0).getRank() + 1) == deck.LeftSpit.get(0).getRank()) ||
            ((deck.TwoStockThree.get(0).getRank() - 1) == deck.RightSpit.get(0).getRank()) || ((deck.TwoStockThree.get(0).getRank() + 1) == deck.RightSpit.get(0).getRank()))
                return true;
        if(deck.TwoStockFour.size() > 0)
            if(((deck.TwoStockFour.get(0).getRank() - 1) == deck.LeftSpit.get(0).getRank()) || ((deck.TwoStockFour.get(0).getRank() + 1) == deck.LeftSpit.get(0).getRank()) ||
            ((deck.TwoStockFour.get(0).getRank() - 1) == deck.RightSpit.get(0).getRank()) || ((deck.TwoStockFour.get(0).getRank() + 1) == deck.RightSpit.get(0).getRank()))
                return true;
        if(deck.TwoStockFive.size() > 0)
            if(((deck.TwoStockFive.get(0).getRank() - 1) == deck.LeftSpit.get(0).getRank()) || ((deck.TwoStockFive.get(0).getRank() + 1) == deck.LeftSpit.get(0).getRank()) ||
            ((deck.TwoStockFive.get(0).getRank() - 1) == deck.RightSpit.get(0).getRank()) || ((deck.TwoStockFive.get(0).getRank() + 1) == deck.RightSpit.get(0).getRank()))
                return true; 
        return false;
    }

    public void drawCard() //Revanth S, Ben C
    {
        if(!((deck.OneStockOne.size() == 0 && deck.OneStockTwo.size() == 0 && deck.OneStockThree.size() == 0 && deck.OneStockFour.size() == 0 && deck.OneStockFive.size() == 0) ||
            (deck.TwoStockOne.size() == 0 && deck.TwoStockTwo.size() == 0 && deck.TwoStockThree.size() == 0 && deck.TwoStockFour.size() == 0 && deck.TwoStockFive.size() == 0)))
        {    
            for(int i = 0; i < 52; i++)
            {
                if(canPlay() == true)
                    break;
                else
                {
                    if(deck.player1Cards.size() > 0)
                        deck.LeftSpit.add(0, deck.player1Cards.remove(0));
                    if(deck.player2Cards.size() > 0)
                        deck.RightSpit.add(0, deck.player2Cards.remove(0));
                    repaintCards();
                    //infoBoxes("Card drawn", "Update");
                    //System.out.println("Card drawn.");//Testing
                }
            }
            if(canPlay() == false)
            {
                while(canPlay() == false)
                {    
                    Collections.shuffle(deck.LeftSpit);
                    Collections.shuffle(deck.RightSpit);
                    repaintCards();
                }
            }
            infoBoxes("Card drawn", "Update");
        }
    }

    public void roundIsOver() //Revanth S, Ben Chin, Dhruv G
    {
        if ((deck.OneStockOne.size() == 0 && deck.OneStockTwo.size() == 0 && deck.OneStockThree.size() == 0 && 
            deck.OneStockFour.size() == 0 && deck.OneStockFive.size() == 0))
        {
            if(deck.LeftSpit.size() > deck.RightSpit.size())
            {
                for(Card c : deck.RightSpit)
                    deck.player1Cards.add(c);
                for(Card c : deck.LeftSpit)
                    deck.player2Cards.add(c);
            }
            else
            {
                for(Card  c : deck.LeftSpit)
                    deck.player1Cards.add(c);
                for(Card c : deck.RightSpit)
                    deck.player2Cards.add(c);    
            }
            setUpRound();
            infoBoxes("Round is Over - Player1 Wins the Round!", "Round End");
            //System.out.println("New Round");
        }
        else if(deck.TwoStockOne.size() == 0 && deck.TwoStockTwo.size() == 0 && deck.TwoStockThree.size() == 0 && deck.TwoStockFour.size() == 0 && 
        deck.TwoStockFive.size() == 0)
        {
            if(deck.LeftSpit.size() > deck.RightSpit.size())
            {
                for(Card c : deck.RightSpit)
                    deck.player2Cards.add(c);
                for(Card c : deck.LeftSpit)
                    deck.player1Cards.add(c);
            }
            else
            {
                for(Card  c : deck.LeftSpit)
                    deck.player2Cards.add(c);
                for(Card c : deck.RightSpit)
                    deck.player1Cards.add(c);
            }
            setUpRound();
            infoBoxes("Round is Over - Player2 Wins the Round!", "Round End");
            //System.out.println("New Round");
        }
        
    }
    
    public void setUpRound() //Ben C
    {
        for(Card c : deck.OneStockOne)
            deck.player1Cards.add(c);
        for(Card c : deck.OneStockTwo)
            deck.player1Cards.add(c);
        for(Card c : deck.OneStockThree)
            deck.player1Cards.add(c);
        for(Card c : deck.OneStockFour)
            deck.player1Cards.add(c);
        for(Card c : deck.OneStockFive)
            deck.player1Cards.add(c);
        
        for(Card c : deck.TwoStockOne)
            deck.player2Cards.add(c);
        for(Card c : deck.TwoStockTwo)
            deck.player2Cards.add(c);
        for(Card c : deck.TwoStockThree)
            deck.player2Cards.add(c);
        for(Card c : deck.TwoStockFour)
            deck.player2Cards.add(c);
        for(Card c : deck.TwoStockFive)
            deck.player2Cards.add(c);    
            
        deck.RightSpit.clear();
        deck.LeftSpit.clear();
        deck.OneStockOne.clear();
        deck.OneStockTwo.clear();
        deck.OneStockThree.clear();
        deck.OneStockFour.clear();
        deck.OneStockFive.clear();
        deck.TwoStockOne.clear();
        deck.TwoStockTwo.clear();
        deck.TwoStockThree.clear();
        deck.TwoStockFour.clear();
        deck.TwoStockFive.clear();
        
        Collections.shuffle(deck.player1Cards);
        Collections.shuffle(deck.player2Cards);
        
        deck.deal();
        repaintCards();
        if(canPlay() == false)
                drawCard();
    }
    public static void infoBoxes(String infoMessage, String titleBar) //Dhruv G
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public void gameIsOver() //Revanth S, Dhruv G
    {
        if (deck.player1Cards.size() == 0 && deck.OneStockOne.size() == 0 && deck.OneStockTwo.size() == 0 &&
        deck.OneStockThree.size() == 0 && deck.OneStockFour.size() == 0 && deck.OneStockFive.size() == 0)
        {
            //System.out.println("Game is Over.");
            infoBoxes("Player 1 is the winner!", "Winner");
            System.exit(0);
        }
        else if (deck.player2Cards.size() == 0 && deck.TwoStockOne.size() == 0 && deck.TwoStockTwo.size() == 0 &&
        deck.TwoStockThree.size() == 0 && deck.TwoStockFour.size() == 0 && deck.TwoStockFive.size() == 0)
        {
            //System.out.println("Game is Over.");
            infoBoxes("Player 2 is the winner!", "Winner");
            System.exit(0);
        }
        
    }
}