
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

public class GUI extends JPanel
{
    private static  JButton start = new JButton("Start"); 
    private  static JFrame frame= new JFrame("Spit");
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
                JFrame frame = new JFrame("JFrame Color Example");
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
    public void paint(Graphics g) {

        g.drawRect(340,10,73,99);
        g.drawRect(20,80,73,99);
    }
}
