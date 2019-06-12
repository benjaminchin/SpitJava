import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class GUI extends JFrame
{
    private static JLabel spit = new JLabel("Spit");
    private static JButton start = new JButton("Start");
    private static JButton instructions = new JButton("Instructions");
    private static JFrame frame = new JFrame();
    public static void start()
    {
        JPanel startMenu = new JPanel(new FlowLayout());
        frame.setDefaultLookAndFeelDecorated(true);
        
        frame.add(startMenu);//Add startMenu window to the frame
        frame.setSize(400, 100);
        spit.setLocation(200, 50); //Set locations of label and buttons
        start.setLocation(50, 150);
        instructions.setLocation(550, 150);
        spit.setFont(new Font("Courier New",Font.BOLD,30));
        startMenu.add(spit); //Add label and buttons to panel
        startMenu.add(start);
        start.addActionListener(new Action());
        startMenu.add(instructions);
        instructions.addActionListener(new Action());
        startMenu.setBackground(Color.ORANGE);
        startMenu.setVisible(true); //Make visible
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        start();
    }
    static class Action extends JFrame implements ActionListener
    {  
        public void actionPerformed (ActionEvent e)
        {
            if (e.getSource() == instructions) //If "instructions" button is pressed, display how to play game.
            {
               JFrame helpFrame = new JFrame(); //Create frame and panel
               JPanel help = new JPanel(new FlowLayout());
               helpFrame.add(help); //Add panel to window
               helpFrame.setSize(750, 750);
               
               JLabel lbl = new JLabel("To play this game..."); //Label text
               lbl.setFont(new Font("Courier New",Font.BOLD,30));
               lbl.setLocation(325, 325);
               
               help.add(lbl); //Add label to panel
               help.setBackground(Color.CYAN);
               help.setVisible(true); //Display
               helpFrame.setVisible(true);
            }
            else //If start button is pressed, display table and start playing game.
            {
                JFrame playGame = new JFrame();
                JPanel game = new JPanel(new FlowLayout());
                playGame.add(game);
                playGame.setSize(750, 750);
                
                game.setBackground(Color.GREEN);
                game.setVisible(true);
                playGame.setVisible(true);
            }
        }
    }
}