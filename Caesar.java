

/**
 * Write a description of class Caesar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.Random;
public class Caesar
{
    private char[] message;
    private String newMessage = "";
    private int shift;
    /*private char[] alp = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                          'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                          'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                          'Y', 'Z'};*/
    private Random rand = new Random();

    /**
     * Constructor for objects of class Caesar
     */
    public Caesar(char[] input)
    {
        // initialise instance variables
        message = input;
        shift = rand.nextInt(25);
        //rand = r;
    }
    /**
     * Constructor for objects of class Caesar
     */
    public Caesar(char[] input, int shift)
    {
        // initialise instance variables
        message = input;
        this.shift = shift%25;
    }
    
    public String encode()
    {
        for(char c : message)
        {
            //int shifted = c + shiftl
            newMessage += (char) (c + shift);
            if(c > 91) c -= 26;
        }
        return newMessage;
    }
    
    public String getKey()
    {
    	return "Shift = " + shift;
    }
}
