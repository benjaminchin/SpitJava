import java.awt.*;
import java.awt.event.*;
public class TestKeys implements KeyListener
{
    private String input;
    public void keyPressed(KeyEvent e)
    {
        int c = e.getKeyCode();
        switch(c)
        {
            case KeyEvent.VK_1:
                input = "1";
            case KeyEvent.VK_2:
                input = "2";
            case KeyEvent.VK_3:
                input = "3";
            case KeyEvent.VK_4:
                input = "4";
            case KeyEvent.VK_5:
                input = "5";
            case KeyEvent.VK_A:
                input = "a";
            case KeyEvent.VK_D:
                input = "d";
        }
    }
    public void keyReleased(KeyEvent e)
    {
    }
    public void keyTyped(KeyEvent e)
    {
    }
    public String input()
    {
        return input;
    }
}