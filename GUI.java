
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
import java.awt.event.*;
public class GUI extends JFrame 
{
    private static  JButton start = new JButton("Start"); 
    private  static JFrame frame= new JFrame("Spit");
    private  static JButton instructions = new JButton("Instructions");  
    private static JPanel panel = new JPanel();
    private static JLabel spit = new JLabel("SPIT");
    public  static void Start()
    {

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(400,300);
        start.setPreferredSize(new Dimension(80,35));
        instructions.setPreferredSize(new Dimension(105,35));
        panel.setBackground(Color.ORANGE);
        spit.setFont(new Font("Courier New",Font.BOLD,30));
        panel.add(start); 
        panel.add(instructions);
        panel.add(spit);
        frame.add(panel);
        start.addActionListener(new Action());
        instructions.addActionListener(new Action());
        panel.setLayout(null);
        start.setLayout(null);
        instructions.setLayout(null);
        start.setLocation(50,150);
        instructions.setLocation(150,150);
        spit.setLocation(110,90);

    }  
    static class Action implements ActionListener
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

                JFrame tableFrame = new JFrame("Spit");
                tableFrame.setVisible(true); tableFrame.setSize(700,700);
                JPanel table = new JPanel();
                table.setSize(730,730);
                table.setBackground(Color.GREEN);
                tableFrame.add(table);

            }
        }
    }

    public static void main(String args[])
    {
        Start();

    }
}
