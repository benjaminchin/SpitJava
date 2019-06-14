import java.util.ArrayList;
public class PlayGame extends GUI2
{
    private static Deck deck = new Deck();
    private static Player1 player1 = new Player1();
    private static Player2 player2 = new Player2();
    //private static ArrayList<Card> p1Selection;
    //private static ArrayList<Card> p2Selection;
    //private static ArrayList<Card> p1SelectedPile;
    //private static ArrayList<Card> p2SelectedPile;
    public  ArrayList<Card> InitialDeck = new ArrayList<Card>();
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

    public static void main(String[] args)
    {
        deck.shuffle();
        deck.printDeck();
    }

    /*public static void selectedCards()
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
    } */

    //public static boolean canPlay()
    //{
    //if((p1Selection.get(0).getRank() + 1 == p1SelectedPile.get(0).getRank() || p1Selection.get(0).getRank() - 1 == p1SelectedPile.get(0).getRank())
    //|| (p2Selection.get(0).getRank() + 1 == p2SelectedPile.get(0).getRank() || p2Selection.get(0).getRank() - 1 == p2SelectedPile.get(0).getRank()))
    //{
    //  return true;
    //}
    //return false;
    //}

    public void p1MakePlay()
    {
        if (p1selected == 1)
        {
            if(p1pile == "a")
            {
                if (OneStockOne.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockOne.get(0).getRank() == LeftSpit.get(0).getRank()+1 )
                {
                    LeftSpit.add( OneStockOne.remove(OneStockOne.size()-1));
                    // display image code
                }
            }
            else if(p1pile == "d")
            {    
                if (OneStockOne.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockOne.get(0).getRank() == LeftSpit.get(0).getRank()+1 )
                {
                    RightSpit.add( OneStockOne.remove(OneStockOne.size()-1));
                    // display image code
                }
            }
        }
        
        
        if (p1selected == 2)
        {
            if(p1pile == "a")
            {
                if (OneStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    LeftSpit.add(OneStockTwo.remove(OneStockTwo.size()-1));
                }
            }
            else if(p1pile == "d")
            {
                if (OneStockTwo.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    RightSpit.add(OneStockTwo.remove(OneStockTwo.size()-1));
                }
            }
        }
        
        if (p1selected == 3)
        {
            if(p1pile == "a")
            {
                if (OneStockThree.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockThree.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    LeftSpit.add( OneStockThree.remove(OneStockThree.size()-1));
                }
            }
            else if(p1pile == "d")
            {
                if (OneStockThree.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockThree.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    RightSpit.add( OneStockThree.remove(OneStockThree.size()-1));

                }
            }
        }
        
        if (p1selected == 4)
        {
            if(p1pile == "a")
            {
                if (OneStockFour.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockFour.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    LeftSpit.add(OneStockFour.remove(OneStockFour.size()-1));

                }
            }
            if(p1pile == "d")
            {
                if (OneStockFour.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockFour.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    RightSpit.add(OneStockFour.remove(OneStockFour.size()-1));

                }
            }
        }

        if (p1selected == 5)
        {
            if(p1pile == "a")
            {
                if (OneStockFive.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockFive.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    LeftSpit.add(OneStockFive.remove(OneStockFive.size()-1));
                }
            }
            else if(p1pile == "d")
            {
                if (OneStockFive.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockFive.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    RightSpit.add(OneStockFive.remove(OneStockFive.size()-1));
                }
            }
        }
        
        
        if (p1pile == "flip")
        {           
            LeftSpit.add(player1Cards.remove(player1Cards.size()-1));            
        }
        
        
        
        
        if (p1pile == "+" && OneStockOne.size() ==0 && OneStockTwo.size() ==0 && OneStockThree.size() == 0 && OneStockFour.size() == 0
        && OneStockFive.size() == 0)
        {

            if (LeftSpit.size() < RightSpit.size())
            {
                for (int i = 0; i<= LeftSpit.size(); i++)
                {
                    player1Cards.add(LeftSpit.get(i));

                }
                LeftSpit.clear();

            }

            else
            {
                for (int k = 0; k<=RightSpit.size(); k++)
                {

                    player1Cards.add(RightSpit.get(k));

                }
                RightSpit.clear();
            }

        }
        
        // code case to assign player smaller pile when slapped

    }

    public  void p2MakePlay()
    {
        if (p2selected == 1)
        {
            if(p2pile == "0")
            {
                if (TwoStockOne.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockOne.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    LeftSpit.add(TwoStockOne.remove(TwoStockOne.size()-1));
                }
            }
            else if(p2pile == "delete")
            {
                if (TwoStockOne.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockOne.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    LeftSpit.add(TwoStockOne.remove(TwoStockOne.size()-1));
                }
            }
        }
        
        if (p2selected == 2)
        {
            if(p2pile == "0")
            {
                if (TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    LeftSpit.add(TwoStockTwo.remove(TwoStockTwo.size()-1));
                }
            }
            else if (p2pile == "delete")
            {
                if (TwoStockTwo.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    RightSpit.add(TwoStockTwo.remove(TwoStockTwo.size()-1));
                }
            }
        }
        
        if (p2selected == 3)
        {
            if(p2pile == "0")
            {
                if(TwoStockThree.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    LeftSpit.add(TwoStockThree.remove(TwoStockThree.size()-1));
                }
            }
            else if(p2pile == "0")
            {
                if(TwoStockThree.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    RightSpit.add(TwoStockThree.remove(TwoStockThree.size()-1));
                }
            }
        }

        if (p2selected == 4)
        {
            if(p2pile == "0")
            {
                if (TwoStockFour.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockFour.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    LeftSpit.add( TwoStockFour.remove(TwoStockFour.size()-1));
                }
            }
            else if(p2pile == "delete")
            {
                if (TwoStockFour.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockFour.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    RightSpit.add( TwoStockFour.remove(TwoStockFour.size()-1));
                }
            }
        }

        if (p2selected == 5)
        {
            if(p2pile == "0")
            {
                if (TwoStockFive.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockFive.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    LeftSpit.add(TwoStockFive.remove(TwoStockFive.size()-1));
                }
            }
            else if(p2pile == "delete")
            {
                if (TwoStockFive.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockFive.get(0).getRank() == LeftSpit.get(0).getRank()+1)
                {
                    RightSpit.add(TwoStockFive.remove(TwoStockFive.size()-1));
                }
            }
        }

        if (p2pile == "slap" && TwoStockOne.size()==0 && TwoStockTwo.size() == 0 && TwoStockThree.size() == 0 && TwoStockFour.size() == 0
        && TwoStockFive.size()== 0)
        {
            if (LeftSpit.size() < RightSpit.size())
            {
                for (int i = 0; i<= LeftSpit.size(); i++)
                {
                    player2Cards.add(LeftSpit.get(i));

                }
                LeftSpit.clear();
            }
            else
            {
                for (int k = 0; k<=RightSpit.size(); k++)
                {
                    player2Cards.add(RightSpit.get(k));
                }
                RightSpit.clear();
            }
        }
        
       // code case to assign player smaller pile when slapped
       
    }

    public boolean gameIsOver()
    {
        if (player1Cards.size() == 0 || player2Cards.size() == 0)
        {
            return true;
        }
        return false;
    }

    public boolean roundisOver()
    {
        if (LeftSpit.size() == 0 || RightSpit.size() == 0)
            return true;
        return false;
    }
}

