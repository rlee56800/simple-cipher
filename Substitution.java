
/**
 * Write a description of class Substitution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Substitution
{
    // instance variables - replace the example below with your own
    private char[] message;
    private String newMessage = "";
    private boolean hasValue[] = new boolean[26];
    private char encodedValue[] = new char[26];
    private char current = 'A';
    private Random rand = new Random();

    /**
     * Constructor for objects of class Substitution
     */
    public Substitution(char[] input)
    {
        message = input;
        //rand = r;
        int loc;
        while(current < 91)
        {
            loc = rand.nextInt(26);
            if(!hasValue[loc])
            {
                hasValue[loc] = true;
                encodedValue[loc] = current;
                current += 1;
            }
        }
    }
    
    public String encode()
    {
        for(int i = 0; i < message.length; i++)
        {
            newMessage += encodedValue[message[i] - 65];
        }
        return newMessage;
    }
    
    public String getKey()
    {
        String key = "";
        int counter = 1;
        current = 'A';
        for(char c : encodedValue)
        {
            key += current + " " + c + "\t";
            counter++;
            if(counter > 6)
            {
                counter = 1;
                key += "\n";
            }
            current += 1;
        }
        return key;
    }
    
    /*private boolean isFilled()
    {
        for(boolean b : hasValue)
            if(!b) return false;
        return true;
    }*/
}
