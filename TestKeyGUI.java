import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
public class TestKeyGUI extends JFrame
{
    private TestKeys input1 = new TestKeys();
    
    public void start() throws IOException
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(750, 750);
        JPanel panel = new JPanel();
        panel.setSize(750, 750);
        frame.getContentPane().setBackground(Color.GREEN);
        
        frame.add(panel);
        JLabel lbl = new JLabel();
        lbl.setIcon(new ImageIcon(
        
        
        if(input1.input() == "1")
        {
            lbl.setLocation(0, 200);
        }
        repaint();
    }
    
}