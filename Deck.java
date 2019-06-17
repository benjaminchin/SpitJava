//Gameplay Class
//Ben C, Revanth S, Dhruv G
import java.util.ArrayList;
import java.util.Collections;
public class Deck
{
    public ArrayList<Card> InitialDeck = new ArrayList<Card>();
    public ArrayList<Card> player1Cards = new ArrayList<Card>();
    public static ArrayList<Card> OneStockOne = new ArrayList<Card>();
    public ArrayList<Card> OneStockTwo = new ArrayList<Card>();
    public ArrayList<Card> OneStockThree = new ArrayList<Card>();
    public ArrayList<Card> OneStockFour = new ArrayList<Card>();
    public ArrayList<Card> OneStockFive = new ArrayList<Card>();
    public static ArrayList<Card> LeftSpit = new ArrayList<Card>();
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
        shuffle();
        for(int i = 0; i < InitialDeck.size() / 2; i++)
        {
            player1Cards.add(0, InitialDeck.get(i));
        }
        for(int i = InitialDeck.size() / 2; i < InitialDeck.size(); i++)
        {
            player2Cards.add(0, InitialDeck.get(i));
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
        LeftSpit.add(player1Cards.get(0));
        player1Cards.remove(0);
        
        RightSpit.add(player2Cards.get(0));
        player2Cards.remove(0);
        while(OneStockOne.size() + OneStockTwo.size() + OneStockThree.size() + OneStockFour.size() + OneStockFive.size() < 15 && player1Cards.size() > 0) //Doesnt work, evenly splits piles
        {    
            if(OneStockOne.size() < 1 && player1Cards.size() > 0)
            {
                OneStockOne.add(0, player1Cards.get(0));
                player1Cards.remove(0);
            }
            if(OneStockTwo.size() < 2 && player1Cards.size() > 0)
            {
                OneStockTwo.add(0, player1Cards.get(0));
                player1Cards.remove(0);
            }
            if(OneStockThree.size() < 3 && player1Cards.size() > 0)
            {
                OneStockThree.add(0, player1Cards.get(0));
                player1Cards.remove(0);
            }
            if(OneStockFour.size() < 4 && player1Cards.size() > 0)
            {
                OneStockFour.add(0, player1Cards.get(0));
                player1Cards.remove(0);
            }
            if(OneStockFive.size() < 5 && player1Cards.size() > 0)
            {
                OneStockFive.add(0, player1Cards.get(0));
                player1Cards.remove(0);
            }
        }
        
        while(TwoStockOne.size() + TwoStockTwo.size() + TwoStockThree.size() + TwoStockFour.size() + TwoStockFive.size() < 15 && player2Cards.size() > 0)
        {
            if(TwoStockOne.size() < 1 && player2Cards.size() > 0)
            {
                TwoStockOne.add(0, player2Cards.get(0));
                player2Cards.remove(0);
            }
            if(TwoStockTwo.size() < 2 && player2Cards.size() > 0)
            {
                TwoStockTwo.add(0, player2Cards.get(0));
                player2Cards.remove(0);
            }
            if(TwoStockThree.size() < 3 && player2Cards.size() > 0)
            {
                TwoStockThree.add(0, player2Cards.get(0));
                player2Cards.remove(0);
            }
            if(TwoStockFour.size() < 4 && player2Cards.size() > 0)
            {
                TwoStockFour.add(0, player2Cards.get(0));
                player2Cards.remove(0);
            }
            if(TwoStockFive.size() < 5 && player2Cards.size() > 0)
            {
                TwoStockFive.add(0, player2Cards.get(0));
                player2Cards.remove(0);
            }
        }
    }
}
