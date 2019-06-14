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
public class GUI2 extends Deck
{
    private static JFrame gameFrame = new JFrame();
    private static JPanel gamePanel = new JPanel(new FlowLayout());
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
    public   static ArrayList<Card> InitialDeck = new ArrayList<Card>();
    public static ArrayList<Card> player1Cards = new ArrayList<Card>();
    public static ArrayList<Card> OneStockOne = new ArrayList<Card>();
    public static ArrayList<Card> OneStockTwo = new ArrayList<Card>();
    public static ArrayList<Card> OneStockThree = new ArrayList<Card>();
    public static ArrayList<Card> OneStockFour = new ArrayList<Card>();
    public static ArrayList<Card> OneStockFive = new ArrayList<Card>();
    public static ArrayList<Card> LeftSpit = new ArrayList<Card>();
    public static ArrayList<Card> RightSpit = new ArrayList<Card>();
    public static ArrayList<Card> player2Cards = new ArrayList<Card>();
    public static ArrayList<Card> TwoStockOne = new ArrayList<Card>();
    public static ArrayList<Card> TwoStockTwo = new ArrayList<Card>();
    public static ArrayList<Card> TwoStockThree = new ArrayList<Card>();
    public static ArrayList<Card> TwoStockFour = new ArrayList<Card>();
    public static ArrayList<Card> TwoStockFive = new ArrayList<Card>();

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
        spitSize = spit.getPreferredSize();
        startSize = start.getPreferredSize();
        instructSize = instructions.getPreferredSize();

        spit.setBounds(110, 0, spitSize.width, spitSize.height);
        start.setBounds(50, 50, startSize.width, startSize.height);
        instructions.setBounds(150, 50, instructSize.width, instructSize.height);

        gameFrame.getContentPane().add(spit);
        gameFrame.getContentPane().add(start);
        gameFrame.getContentPane().add(instructions);

        start.addActionListener(new Action());
        instructions.addActionListener(new Action());
        frame.addKeyListener(new KeyInput());
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

