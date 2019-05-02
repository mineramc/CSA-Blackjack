
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private String suit;
    private int value;
    private String display;
    /**
     * Constructor for objects of class Card
     */
    public Card()
    {
        suit = null;
        value = -1;
    }
    public Card (String s, int v)
    {
        suit = s;
        value = v;
        setDisplayChar();
    }
    public int getValue()
    {
        return this.value;
    }
    public String getSuit()
    {
        return this.suit;
    }
    public String getDisplay()
    {
        return this.display;
    }
    private void setDisplayChar()
    {
        switch (suit){
            case "Spades": 
                switch (value){
                    case 1: display = "\uD83C\uDCA1";
                        break;
                    case 2: display = "\uD83C\uDCA2";
                        break;
                    case 3: display = "\uD83C\uDCA3";
                        break;
                    case 4: display = "\uD83C\uDCA4";
                        break;
                    case 5: display = "\uD83C\uDCA5";
                        break;
                    case 6: display = "\uD83C\uDCA6";
                        break;
                    case 7: display = "\uD83C\uDCA7";
                        break;
                    case 8: display = "\uD83C\uDCA8";
                        break;
                    case 9: display = "\uD83C\uDCA9";
                        break;
                    case 10: display = "\uD83C\uDCAA";
                        break;
                    case 11: display = "\uD83C\uDCAB";
                        break;
                    case 12: display = "\uD83C\uDCAD";
                        break;   
                    case 13: display = "\uD83C\uDCAE";
                        break;
                }
            case "Hearts": 
                switch (value){
                    case 1: display = "\uD83C\uDCB1";
                        break;
                    case 2: display = "\uD83C\uDCB2";
                        break;
                    case 3: display = "\uD83C\uDCB3";
                        break;
                    case 4: display = "\uD83C\uDCB4";
                        break;
                    case 5: display = "\uD83C\uDCB5";
                        break;
                    case 6: display = "\uD83C\uDCB6";
                        break;
                    case 7: display = "\uD83C\uDCB7";
                        break;
                    case 8: display = "\uD83C\uDCB8";
                        break;
                    case 9: display = "\uD83C\uDCB9";
                        break;
                    case 10: display = "\uD83C\uDCBA";
                        break;
                    case 11: display = "\uD83C\uDCBB";
                        break;
                    case 12: display = "\uD83C\uDCBD";
                        break;   
                    case 13: display = "\uD83C\uDCBE";
                        break;
                }
            case "Diamonds": 
                switch (value){
                    case 1: display = "\uD83C\uDCC1";
                        break;
                    case 2: display = "\uD83C\uDCC2";
                        break;
                    case 3: display = "\uD83C\uDCC3";
                        break;
                    case 4: display = "\uD83C\uDCC4";
                        break;
                    case 5: display = "\uD83C\uDCC5";
                        break;
                    case 6: display = "\uD83C\uDCC6";
                        break;
                    case 7: display = "\uD83C\uDCC7";
                        break;
                    case 8: display = "\uD83C\uDCC8";
                        break;
                    case 9: display = "\uD83C\uDCC9";
                        break;
                    case 10: display = "\uD83C\uDCCA";
                        break;
                    case 11: display = "\uD83C\uDCCB";
                        break;
                    case 12: display = "\uD83C\uDCCD";
                        break;   
                    case 13: display = "\uD83C\uDCCE";
                        break;
                }
            case "Clubs": 
                switch (value){
                    case 1: display = "\uD83C\uDCD1";
                        break;
                    case 2: display = "\uD83C\uDCD2";
                        break;
                    case 3: display = "\uD83C\uDCD3";
                        break;
                    case 4: display = "\uD83C\uDCD4";
                        break;
                    case 5: display = "\uD83C\uDCD5";
                        break;
                    case 6: display = "\uD83C\uDCD6";
                        break;
                    case 7: display = "\uD83C\uDCD7";
                        break;
                    case 8: display = "\uD83C\uDCD8";
                        break;
                    case 9: display = "\uD83C\uDCD9";
                        break;
                    case 10: display = "\uD83C\uDCDA";
                        break;
                    case 11: display = "\uD83C\uDCDB";
                        break;
                    case 12: display = "\uD83C\uDCDD";
                        break;   
                    case 13: display = "\uD83C\uDCDE";
                        break;
                }
        }
    }
}
