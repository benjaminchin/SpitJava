public class Card
{
    private int rank; // 
    private String suit;
    private String color;
    private int x;
    private int y;
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
    //Calculate sprite coordinate x
    public void getCoordinates()
    {
        if(color == "RED")
        {
            if(suit == "HEARTS")
            {
                switch(rank)
                {
                    case 1:
                        x = 1;
                    case 2:
                        x = 2;
                    case 3:
                        x = 3;
                    case 4:
                        x = 4;
                    case 5:
                        x = 5;
                    case 6:
                        x = 6;
                    case 7:
                        x = 7;
                    case 8:
                        x = 8;
                    case 9:
                        x = 9;
                    case 10:
                        x = 10;
                    case 11:
                        x = 11;
                    case 12:
                        x = 12;
                    case 13:    
                        x = 13;
                }
            }
            else if(suit == "DIAMOND")
            {
                switch(rank)
                {
                    case 1:
                        x = 1;
                    case 2:
                        x = 2;
                    case 3:
                        x = 3;
                    case 4:
                        x = 4;
                    case 5:
                        x = 5;
                    case 6:
                        x = 6;
                    case 7:
                        x = 7;
                    case 8:
                        x = 8;
                    case 9:
                        x = 9;
                    case 10:
                        x = 10;
                    case 11:
                        x = 11;
                    case 12:
                        x = 12;
                    case 13:    
                        x = 13;
                }
            }
        }
        else if(color == "BLACK")
        {
            if(suit == "SPADES")
            {
                switch(rank)
                {
                    case 1:
                        x = 1;
                    case 2:
                        x = 2;
                    case 3:
                        x = 3;
                    case 4:
                        x = 4;
                    case 5:
                        x = 5;
                    case 6:
                        x = 6;
                    case 7:
                        x = 7;
                    case 8:
                        x = 8;
                    case 9:
                        x = 9;
                    case 10:
                        x = 10;
                    case 11:
                        x = 11;
                    case 12:
                        x = 12;
                    case 13:    
                        x = 13;
                }
            }
            else if(suit == "CLUBS")
            {
                switch(rank)
                {
                    case 1:
                        x = 1;
                    case 2:
                        x = 2;
                    case 3:
                        x = 3;
                    case 4:
                        x = 4;
                    case 5:
                        x = 5;
                    case 6:
                        x = 6;
                    case 7:
                        x = 7;
                    case 8:
                        x = 8;
                    case 9:
                        x = 9;
                    case 10:
                        x = 10;
                    case 11:
                        x = 11;
                    case 12:
                        x = 12;
                    case 13:    
                        x = 13;
                }
            }
        }
    }
}
