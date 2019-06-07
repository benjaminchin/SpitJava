//Gameplay Class
import java.util.ArrayList;
import java.util.Collections;
public class Deck
{
    public ArrayList<Card> deck = new ArrayList<Card>();

    public Deck()
    {
        //Create deck of 52 cards
        for(int i = 1; i <= 13; i++)
        {
            deck.add(new Card(i, "SPADES", "BLACK"));
            deck.add(new Card(i, "CLUBS", "BLACK"));
            deck.add(new Card(i, "HEARTS", "RED"));
            deck.add(new Card(i, "DIAMONDS", "RED"));
        }
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public void printDeck()
    {
        for(int i = 0; i < 52; i++)
        {
            System.out.println(deck.get(i).toString());
        }
    }

    
}