        /*gamePanel.add(player1);
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
         */
        gameFrame.getContentPane().add(player1);
        gameFrame.getContentPane().add(oneStockOne);
        gameFrame.getContentPane().add(oneStockTwo);
        gameFrame.getContentPane().add(oneStockThree);
        gameFrame.getContentPane().add(oneStockFour);
        gameFrame.getContentPane().add(oneStockFive);
        gameFrame.getContentPane().add(player2);
        gameFrame.getContentPane().add(twoStockOne);
        gameFrame.getContentPane().add(twoStockTwo);
        gameFrame.getContentPane().add(twoStockThree);
        gameFrame.getContentPane().add(twoStockFour);
        gameFrame.getContentPane().add(twoStockFive);
        gameFrame.getContentPane().add(leftSpit);
        gameFrame.getContentPane().add(rightSpit);
        //spit.setVisible(true);
        gameFrame.setVisible(true);
    }

    static class Action extends JFrame implements ActionListener, KeyListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == instructions)
            {
                JFrame helpFrame = new JFrame(); //Create frame and panel
                JPanel help = new JPanel(new FlowLayout());
                helpFrame.add(help); //Add panel to window
                helpFrame.setSize(720, 720);

                JLabel lbl = new JLabel("<html>To play this game: <br/> Each Player starts with an evenly spit deck of cards." + 
                        "<br/>The cards are dealt into 5 stock piles, the first with 1 card, the second with 2, and so on. " +
                        "<br/>The moves you can make are one rank higher or lower (suit doesn't matter) on either spit pile. " + 
                        "<br/>For Player 1 to make a move, they can use numbers 1-5 on the keyboard to select a stock pile to play from " +
                        "<br/>and A or D to play on the left or right spit pile, respectively. " +
                        "<br/>For Player 2, they use numbers 1-5 on the number pad, and the 0 and Delete buttons to play on each spit pile." +
                        "<br/>There are no turns; if you see a move, make it as quick as possible! <br/>The other " +
                        "player can make a move on either pile as well. <br/>When neither player has a valid move, they must each flip a " +
                        "<br/>card onto a spit pile at the same time, <br/>and keep doing so until someone has a valid move." +
                        "<br/>When one player's stock piles are completely finished, both " +
                        "<br/>players have to slap the table. <br/>Player 1 does this by pressing the left shift button, <br/>and Player 2 " + 
                        "does this by pressing the Enter key. " + "<br/>Whoever slaps first gets the spit pile with less cards." + 
                        "<br/>They then must add this number of cards <br/> to their original draw pile, reshuffle, and deal again. " +
                        "This is considered a round. <br/>The game keeps going until one player <br/>has gotten rid of all of their cards.</html>");
                lbl.setFont(new Font("Courier New",Font.BOLD,15));
                Dimension lblSize = lbl.getPreferredSize();
                lbl.setBounds(0, 0, lblSize.width, lblSize.height);

                help.add(lbl); //Add label to panel
                help.setBackground(Color.CYAN);
                help.setVisible(true); //Display
                helpFrame.setVisible(true);
            }
            else //Source == start
            {

                gameFrame.setSize(750, 750);
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
                addKeyListener(this);
                setFocusable(true);
                setFocusTraversalKeysEnabled(false);
            }
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

        public void keyPressedP2(KeyEvent e)
        {
            int code = e.getKeyCode();
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
            switch(code)
            {
                case KeyEvent.VK_NUMPAD1:
                p2selected = 1;
                case KeyEvent.VK_NUMPAD2:
                p2selected = 2;
                case KeyEvent.VK_NUMPAD3:
                p2selected = 3;
                case KeyEvent.VK_NUMPAD4:
                p2selected= 4;
                case KeyEvent.VK_NUMPAD5:
                p2selected = 5;
            }

            switch(code)
            {
                case KeyEvent.VK_NUMPAD0:
                p2pile = "0";
                case KeyEvent.VK_DELETE:
                p2pile = "delete";
                case KeyEvent.VK_ENTER:
                p2pile = "slap";
                case KeyEvent.VK_PLUS:
                p2pile = "draw";
            }

        }

        public void keyPressed(KeyEvent e)
        {
            int code = e.getKeyCode();
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
            switch(code)
            {
                case KeyEvent.VK_1:
                p1selected = 1;
                case KeyEvent.VK_2:
                p1selected = 2;
                case KeyEvent.VK_3:
                p1selected = 3;
                case KeyEvent.VK_4:
                p1selected= 4;
                case KeyEvent.VK_5:
                p1selected = 5;
            }

            switch(code)
            {
                case KeyEvent.VK_A:
                p1pile = "a";
                case KeyEvent.VK_D:
                p1pile = "d";
                case KeyEvent.VK_SHIFT:
                p1pile = "+";
                case KeyEvent.VK_Z:
                p1pile = "flip";
            }
            p1MakePlay();
        }

        public void keyReleased(KeyEvent e)
        {

        }

        public void keyTyped(KeyEvent e)
        {

        }

        public void p1MakePlay()
        {
            if (p1selected == 1)
            {
                if(p1pile == "a")
                    if (OneStockOne.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockOne.get(0).getRank() == LeftSpit.get(0).getRank()+1 )
                    {
                        LeftSpit.add( OneStockOne.remove(OneStockOne.size()-1));
                        // display image code
                    }
                    else if(p1pile == "d")
                        if (OneStockOne.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockOne.get(0).getRank() == LeftSpit.get(0).getRank()+1 )
                        {
                            RightSpit.add( OneStockOne.remove(OneStockOne.size()-1));
                            // display image code
                        }
            }

            if (p1selected == 2)
            {
                if(p1pile == "a")
                    if (OneStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                    {
                        LeftSpit.add(OneStockTwo.remove(OneStockTwo.size()-1));
                    }
                    else if(p1pile == "d")
                        if (OneStockTwo.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                        {
                            RightSpit.add(OneStockTwo.remove(OneStockTwo.size()-1));
                        }
            }

            if (p1selected == 3)
            {
                if(p1pile == "a")
                    if (OneStockThree.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockThree.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                    {
                        LeftSpit.add( OneStockThree.remove(OneStockThree.size()-1));

                    }
                    else if(p1pile == "d")
                        if (OneStockThree.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockThree.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                        {
                            RightSpit.add( OneStockThree.remove(OneStockThree.size()-1));

                        }
            }

            if (p1selected == 4)
            {
                if(p1pile == "a")
                    if (OneStockFour.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockFour.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                    {
                        LeftSpit.add(OneStockFour.remove(OneStockFour.size()-1));

                    }
                if(p1pile == "d")
                    if (OneStockFour.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockFour.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                    {
                        RightSpit.add(OneStockFour.remove(OneStockFour.size()-1));

                    }
            }

            if (p1selected == 5)
            {
                if(p1pile == "a")
                    if (OneStockFive.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockFive.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                    {
                        LeftSpit.add(OneStockFive.remove(OneStockFive.size()-1));
                    }
                    else if(p1pile == "d")
                        if (OneStockFive.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockFive.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                        {
                            RightSpit.add(OneStockFive.remove(OneStockFive.size()-1));
                        }
            }

            if (p1pile == "flip")
            {

                LeftSpit.add(player1Cards.remove(player1Cards.size()-1));

            }

            if (p1pile == "+" && OneStockOne.size() ==0 && OneStockTwo.size() ==0 && OneStockThree.size() == 0 && OneStockFour.size() == 0
            && OneStockFive.size() == 0)
            {

                if (LeftSpit.size() < RightSpit.size())
                {
                    for (int i = 0; i<= LeftSpit.size(); i++)
                    {
                        player1Cards.add(LeftSpit.get(i));

                    }
                    LeftSpit.clear();

                }

                else
                {
                    for (int k = 0; k<=RightSpit.size(); k++)
                    {

                        player1Cards.add(RightSpit.get(k));

                    }
                    RightSpit.clear();
                }

            }

            // code case to assign player smaller pile when slapped

        }

        public  void p2MakePlay()
        {
            if (p2selected == 1)
            {
                if(p2pile == "0")
                    if (TwoStockOne.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockOne.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                    {
                        LeftSpit.add(TwoStockOne.remove(TwoStockOne.size()-1));
                    }
                    else if(p2pile == "delete")
                        if (TwoStockOne.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockOne.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                        {
                            LeftSpit.add(TwoStockOne.remove(TwoStockOne.size()-1));
                        }
            }

            if (p2selected == 2)
            {
                if(p2pile == "0")
                    if (TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                    {
                        LeftSpit.add(TwoStockTwo.remove(TwoStockTwo.size()-1));
                    }
                    else if (p2pile == "delete")
                        if (TwoStockTwo.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                        {
                            RightSpit.add(TwoStockTwo.remove(TwoStockTwo.size()-1));
                        }
            }

            if (p2selected == 3)
            {
                if(p2pile == "0")
                    if(TwoStockThree.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                    {
                        LeftSpit.add(TwoStockThree.remove(TwoStockThree.size()-1));
                    }
                    else if(p2pile == "0")
                        if(TwoStockThree.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                        {
                            RightSpit.add(TwoStockThree.remove(TwoStockThree.size()-1));
                        }
            }

            if (p2selected == 4)
            {
                if(p2pile == "0")
                    if (TwoStockFour.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockFour.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                    {
                        LeftSpit.add( TwoStockFour.remove(TwoStockFour.size()-1));
                    }
                    else if(p2pile == "delete")
                        if (TwoStockFour.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockFour.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                        {
                            RightSpit.add( TwoStockFour.remove(TwoStockFour.size()-1));
                        }
            }

            if (p2selected == 5)
            {
                if(p2pile == "0")
                    if (TwoStockFive.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockFive.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                    {
                        LeftSpit.add(TwoStockFive.remove(TwoStockFive.size()-1));
                    }
                    else if(p2pile == "delete")
                        if (TwoStockFive.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockFive.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                        {
                            RightSpit.add(TwoStockFive.remove(TwoStockFive.size()-1));
                        }
            }

            if (p2pile == "slap" && TwoStockOne.size()==0 && TwoStockTwo.size() == 0 && TwoStockThree.size() == 0 && TwoStockFour.size() == 0
            && TwoStockFive.size()== 0)
            {
                if (LeftSpit.size() < RightSpit.size())
                {
                    for (int i = 0; i<= LeftSpit.size(); i++)
                    {
                        player2Cards.add(LeftSpit.get(i));

                    }
                    LeftSpit.clear();
                }
                else
                {
                    for (int k = 0; k<=RightSpit.size(); k++)
                    {
                        player2Cards.add(RightSpit.get(k));
                    }
                    RightSpit.clear();
                }
            }

            // code case to assign player smaller pile when slapped

        }

        public boolean gameIsOver()
        {
            if (player1Cards.size() == 0 || player2Cards.size() == 0)
            {
                return true;
            }
            return false;
        }

        public boolean roundisOver()
        {
            if (LeftSpit.size() == 0 || RightSpit.size() == 0)
                return true;
            return false;
        }

    }

}