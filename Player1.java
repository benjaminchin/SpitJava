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

                case KeyEvent.VK_D:

            }
            p1selection();
        }

        public int p1selection()
        {
            return p1selected;
        }

        public void keyReleased(KeyEvent e)
        {

        }

        public void keyTyped(KeyEvent e)
        {

        }
    }

}
