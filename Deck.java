import java.util.*; 
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Deck
     */
    public final int SIZE = 52;
    private ArrayList<Card> cards = new ArrayList<Card>();
    private ArrayList<Card> active;
    public Deck()
    {
        for (int i = 0; i< SIZE; i++)
        {
            String suit = null;
            int value = i%13+1;
           
            switch (i%4){
                case 0: suit = "Spades";
                        break;
                case 1: suit = "Hearts";
                        break;
                case 2: suit = "Diamonds";
                        break;
                case 3: suit = "Clubs";
                        break;
                        }
            cards.add(new Card(suit, value));
        }
        active = new ArrayList<Card> (cards);
    }
    public Card draw()
    {
        Random r = new Random();
        int CardIndex = r.nextInt(active.size());
        Card drawn = active.get(CardIndex);
        active.remove(drawn);
        return drawn;
    }
    public void shuffle()
    {
        Collections.shuffle(active);
    }
}

    