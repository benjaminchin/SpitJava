import java.awt.event.*;
import java.awt.*;
/**
 * Outlines the controls for Player 2.
 *
 * @author Dhruv Gupta
 * @version (a version number or a date)
 */
public class Player2 extends Deck
{
    public int p2selected = 0;
    public String p2pile;
    abstract class KeyAdapter implements KeyListener
    {
        public void keyPressed(KeyEvent e)
        {
            int code = e.getKeyCode();
            switch(code)
            {
                case KeyEvent.VK_NUMPAD1:
                    p2selected = 1;
                case KeyEvent.VK_NUMPAD2:
                    p2selected = 2;
                case KeyEvent.VK_NUMPAD3:
                    p2selected = 3;
                case KeyEvent.VK_NUMPAD4:
                    p2selected= 4;
                case KeyEvent.VK_NUMPAD5:
                    p2selected = 5;
            }

            switch(code)
            {
                case KeyEvent.VK_NUMPAD0:
                    p2pile = "0";
                case KeyEvent.VK_DELETE:
                    p2pile = "delete";
            }
            p2selection();
            pileSelected();
        }
        
        public int p2selection()
        {
            return p2selected;
        }
        
        public String pileSelected()
        {
            return p2pile;
        }
        
        public void keyReleased(KeyEvent e)
        {
            
        }

        public void keyTyped(KeyEvent e)
        {
            
        }
    }

}
