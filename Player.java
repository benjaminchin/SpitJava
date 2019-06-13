import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Outlines the descriptions and controls for each of the players.
 *
 * @author Dhruv Gupta
 * @version 06.12.19
 */
public class Player
{
    public int p2selected = 0;
    public String p2pile;
    public int p1selected = 0;
    public String p1pile;
    abstract class KeyAdapter implements KeyListener
    {
        public void keyPressedP2(KeyEvent e)
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
                case KeyEvent.VK_ENTER:
                p2pile = "slap";
                case KeyEvent.VK_PLUS:
                p2pile = "draw";
            }
            getP2Selection();
            getPileSelected();
        }

        public void keyPressedP1(KeyEvent e)
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
                case KeyEvent.VK_SHIFT:
                p1pile = "+";
                case KeyEvent.VK_Z:
                p1pile = "flip";
            }
            getP1Selection();
            getPileSelection();
        }

        public int getP2Selection()
        {
            return p2selected;
        }

        public String getPileSelected()
        {
            return p2pile;
        }

        public int getP1Selection()
        {
            return p1selected;
        }

        public String getPileSelection()
        {
            return p1pile;
        }
    }
}

