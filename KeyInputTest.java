import java.awt.event.*;
import java.awt.*;

public class KeyInputTest implements KeyListener
{
    private String pile;
    private String spitPile;
    public void keyPressed(KeyEvent e)
    {
        int c = e.getKeyCode();
        if(c == KeyEvent.VK_1)
            pile = "1";
        else if(c == KeyEvent.VK_2)
            pile = "2";
        else if(c == KeyEvent.VK_3)
            pile = "3";
        else if(c == KeyEvent.VK_4)
            pile = "4";
        else if(c == KeyEvent.VK_5)
            pile = "5";
        else if(c == KeyEvent.VK_NUMPAD1)
            pile = "num1";
        else if(c == KeyEvent.VK_NUMPAD2)
            pile = "num2";
        else if(c == KeyEvent.VK_NUMPAD3)
            pile = "num3";
        else if(c == KeyEvent.VK_NUMPAD4)
            pile = "num4";
        else if(c == KeyEvent.VK_NUMPAD2)
            pile = "num5";
        else if(c == KeyEvent.VK_A || c == KeyEvent.VK_NUMPAD0)
            spitPile = "left";
        else if(c == KeyEvent.VK_D || c == KeyEvent.VK_DELETE)
            spitPile = "right";
    }
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public String getPile()
    {
        return pile;
    }
    public String getSpit()
    {
        return spitPile;
    }
}
