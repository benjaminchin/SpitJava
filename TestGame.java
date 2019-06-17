
//test class
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.IOException;
public class TestGame
{
    public static void main(String[] args) throws IOException
    {
        JFrame frame = new JFrame();
        
        TestGamePanel panel = new TestGamePanel();
        panel.setLayout(null);
        panel.addKeyListener(new TestGameKeyListener(panel));
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(750, 750);
        frame.setVisible(true);
    }
}