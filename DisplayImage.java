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
public class DisplayImage
{
    
    public static void main(String[] args) throws IOException
    {
        DisplayImage abc = new DisplayImage();
    }

    public DisplayImage() throws IOException
    {
        BufferedImage img = ImageIO.read(new File("cards.png"));
        BufferedImage aceClubs = img.getSubimage(0, 0, 72, 96);
        BufferedImage Clubs2 = img.getSubimage(72, 0, 72, 96);
        BufferedImage aceHearts = img.getSubimage(0 ,192, 72, 96);
        ImageIcon icon = new ImageIcon(aceClubs);
        ImageIcon icon2 = new ImageIcon(Clubs2);
        ImageIcon icon3 = new ImageIcon(aceHearts);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(750, 750);
        frame.getContentPane().setBackground(Color.GREEN);
        
        JLabel lbl = new JLabel();
        JLabel lbl2 = new JLabel();
        JLabel lbl3 = new JLabel();
        
        lbl.setLocation(320, 130);
        lbl2.setLocation(500, 130);
        lbl3.setLocation(680, 130);
        
        lbl3.setIcon(icon3);
        lbl2.setIcon(icon2);
        lbl.setIcon(icon);
        
        frame.add(lbl);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}