import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;
/**
 * Write a description of class Player1 here.
 *
 * @author Dhruv Gupta
 * @version (a version number or a date)
 */
public class Player1 
{
    static abstract class KeyAdapter implements KeyListener
    {
        public void keyPressed(KeyEvent e)
        {
            System.out.print(e.getKeyCode());
        }
        
        public void keyReleased(KeyEvent e)
        {
            
        }
        
        public void keyTyped(KeyEvent e)
        {
            
        }
    }
}
