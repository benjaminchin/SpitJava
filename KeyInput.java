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
    private GamePanel panel;
    public KeyInput(GamePanel panel)
    {
        this.panel = panel;
    }
    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        int p1Selected = 0;
        int p2Selected = 0;
        if(code == KeyEvent.VK_NUMPAD1)
        {
            p2Selected = 1;
        }
        else if(code == KeyEvent.VK_NUMPAD2)
        {
            p2Selected = 2;
        }
        else if(code == KeyEvent.VK_NUMPAD3)
        {
            p2Selected = 3;
        }
        else if(code == KeyEvent.VK_NUMPAD4)
        {
            p2Selected = 4;
        }
        else if(code == KeyEvent.VK_NUMPAD5)
        {
            p2Selected = 5;
        }
        else if(code == KeyEvent.VK_1)
        {
            p1Selected = 1;
        }
        else if(code == KeyEvent.VK_2)
        {
            p1Selected = 2;
        }
        else if(code == KeyEvent.VK_3)
        {
            p1Selected = 3;
        }
        else if(code == KeyEvent.VK_4)
        {
            p1Selected = 4;
        }
        else if(code == KeyEvent.VK_5)
        {
            p1Selected = 5;
        }
        
        if(code == KeyEvent.VK_NUMPAD0)
        {
            if(p2Selected == 1)
                panel.p2OneToLeft();
            else if(p2Selected == 2)
                panel.p2TwoToLeft();
            else if(p2Selected == 3)
                panel.p2ThreeToLeft();
            else if(p2Selected == 4)
                panel.p2FourToLeft();
            else //5
                panel.p2FiveToLeft();
        }
        else if(code == KeyEvent.VK_DELETE)
        {
            if(p2Selected == 1)
                panel.p2OneToRight();
            else if(p2Selected == 2)
                panel.p2TwoToRight();
            else if(p2Selected == 3)
                panel.p2ThreeToRight();
            else if(p2Selected == 4)
                panel.p2FourToRight();
            else //5
                panel.p2FiveToRight();
        }
        else if(code == KeyEvent.VK_A)
        {
            if(p1Selected == 1)
                panel.p1OneToLeft();
            else if(p1Selected == 2)
                panel.p1TwoToLeft();
            else if(p1Selected == 3)
                panel.p1ThreeToLeft();
            else if(p1Selected == 4)
                panel.p1FourToLeft();
            else //5
                panel.p1FiveToLeft();
        }
        else if(code == KeyEvent.VK_D)
        {
            if(p1Selected == 1)
                panel.p1OneToRight();
            else if(p1Selected == 2)
                panel.p1TwoToRight();
            else if(p1Selected == 3)
                panel.p1ThreeToRight();
            else if(p1Selected == 4)
                panel.p1FourToRight();
            else //5
                panel.p1FiveToRight();
        }
    }
    
    public void keyReleased(KeyEvent e)
    {}
    
    public void keyTyped(KeyEvent e)
    {}
}
