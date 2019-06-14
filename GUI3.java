//Broken dont use

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

public class GUI3 implements ActionListener, KeyListener
{
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JButton start = new JButton("Start");
    private JButton instructions = new JButton("Instructions");
    private JLabel spit = new JLabel("Spit");
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == instructions)
        {
            JFrame helpFrame = new JFrame();
            JPanel helpPanel = new JPanel();
            JLabel helpLabel = new JLabel("To play this game:");
            helpFrame.getContentPane().setBackground(Color.CYAN);
            helpFrame.add(helpPanel);
            helpFrame.add(helpLabel);
            
            helpFrame.setVisible(true);
        }
        else
        {
        
        }
    }
    
    public void keyPressed(KeyEvent e)
    {
        
    }
    
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    
    public GUI3()
    {
        frame.setLayout(null);
        frame.add(panel);
        frame.getContentPane().setSize(750, 750);
        frame.getContentPane().setBackground(Color.ORANGE);
        
        Dimension startSize = start.getPreferredSize();
        Dimension instructSize = instructions.getPreferredSize();
        Dimension spitSize = spit.getPreferredSize();
        
        start.setBounds(50, 50, startSize.width, startSize.height);
        instructions.setBounds(150, 50, instructSize.width, instructSize.height);
        spit.setBounds(110, 0, spitSize.width, spitSize.height);
        
        instructions.addActionListener(this);
        
        frame.add(start);
        frame.add(instructions);
        frame.add(spit);
        
        frame.setVisible(true);
    }
}