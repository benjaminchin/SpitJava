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

public class GUI2 extends Deck
{
    private static FlowLayout layout = new FlowLayout();
    private static JFrame frame = new JFrame();
    private static ImageIcon icon = null;
    private static JButton start = new JButton("Start");
    public static void start()
    {
        frame.setLayout(layout);
        frame.setSize(750, 750);

        frame.getContentPane().setBackground(Color.ORANGE);

    }
}