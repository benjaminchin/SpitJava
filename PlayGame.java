import java.util.ArrayList;
public class PlayGame extends Player
{
    private static Deck deck = new Deck();
    private static Player1 player1 = new Player1();
    private static Player2 player2 = new Player2();
    //private static ArrayList<Card> p1Selection;
    //private static ArrayList<Card> p2Selection;
    //private static ArrayList<Card> p1SelectedPile;
    //private static ArrayList<Card> p2SelectedPile;
    
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

        if (p1selected == 1 && p1pile == "a")
        {
            if (OneStockOne.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockOne.get(0).getRank() == LeftSpit.get(0).getRank()+1 )
            {
                LeftSpit.add(0, OneStockOne.remove(0));
                // display image code
            }
        }
        if (p1selected == 2 && p1pile == "a")
        {

            if (OneStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)

            {

                LeftSpit.add(0, OneStockTwo.remove(0));

            }

        }
        if (p1selected == 3 && p1pile == "a")
        {
            if (OneStockThree.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockThree.get(0).getRank() == LeftSpit.get(0).getRank()+1)
            {
                LeftSpit.add(0, OneStockThree.remove(0));

            }

        }
        if (p1selected == 4 && p1pile == "a")
        {
            if (OneStockFour.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockFour.get(0).getRank() == LeftSpit.get(0).getRank()+1)
            {
                LeftSpit.add(0,OneStockFour.remove(0));

            }
        }

        if (p1selected == 5 && p1pile == "a")
        {
            if (OneStockFive.get(0).getRank() == LeftSpit.get(0).getRank()-1 || OneStockFive.get(0).getRank() == LeftSpit.get(0).getRank()+1)

            {

                LeftSpit.add(0,OneStockFive.remove(0));

            }
        }
        if (p1selected == 1 && p1pile == "d")
        {
            if (OneStockOne.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockOne.get(0).getRank() == RightSpit.get(0).getRank()+1)
            {
                RightSpit.add(0, OneStockOne.remove(0));
            }
        }

        if (p1selected ==2 && p1pile =="d")
        {

            if (OneStockTwo.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockTwo.get(0).getRank() == RightSpit.get(0).getRank()+1)
            {
                RightSpit.add(0, OneStockTwo.remove(0));
            }

        }

        if (p1selected == 3 && p1pile =="d")
        {
            if (OneStockThree.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockThree.get(0).getRank() == RightSpit.get(0).getRank()+1)
            {
                RightSpit.add(0, OneStockThree.remove(0));
            }

        }

        if (p1selected ==4 && p1pile == "d")
        {

            if (OneStockFour.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockFour.get(0).getRank() == RightSpit.get(0).getRank()+1)
            {
                RightSpit.add(0, OneStockFour.remove(0));
            }
        }

        if (p1selected == 5 && p1pile== "d")
        {
            if (OneStockFive.get(0).getRank() == RightSpit.get(0).getRank()-1 || OneStockFive.get(0).getRank() == RightSpit.get(0).getRank()+1)
            {
                RightSpit.add(0, OneStockFive.remove(0));
            }

        }
    }

    public  void p2MakePlay()
    {

        if (p2selected ==1 && p2pile == "0")
        {
            if (TwoStockOne.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockOne.get(0).getRank() == LeftSpit.get(0).getRank()+1)
            {
                LeftSpit.add(0, TwoStockOne.remove(0));

            }

        }
        if (p2selected == 2 && p2pile == "0")
        {

            if (TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
            {
                LeftSpit.add(0, TwoStockTwo.remove(0));

            }

        }
        if (p2selected ==3 && p2pile == "0")
        {
            if (TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == LeftSpit.get(0).getRank()+1)
            {
                LeftSpit.add(0, TwoStockThree.remove(0));

            }

        }

        if (p2selected ==4 && p2pile == "0")
        {
            if (TwoStockFour.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockFour.get(0).getRank() == LeftSpit.get(0).getRank()+1)
            {
                LeftSpit.add(0, TwoStockFour.remove(0));

            }

        }

        if (p2selected ==5 && p2pile =="0")
        {
            if (TwoStockFive.get(0).getRank() == LeftSpit.get(0).getRank()-1 || TwoStockFive.get(0).getRank() == LeftSpit.get(0).getRank()+1)
            {
                LeftSpit.add(0, TwoStockFive.remove(0));

            }
        }

        if (p2selected ==1 && p2pile == "delete")
        {
            if (TwoStockOne.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockOne.get(0).getRank() == RightSpit.get(0).getRank()+1)
            {
                RightSpit.add(0, TwoStockOne.remove(0));

            }

        }
        if (p2selected ==2 && p2pile == "delete")
        {
            if (TwoStockTwo.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockTwo.get(0).getRank() == RightSpit.get(0).getRank()+1)
            {
                RightSpit.add(0, TwoStockTwo.remove(0));

            }

        }
        if (p2selected ==3 && p2pile == "delete")
        {
            if (TwoStockThree.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockThree.get(0).getRank() == RightSpit.get(0).getRank()+1)
            {
                RightSpit.add(0, TwoStockThree.remove(0));

            }

        }
        if (p2selected ==4 && p2pile == "delete")
        {

            if (TwoStockFour.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockFour.get(0).getRank() == RightSpit.get(0).getRank()+1)
            {
                RightSpit.add(0, TwoStockFour.remove(0));

            }

        }

        
        if (p2selected ==5 && p2pile == "delete")
        {

            if (TwoStockFive.get(0).getRank() == RightSpit.get(0).getRank()-1 || TwoStockFive.get(0).getRank() == RightSpit.get(0).getRank()+1)
            {
                RightSpit.add(0, TwoStockFive.remove(0));

            }

        }
        
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

