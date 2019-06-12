
/**
 * Start GUi for Spit Game
 *
 * @author Revanth Sudhireddy
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class GUI extends Deck
{
    private static  JButton start = new JButton("Start"); 
    private  static JFrame frame= new JFrame("Start Menu");
    private  static JButton instructions = new JButton("Instructions");  
    private static JPanel panel = new JPanel();
    private static JLabel spit = new JLabel("SPIT");
    public static JLabel player1 = new JLabel();
    public static JLabel OneStockOne = new JLabel();
    public static JLabel OneStockTwo = new JLabel();
    public static JLabel OneStockThree = new JLabel();
    public static JLabel OneStockFour = new JLabel();
    public static JLabel OneStockFive = new JLabel();
    public static JLabel LeftSpit= new JLabel();
    public static JLabel player2 = new JLabel();
    public static JLabel TwoStockOne = new JLabel();
    public static JLabel TwoStockTwo = new JLabel();
    public static JLabel TwoStockThree = new JLabel();
    public static JLabel TwoStockFour= new JLabel();
    public static JLabel TwoStockFive= new JLabel();
    public static JLabel RightSpit = new JLabel();

    public  static void Start()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        spit.setFont(new Font("Courier New",Font.BOLD,30));
        frame.add(panel);
        panel.add(start); 
        panel.add(instructions);
        panel.add(spit);
        frame.setVisible(true);
        panel.setLayout(null);
        start.setLayout(null);
        instructions.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(400,300);
        start.setPreferredSize(new Dimension(80,35));
        instructions.setPreferredSize(new Dimension(105,35));
        panel.setBackground(Color.ORANGE);
        start.addActionListener(new Action());
        instructions.addActionListener(new Action());
        start.setLocation(50,150);
        instructions.setLocation(150,150);
        spit.setLocation(110,90);

    }  
    static class Action extends JFrame implements ActionListener
    {  
        public void actionPerformed (ActionEvent e)
        {
            if (e.getSource() == instructions) // if "instructions" button is pressed, display how to play game.
            {
                JFrame help = new JFrame("Instructions");
                help.setVisible(true);
                help.setSize(400,400);
                JPanel panel1 = new JPanel();
                panel1.setBackground(Color.CYAN);
                help.add(panel1);
                JLabel text = new JLabel("");
                panel1.add(text);

            }
            else // if start button is pressed, display table and start playing game.
            {
                MyPanel panel = new MyPanel();
                // create a basic JFrame
                JFrame.setDefaultLookAndFeelDecorated(true);
                JFrame frame = new JFrame("Spit");
                frame.setSize(750,750);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setBackground(Color.GREEN);
                // add panel to main frame
                frame.add(panel);

                frame.setVisible(true);

            }
        }
    }

    public static void main(String args[])
    {
        Start();

    }
}
