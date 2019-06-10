public class PlayGame
{
    private static Deck deck = new Deck();
    public static void main(String[] args)
    {
        deck.shuffle();
        deck.printDeck();
    }

    public static void makePlay()
    {
        
    }
    
    public static boolean gameIsOver()
    {
        return true;
    }
}


