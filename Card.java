public class Card
{
    private int rank; // 1-13 ace-king
    private String suit;
    private String color; //Not actually used besides toString() to test
    private int x;
    private int y;
    public Card(int r, String s, String c)
    {
        rank = r;
        suit = s;
        color = c;

        //Calculate x and y coordinates for sprite
        if(rank == 1)
            x= 0;
        else if(rank == 2)
            x = 72;
        else if(rank == 3)
            x = 144;
        else if(rank == 4)
            x = 216;
        else if(rank == 5)
            x = 288;
        else if(rank == 6)
            x = 360;
        else if(rank == 7)
            x = 432;
        else if(rank == 8)
            x = 504;
        else if(rank == 9)
            x = 576;
        else if(rank == 10)
            x = 648;
        else if(rank == 11)
            x = 720;
        else if(rank == 12)
            x = 792;
        else if(rank == 13)
            x = 864;
        else
            x = 936;
        /*
        switch(rank)
        {
            case 1:
                x = 0;
            case 2:
                x = 72;
            case 3:
                x = 144;
            case 4:
                x = 216;
            case 5:
                x = 288;
            case 6:
                x = 360;
            case 7:
                x = 432;
            case 8:
                x = 504;
            case 9:
                x = 576;
            case 10:
                x = 648;
            case 11:
                x = 720;
            case 12:
                x = 792;
            case 13:    
                x = 864;
            //default: x = 936;
        }
        */
        if(suit == "HEARTS")
            y = 192;
        else if(suit == "DIAMONDS")
            y = 288;
        else if(suit == "SPADES")
            y = 96;
        else // if suit == "CLUBS" also for no-face cards
            y = 0;
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

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public String toString()
    {
        return rank + " " + suit + " " + color;
    }

}
