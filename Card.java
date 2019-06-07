public class Card
{
    private int rank; // 
    private String suit;
    private String color;

    public Card(int r, String s, String c)
    {
        rank = r;
        suit = s;
        color = c;
    }

    public int getRank()
    {
        return rank;
    }

    public String getSuit()
    {
        return suit;
    }

    public String getColor()
    {
        return color;
    }
    
    public String toString()
    {
        return rank + " " + suit + " " + color;
    }
}
