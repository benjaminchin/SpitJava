import java.awt.event.*;
import java.awt.*;
/**
 * Outlines the controls for Player 1.
 *
 * @author Dhruv Gupta
 * @version (a version number or a date)
 */
public class Player1 extends Deck
{
    public int p1selected = 0;
    public String p1pile;
    abstract class KeyAdapter implements KeyListener
    {
        public void keyPressed(KeyEvent e)
        {
            int code = e.getKeyCode();
            switch(code)
            {
                case KeyEvent.VK_1:
                    p1selected = 1;
                case KeyEvent.VK_2:
                    p1selected = 2;
                case KeyEvent.VK_3:
                    p1selected = 3;
                case KeyEvent.VK_4:
                    p1selected= 4;
                case KeyEvent.VK_5:
                    p1selected = 5;
            }

            switch(code)
            {
                case KeyEvent.VK_A:
                    p1pile = "a";
                case KeyEvent.VK_D:
                    p1pile = "d";
            }
            p1selection();
            pileSelection();
        }

        public int p1selection()
        {
            return p1selected;
        }
        
        public String pileSelection()
        {
            return p1pile;
        }
    }
}
