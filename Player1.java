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
    abstract class KeyAdapter implements KeyListener
    {
        public void keyPressed(KeyEvent e)
        {
            int code = e.getKeyCode();
            switch(code)
            {
                case 49:
                    OneStockOne.isSelected() = true;
                case 50:
                    OneStockTwo.isSelected() = true;
                case 51:
                    OneStockThree.isSelected() = true;
                case 52:
                    OneStockFour.isSelected() = true;
                case 53:
                    OneStockFive.isSelected() = true;
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
