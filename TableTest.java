import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class TableTest
{
    public static void displayImage() throws IOException
    {
        BufferedImage bigImg = ImageIO.read(new File("cards.png"));
        
        final int width = 10;
        final int height = 10;
        final int rows = 5;
        final int cols = 5;
        
        BufferedImage[] sprites = new BufferedImage[rows * cols];
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                sprites[(i * cols) + j] = bigImg.getSubimage(
                    j* width, i * height, width, height);
            }
        }
    }
    
    public static void main(String[] args)
    {
        displayImage();
    }
}