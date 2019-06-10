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
     for(int i = 0; i<=InitialDeck.size()/2; i++)
     {
         player1Cards.add(i, temp.get(i));
        }
     for (int k = 27; k<=52; k++)
     {
         player2Cards.add(count, temp.get(k));
         count++;
        }
        
     OneStockOne.add(0,player1Cards.get(0));
     player1Cards.remove(0);
     
     for (int x = 0; x<=2; x++)
     {
         OneStockTwo.add(x, player1Cards.get(x));
         
         
         
        }
     
    }
}
