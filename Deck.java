//Gameplay Class
import java.util.ArrayList;
import java.util.Collections;
public class Deck
{
    public ArrayList<Card> InitialDeck = new ArrayList<Card>();
    public ArrayList<Card> player1Cards = new ArrayList<Card>();
    public ArrayList<Card> OneStockOne = new ArrayList<Card>();
    public ArrayList<Card> OneStockTwo = new ArrayList<Card>();
    public ArrayList<Card> OneStockThree = new ArrayList<Card>();
    public ArrayList<Card> OneStockFour = new ArrayList<Card>();
    public ArrayList<Card> OneStockFive = new ArrayList<Card>();
    public ArrayList<Card> LeftSpit = new ArrayList<Card>();
    public ArrayList<Card> RightSpit = new ArrayList<Card>();
    public ArrayList<Card> player2Cards = new ArrayList<Card>();
    public ArrayList<Card> TwoStockOne = new ArrayList<Card>();
    public ArrayList<Card> TwoStockTwo = new ArrayList<Card>();
    public ArrayList<Card> TwoStockThree = new ArrayList<Card>();
    public ArrayList<Card> TwoStockFour = new ArrayList<Card>();
    public ArrayList<Card> TwoStockFive = new ArrayList<Card>();

    // public ArrayList<ArrayList<Card>> player1Stocks = new ArrayList<ArrayList<Card>>();
    //public ArrayList<ArrayList<Card>> player2Stocks = new ArrayList<ArrayList<Card>>();
    //public ArrayList<ArrayList<Card>> spitPiles = new ArrayList<ArrayList<Card>>();
    public Deck()
    {
        //Create deck of 52 cards
        for(int i = 1; i <= 13; i++)
        {
            InitialDeck.add(new Card(i, "SPADES", "BLACK"));
            InitialDeck.add(new Card(i, "CLUBS", "BLACK"));
            InitialDeck.add(new Card(i, "HEARTS", "RED"));
            InitialDeck.add(new Card(i, "DIAMONDS", "RED"));
        }

        
    }

    public void shuffle()
    {
        Collections.shuffle(InitialDeck);
    }

    public void printDeck()
    {
        for(int i = 0; i < 52; i++)
        {
            System.out.println(InitialDeck.get(i).toString());
        }
    }

    public void deal()
    {
        ArrayList<Card> temp = new ArrayList<Card>();
        temp = InitialDeck;
        int count = 0;
        for(int i = 0; i<=temp.size()/2; i++)
        {
            player1Cards.add(i, temp.get(i));
        }
        for (int k = 27; k<=52; k++)
        {
            player2Cards.add(count, temp.get(k));
            count++;
        }

        {
            if (player1Cards.size()>=2)
            {
                OneStockOne.add(0,player1Cards.get(0));
                player1Cards.remove(0);
            }
        }
        {
            if (player1Cards.size()>=3)
            {
                OneStockTwo.add(0, player1Cards.get(0));
                player1Cards.remove(0);
                OneStockTwo.add(1, player1Cards.get(0));
                player1Cards.remove(0);
            }
        }
        {
            if (player1Cards.size()>=4)
            {
                OneStockThree.add(0, player1Cards.remove(0));
                OneStockThree.add(1,player1Cards.remove(0));
                OneStockThree.add(2,player1Cards.remove(0));
            }
        }
        {
            if (player1Cards.size()>=5)
            {
                OneStockFour.add(0,player1Cards.remove(0));
                OneStockFour.add(1,player1Cards.remove(0));
                OneStockFour.add(2,player1Cards.remove(0));
                OneStockFour.add(3,player1Cards.remove(0));
            }
        }
        {
            if (player1Cards.size()>=6)
            {
                OneStockFive.add(0,player1Cards.remove(0));
                OneStockFive.add(1,player1Cards.remove(0));
                OneStockFive.add(2,player1Cards.remove(0));
                OneStockFive.add(3,player1Cards.remove(0));
                OneStockFive.add(4,player1Cards.remove(0));
            }
        }
        {
            LeftSpit.add(0,player1Cards.remove(0));
        }
        {
            if(player2Cards.size()>=2)
            {
                TwoStockOne.add(0,player2Cards.remove(0));
            }
        }
        {
            if(player2Cards.size()>=3)
            {
                TwoStockTwo.add(0, player2Cards.remove(0));
                TwoStockTwo.add(1, player2Cards.remove(0));
            }
        }
        {
            if(player2Cards.size()>=4)
            {
                TwoStockThree.add(0, player2Cards.remove(0));
                TwoStockThree.add(1,player2Cards.remove(0));
                TwoStockThree.add(2,player2Cards.remove(0));
            }
        }
        {
            if(player2Cards.size()>=5)
            {
                TwoStockFour.add(0,player2Cards.remove(0));
                TwoStockFour.add(1,player2Cards.remove(0));
                TwoStockFour.add(2,player2Cards.remove(0));
                TwoStockFour.add(3,player2Cards.remove(0));
            }
        }
        {
            if(player2Cards.size()>=5)
            {
                TwoStockFive.add(0,player2Cards.remove(0));
                TwoStockFive.add(1,player2Cards.remove(0));
                TwoStockFive.add(2,player2Cards.remove(0));
                TwoStockFive.add(3,player2Cards.remove(0));
                TwoStockFive.add(4,player2Cards.remove(0));  
            }
        }
        {
            RightSpit.add(0,player2Cards.remove(0));
        }
    }

    public void setPlayer1Cards(ArrayList<Card> c)
    {
        player1Cards = c;
    }

    public void setOneStockOne(ArrayList<Card> c)
    {
        OneStockOne = c;
    }

    public void setOneStockTwo(ArrayList<Card> c)
    {
        OneStockTwo = c;
    }

    public void setOneStockThree(ArrayList<Card> c)
    {
        OneStockThree = c;
    }

    public void setOneStockFour(ArrayList<Card> c)
    {
        OneStockFour = c;
    }

    public void setOneStockFive(ArrayList<Card> c)
    {
        OneStockFive = c;
    }

    public void setPlayer2Cards(ArrayList<Card> c)
    {
        player2Cards = c;
    }

    public void setTwoStockOne(ArrayList<Card> c)
    {
        TwoStockOne = c;
    }

    public void setTwoStockTwo(ArrayList<Card> c)
    {
        TwoStockTwo = c;
    }

    public void setTwoStockThree(ArrayList<Card> c)
    {
        TwoStockThree = c;
    }

    public void setTwoStockFour(ArrayList<Card> c)
    {
        TwoStockFour = c;
    }

    public void setTwoStockFive(ArrayList<Card> c)
    {
        TwoStockFive = c;
    }

    public void setRightSpit(ArrayList<Card> c)
    {
        RightSpit = c;
    }

    public void setLeftSpit(ArrayList<Card> c)
    {
        LeftSpit = c;
    }
}
