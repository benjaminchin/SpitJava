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
    private int p1Selected;
    private int p2Selected;
    public KeyInput(GamePanel panel)
    {
        this.panel = panel;
    }
    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        if(code == 97)
        {
            p2Selected = 1;
        }
        else if(code == 98)
        {
            p2Selected = 2;
        }
        else if(code == 99)
        {
            p2Selected = 3;
        }
        else if(code == 100)
        {
            p2Selected = 4;
        }
        else if(code == 101)
        {
            p2Selected = 5;
        }
        else if(code == 49)
        {
            p1Selected = 1;
        }
        else if(code == 50)
        {
            p1Selected = 2;
        }
        else if(code == 51)
        {
            p1Selected = 3;
        }
        else if(code == 52)
        {
            p1Selected = 4;
        }
        else if(code == 53)
        {
            p1Selected = 5;
        }
        
        if(code == 96)
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
        else if(code == 127)
        {
            if(p2Selected == 1)
                panel.p2OneToRight();
            else if(p2Selected == 2)
                panel.p2TwoToRight();
            else if(p2Selected == 3)
                panel.p2ThreeToRight();
            else if(p2Selected == 4)
                panel.p2FourToRight();
            else if(p2Selected == 5)
                panel.p2FiveToRight();
        }
        else if(code == 65)
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
        else if(code == 68)
        {
            if(p1Selected == 1)
                panel.p1OneToRight();
            else if(p1Selected == 2)
                panel.p1TwoToRight();
            else if(p1Selected == 3)
                panel.p1ThreeToRight();
            else if(p1Selected == 4)
                panel.p1FourToRight();
            else if(p1Selected ==5)
                panel.p1FiveToRight();
        }
    }
    
    public void keyReleased(KeyEvent e)
    {}
    
    public void keyTyped(KeyEvent e)
    {}
}
