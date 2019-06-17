
//test class
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class TestGameKeyListener implements KeyListener
{
    private TestGamePanel panel;
    public TestGameKeyListener(TestGamePanel panel)
    {
        this.panel = panel;
    }
    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_1)
        {
            System.out.println("Key Pressed: 1");
            panel.makeMove();
            panel.repaintCards();
        }
    }
    
    public void keyTyped(KeyEvent e)
    {
    }
    
    public void keyReleased(KeyEvent e)
    {
    }
}