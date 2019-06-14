import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class KeyInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KeyInput implements KeyListener
{
    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        
        if(code == KeyEvent.VK_NUMPAD1 || code == KeyEvent.VK_1)
        {}
        else if(code == KeyEvent.VK_NUMPAD2 || code == KeyEvent.VK_2)
        {}
        else if(code == KeyEvent.VK_NUMPAD3 || code == KeyEvent.VK_3)
        {}
        else if(code == KeyEvent.VK_NUMPAD4 || code == KeyEvent.VK_4)
        {}
        else if(code == KeyEvent.VK_NUMPAD5 || code == KeyEvent.VK_5)
        {}
        
        if(code == KeyEvent.VK_NUMPAD0 || code == KeyEvent.VK_A)
        {}
        else if(code == KeyEvent.VK_DELETE || code == KeyEvent.VK_D)
        {}
    }
    
    public void keyReleased(KeyEvent e)
    {}
    
    public void keyTyped(KeyEvent e)
    {}
}
