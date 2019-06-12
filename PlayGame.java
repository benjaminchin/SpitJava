import java.util.ArrayList;
public class PlayGame
{
    private static Deck deck = new Deck();
    private static Player1 player1 = new Player1();
    private static Player2 player2 = new Player2();
    private static ArrayList<Card> p1Selection;
    private static ArrayList<Card> p2Selection;
    private static ArrayList<Card> p1SelectedPile;
    private static ArrayList<Card> p2SelectedPile;
    public static void main(String[] args)
    {
        deck.shuffle();
        deck.printDeck();
    }

    public static void selectedCards()
    {

        if(player1.p1selected == 1)
            p1Selection = deck.OneStockOne;
        else if(player1.p1selected == 2)
            p1Selection = deck.OneStockTwo;
        else if(player1.p1selected == 3)
            p1Selection = deck.OneStockThree;
        else if(player1.p1selected == 4)
            p1Selection = deck.OneStockFour;
        else
            p1Selection = deck.OneStockFive;

        if(player2.p2selected ==1 )
            p2Selection = deck.TwoStockOne;
        else if(player2.p2selected == 2)
            p2Selection = deck.TwoStockTwo;
        else if(player2.p2selected == 3)
            p2Selection = deck.TwoStockThree;
        else if(player2.p2selected == 4)
            p2Selection = deck.TwoStockFour;
        else
            p2Selection = deck.TwoStockFive;

        if(player1.p1pile == "a")
            p1SelectedPile = deck.LeftSpit;
        else
            p1SelectedPile = deck.RightSpit;

        if(player2.p2pile == "0")
            p2SelectedPile = deck.LeftSpit;
        else
            p2SelectedPile = deck.RightSpit;
    }

    public static boolean canPlay()
    {
        if((p1Selection.get(0).getRank() + 1 == p1SelectedPile.get(0).getRank() || p1Selection.get(0).getRank() - 1 == p1SelectedPile.get(0).getRank())
            || (p2Selection.get(0).getRank() + 1 == p2SelectedPile.get(0).getRank() || p2Selection.get(0).getRank() - 1 == p2SelectedPile.get(0).getRank()))
        {
            return true;
        }
        return false;
    }
    
    public static void p1MakePlay()
    {
        if(canPlay() == true)
        {
            Card temp = p1Selection.get(0);
            p1Selection.remove(0);
            p1SelectedPile.add(temp);
        }
        
    }
    
    public static void p2MakePlay()
    {
    
    }
    
    public static boolean gameIsOver()
    {
        return false;
    }
    
    public static boolean roundisOver()
    {
        return false;
    }
}

