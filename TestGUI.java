
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

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class TestGUI extends JPanel
{
    private static  JButton start = new JButton("Start"); 
    private  static JFrame frame= new JFrame("Start Menu");
    private  static JButton instructions = new JButton("Instructions");  
    private static JPanel panel = new JPanel();
    private static JLabel spit = new JLabel("SPIT");

    public  static void Start()
    {

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
class MyPanel extends JPanel {
    //does not work
    
    
    public void paint() throws IOException{
        BufferedImage img = ImageIO.read(new File("cards.png"));
        
        BufferedImage clubs1 = img.getSubimage(0, 0, 73, 99);
        JLabel lbl = new JLabel();
        lbl.setLocation(320, 10);
        ImageIcon icon = new ImageIcon(clubs1);
        lbl.setIcon(icon);
        /*
        g.drawRect(320,10,73,99); //Player 1 Pile
        g.drawRect(80,130,73,99); //Player 1 stockpile 1
        g.drawRect(200,130,73,99); //player 1 stockpile 2
        g.drawRect(320,130,73,99); //player 1 stockpile 3
        g.drawRect(440,130,73,99); //player 1 stockpile 4
        g.drawRect(560,130,73,99); // Player 1 stockpile 5
        g.drawRect(200,270,73,99); //Left spit pile
        g.drawRect(440,270,73,99); //Right spit pile
        g.drawRect(320,590,73,99); //Player 2 pile
        g.drawRect(80,450,73,99); //Player 2 stockpile 1
        g.drawRect(200,450,73,99); //Player 2 stockpile 2
        g.drawRect(320,450,73,99);//Player 2 stockpile 3
        g.drawRect(440,450,73,99);//Player 2 stockpile 4
        g.drawRect(560,450,73,99);//Player 2 stockpile 5
         */
    }
}
