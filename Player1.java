import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;
/**
 * Write a description of class Player1 here.
 *
 * @author Dhruv Gupta
 * @version (a version number or a date)
 */
public class Player1 extends Deck
{
    private int p1selected = 0;
    abstract class KeyAdapter implements KeyListener
    {
        public void keyPressed(KeyEvent e)
        {
            int code = e.getKeyCode();
            switch(code)
            {
                case 49:
                    p1selected = 1;
                case 50:
                    p1selected = 2;
                case 51:
                    p1selected = 3;
                case 52:
                    p1selected= 4;
                case 53:
                    p1selected = 5;
            }
            
        }
        
        public void keyReleased(KeyEvent e)
        {
            
        }
        
        public void keyTyped(KeyEvent e)
        {
            
        }
    }
   
   
}
