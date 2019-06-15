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
    }

    public void repaintCards()
    {
        //BufferedImage swapPlayer1 = img.getSubimage(deck.player1Cards.get(0).getX(), deck.player1Cards.get(0).getY(), 72, 96);
        //BufferedImage swapOneStockOne = img.getSubimage(deck.OneStockOne.get(0).getX(), deck.OneStockOne.get(0).getY(), 72, 96);
        //BufferedImage swapOneStockTwo = img.getSubimage(deck.OneStockTwo.get(0).getX(), deck.OneStockTwo.get(0).getY(), 72, 96);
        //BufferedImage swapOneStockThree = img.getSubimage(deck.OneStockThree.get(0).getX(), deck.OneStockThree.get(0).getY(), 72, 96);
        //BufferedImage swapOneStockFour = img.getSubimage(deck.OneStockFour.get(0).getX(), deck.OneStockFour.get(0).getY(), 72, 96);
        //BufferedImage swapOneStockFive = img.getSubimage(deck.OneStockFive.get(0).getX(), deck.OneStockFive.get(0).getY(), 72, 96);

        //BufferedImage swapPlayer2 = img.getSubimage(deck.player2Cards.get(0).getX(), deck.player2Cards.get(0).getY(), 72, 96);
        //BufferedImage swapTwoStockOne = img.getSubimage(deck.TwoStockOne.get(0).getX(), deck.TwoStockOne.get(0).getY(), 72, 96);
        //BufferedImage swapTwoStockTwo = img.getSubimage(deck.TwoStockTwo.get(0).getX(), deck.TwoStockTwo.get(0).getY(), 72, 96);
        //BufferedImage swapTwoStockThree = img.getSubimage(deck.TwoStockThree.get(0).getX(), deck.TwoStockThree.get(0).getY(), 72, 96);
        //BufferedImage swapTwoStockFour = img.getSubimage(deck.TwoStockFour.get(0).getX(), deck.TwoStockFour.get(0).getY(), 72, 96);
        //BufferedImage swapTwoStockFive = img.getSubimage(deck.TwoStockFive.get(0).getX(), deck.TwoStockFive.get(0).getY(), 72, 96);

        //BufferedImage swapLeftSpit = img.getSubimage(deck.LeftSpit.get(0).getX(), deck.LeftSpit.get(0).getY(), 72, 96);
        //BufferedImage swapRightSpit = img.getSubimage(deck.RightSpit.get(0).getX(), deck.RightSpit.get(0).getY(), 72, 96);

        //if(deck.player1Cards.size() > 0)
        //player1.setIcon(new ImageIcon(swapPlayer1));
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
    public void p1OneToLeft()
    {
        
        if(deck.OneStockOne.size() > 0 && (deck.OneStockOne.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.OneStockOne.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {    
            deck.LeftSpit.add(0, deck.OneStockOne.get(0));
            deck.OneStockOne.remove(0);
            repaintCards();
        }
        drawCard();//If no cards can be placed, auto-draw
        roundIsOver();//Checks for round over, restarts round if so
    }

    public void p1OneToRight()
    {
        
        if(deck.OneStockOne.size() > 0 && (deck.OneStockOne.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.OneStockOne.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.OneStockOne.get(0));
            deck.OneStockOne.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p1TwoToLeft()
    {
        
        if(deck.OneStockTwo.size() > 0 && (deck.OneStockTwo.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.OneStockTwo.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {    
            deck.LeftSpit.add(0, deck.OneStockTwo.get(0));
            deck.OneStockTwo.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p1TwoToRight()
    {
        
        if(deck.OneStockTwo.size() > 0 && (deck.OneStockTwo.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.OneStockTwo.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.OneStockTwo.get(0));
            deck.OneStockTwo.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p1ThreeToLeft()
    {
        
        if(deck.OneStockThree.size() > 0 && (deck.OneStockThree.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.OneStockThree.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.OneStockThree.get(0));
            deck.OneStockThree.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p1ThreeToRight()
    {
        
        if(deck.OneStockThree.size() > 0 && (deck.OneStockThree.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.OneStockThree.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.OneStockThree.get(0));
            deck.OneStockThree.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p1FourToLeft()
    {
        
        if(deck.OneStockFour.size() > 0 && (deck.OneStockFour.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.OneStockFour.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.OneStockFour.get(0));
            deck.OneStockFour.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p1FourToRight()
    {
        
        if(deck.OneStockFour.size() > 0 && (deck.OneStockFour.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.OneStockFour.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.OneStockFour.get(0));
            deck.OneStockFour.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p1FiveToLeft()
    {
        
        if(deck.OneStockFive.size() > 0 && (deck.OneStockFive.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.OneStockFive.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.OneStockFive.get(0));
            deck.OneStockFive.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p1FiveToRight()
    {
        
        if(deck.OneStockFive.size() > 0 && (deck.OneStockFive.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.OneStockFive.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.OneStockFive.get(0));
            deck.OneStockFive.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    //Player 2 moves
    public void p2OneToLeft()
    {
        
        if(deck.TwoStockOne.size() > 0 && (deck.TwoStockOne.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.TwoStockOne.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.TwoStockOne.get(0));
            deck.TwoStockOne.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p2OneToRight()
    {
        
        if(deck.TwoStockOne.size() > 0 && (deck.TwoStockOne.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.TwoStockOne.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.TwoStockOne.get(0));
            deck.TwoStockOne.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p2TwoToLeft()
    {
        
        if(deck.TwoStockTwo.size() > 0 && (deck.TwoStockTwo.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.TwoStockTwo.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.TwoStockTwo.get(0));
            deck.TwoStockTwo.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p2TwoToRight()
    {
        
        if(deck.TwoStockTwo.size() > 0 && (deck.TwoStockTwo.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.TwoStockTwo.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.TwoStockTwo.get(0));
            deck.TwoStockTwo.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p2ThreeToLeft()
    {
        
        if(deck.TwoStockThree.size() > 0 && (deck.TwoStockThree.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.TwoStockThree.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.TwoStockThree.get(0));
            deck.TwoStockThree.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p2ThreeToRight()
    {
        
        if(deck.TwoStockThree.size() > 0 && (deck.TwoStockThree.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.TwoStockThree.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.TwoStockThree.get(0));
            deck.TwoStockThree.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p2FourToLeft()
    {
        
        if(deck.TwoStockFour.size() > 0 && (deck.TwoStockFour.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.TwoStockFour.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.TwoStockFour.get(0));
            deck.TwoStockFour.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p2FourToRight()
    {
        
        if(deck.TwoStockFour.size() > 0 && (deck.TwoStockFour.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.TwoStockFour.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.TwoStockFour.get(0));
            deck.TwoStockFour.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p2FiveToLeft()
    {
        
        if(deck.TwoStockFive.size() > 0 && (deck.TwoStockFive.get(0).getRank()-1 == deck.LeftSpit.get(0).getRank() ||
            deck.TwoStockFive.get(0).getRank()+1 == deck.LeftSpit.get(0).getRank()))
        {
            deck.LeftSpit.add(0, deck.TwoStockFive.get(0));
            deck.TwoStockFive.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public void p2FiveToRight()
    {
        
        if(deck.TwoStockFive.size() > 0 &&(deck.TwoStockFive.get(0).getRank()-1 == deck.RightSpit.get(0).getRank() ||
            deck.TwoStockFive.get(0).getRank()+1 == deck.RightSpit.get(0).getRank()))
        {
            deck.RightSpit.add(0, deck.TwoStockFive.get(0));
            deck.TwoStockFive.remove(0);
            repaintCards();
        }
        drawCard();
        roundIsOver();
    }

    public boolean canPlay() //index out of bounds when using the last card. Cannot check if card 0 is +- 1 because it doesn't exist. Need to check for size for each case.
    {
        if((deck.OneStockOne.size()!=0) && deck.OneStockOne.get(0).getRank() != deck.LeftSpit.get(0).getRank() - 1 && deck.OneStockOne.get(0).getRank() != deck.LeftSpit.get(0).getRank() + 1 && deck.OneStockOne.get(0).getRank() != deck.RightSpit.get(0).getRank() - 1 && 
        deck.OneStockOne.get(0).getRank() != deck.RightSpit.get(0).getRank() + 1 && (deck.OneStockTwo.size()!=0) && deck.OneStockTwo.get(0).getRank() != 
        deck.LeftSpit.get(0).getRank() - 1 && deck.OneStockTwo.get(0).getRank() != deck.LeftSpit.get(0).getRank() + 1 && 
        deck.OneStockTwo.get(0).getRank() != deck.RightSpit.get(0).getRank() - 1 && deck.OneStockTwo.get(0).getRank() != 
        deck.RightSpit.get(0).getRank() + 1 && (deck.OneStockThree.size()!=0) && deck.OneStockThree.get(0).getRank() != deck.LeftSpit.get(0).getRank() - 1 && deck.OneStockThree.get(0).getRank() != deck.LeftSpit.get(0).getRank() + 1 && 
        deck.OneStockThree.get(0).getRank() != deck.RightSpit.get(0).getRank() - 1 && deck.OneStockThree.get(0).getRank() != deck.RightSpit.get(0).getRank() + 1 && (deck.OneStockFour.size()!=0) && deck.OneStockFour.get(0).getRank() != deck.LeftSpit.get(0).getRank() - 1 && 
        deck.OneStockFour.get(0).getRank() != deck.RightSpit.get(0).getRank() + 1 && (deck.OneStockFive.size()!=0) && deck.OneStockFive.get(0).getRank() != deck.LeftSpit.get(0).getRank() - 1 && deck.OneStockFive.get(0).getRank() != deck.LeftSpit.get(0).getRank() + 1 &&
        deck.OneStockFive.get(0).getRank() != deck.RightSpit.get(0).getRank() - 1 && deck.OneStockFive.get(0).getRank() != deck.RightSpit.get(0).getRank() + 1 && 
        (deck.TwoStockOne.size()!=0) && deck.TwoStockOne.get(0).getRank() != deck.RightSpit.get(0).getRank() - 1 && deck.TwoStockOne.get(0).getRank() != deck.RightSpit.get(0).getRank() + 1 &&
        deck.TwoStockOne.get(0).getRank() != deck.LeftSpit.get(0).getRank() - 1 && deck.TwoStockOne.get(0).getRank() != deck.LeftSpit.get(0).getRank() + 1 &&
        (deck.TwoStockTwo.size()!=0)&& deck.TwoStockTwo.get(0).getRank() != deck.RightSpit.get(0).getRank() - 1 && deck.TwoStockTwo.get(0).getRank() != deck.RightSpit.get(0).getRank() + 1 &&
        (deck.TwoStockThree.size()!=0)&& deck.TwoStockTwo.get(0).getRank() != deck.LeftSpit.get(0).getRank() - 1 && deck.TwoStockTwo.get(0).getRank() != deck.LeftSpit.get(0).getRank() + 1 &&
        deck.TwoStockThree.get(0).getRank() != deck.RightSpit.get(0).getRank() - 1 && deck.TwoStockThree.get(0).getRank() != deck.RightSpit.get(0).getRank() + 1 &&
        deck.TwoStockThree.get(0).getRank() != deck.LeftSpit.get(0).getRank() - 1 && deck.TwoStockThree.get(0).getRank() != deck.LeftSpit.get(0).getRank() + 1 &&
        (deck.TwoStockFour.size()!=0) && deck.TwoStockFour.get(0).getRank() != deck.RightSpit.get(0).getRank() - 1 &&  deck.TwoStockFour.get(0).getRank() != deck.RightSpit.get(0).getRank() + 1 &&
        deck.TwoStockFour.get(0).getRank() != deck.LeftSpit.get(0).getRank() - 1 && deck.TwoStockFour.get(0).getRank() != deck.RightSpit.get(0).getRank() - 1 &&
        (deck.TwoStockFive.size()!=0) && deck.TwoStockFive.get(0).getRank() != deck.RightSpit.get(0).getRank() - 1 && deck.TwoStockFive.get(0).getRank() != deck.RightSpit.get(0).getRank() + 1 &&
        deck.TwoStockFive.get(0).getRank() != deck.LeftSpit.get(0).getRank() - 1 && deck.TwoStockFive.get(0).getRank() != deck.LeftSpit.get(0).getRank() + 1)
            return false;
        return true;
    }

    public void drawCard()
    {
        if (!canPlay())
        {
            while(!canPlay())
            {
                deck.LeftSpit.add(0, deck.player1Cards.remove(0));
                deck.RightSpit.add(0, deck.player2Cards.remove(0));
            }
            /*deck.LeftSpit.add(0, deck.player1Cards.remove(0));
            deck.RightSpit.add(0, deck.player2Cards.remove(0));
            repaintCards();
            */
        }

    }
    public void roundIsOver()
    {
        if ((deck.OneStockOne.size() == 0 && deck.OneStockTwo.size() == 0 && deck.OneStockThree.size() == 0 && 
             deck.OneStockFour.size() == 0 && deck.OneStockFive.size() == 0))
        {
            if(deck.LeftSpit.size() > deck.RightSpit.size())
            {
                for(Card c : deck.RightSpit)
                    deck.player1Cards.add(c);
            }
            else
            {
                for(Card  c : deck.LeftSpit)
                    deck.player1Cards.add(c);
            }
            deck.deal();
            repaintCards();
            System.out.println("Round is Over");
            System.out.println("New Round");
        }
        else if(deck.TwoStockOne.size() == 0 && deck.TwoStockTwo.size() == 0 && deck.TwoStockThree.size() == 0 && deck.TwoStockFour.size() == 0 && 
                deck.TwoStockFive.size() == 0)
        {
            if(deck.LeftSpit.size() > deck.RightSpit.size())
            {
                for(Card c : deck.RightSpit)
                    deck.player2Cards.add(c);
            }
            else
            {
                for(Card  c : deck.LeftSpit)
                    deck.player2Cards.add(c);
            }
            deck.deal();
            repaintCards();
            System.out.println("Round is Over");
            System.out.println("New Round");
        }
    }
    
    public boolean gameIsOver()
    {
        if (deck.player1Cards.size() == 0 || deck.player2Cards.size() == 0)
        {
            System.out.println("Game is Over.");
            return true;
        }
        return false;
    }
}