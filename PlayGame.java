import java.util.ArrayList;
import java.util.Collections;
public class PlayGame
{
    private static ArrayList<Card> deck = new ArrayList<Card>();
    
    public static void shuffle()
    {
        Collections.shuffle(deck);
    }
    
    public static void printDeck()
    {
        for(int i = 0; i < 52; i++)
        {
            System.out.println(deck.get(i).toString());
        }
    }
    
    public static void main(String[] args)
    {
        //Create deck of 52 cards
        for(int i = 1; i <= 13; i++)
        {
            deck.add(new Card(i, "SPADES", "BLACK"));
            deck.add(new Card(i, "CLUBS", "BLACK"));
            deck.add(new Card(i, "HEARTS", "RED"));
            deck.add(new Card(i, "DIAMONDS", "RED"));
        }
        
        shuffle();
        printDeck();
    }
}
