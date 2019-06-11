import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
public class DisplayImage extends JPanel
{
    
    public static void main(String[] args) throws IOException
    {
        DisplayImage abc = new DisplayImage();
    }

    public DisplayImage() throws IOException
    {
        BufferedImage img = ImageIO.read(new File("cards.png"));
        BufferedImage aceClubs = img.getSubimage(0, 0, 73, 99);
        BufferedImage Clubs2 = img.getSubimage(74, 0, 73, 99);
        ImageIcon icon = new ImageIcon(Clubs2);
        
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(750, 750);
        frame.getContentPane().setBackground(Color.GREEN);
        
        JLabel lbl = new JLabel();
        lbl.setLocation(320, 130);
        lbl.setIcon(icon);
        
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}