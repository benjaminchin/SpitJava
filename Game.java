import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.IOException;
public class Game
{
    public static void main(String[] args) throws IOException
    {
        JFrame frame = new JFrame();
        
        GamePanel panel = new GamePanel();
        panel.setLayout(null);
        panel.addKeyListener(new KeyInput(panel));
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(750, 750);
        frame.setVisible(true);
    }
}