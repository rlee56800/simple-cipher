
/**
 * Runs the other ciphers
 *
 * @author rlee56800
 * @version 2/29, 7/27/21, 8/09/21
 */
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Main
{
    System.out.println("Please submit your message:");
        wholeMessage = scan.nextLine();
        loc = this.stringPrep(); //
        
        while(!correct)
        {
            System.out.println("Which cipher would you like to use? (Enter number)");
            System.out.println("1 Caesar");
            System.out.println("2 Substitution");
            System.out.println("3 Info");
            
            int input = scan.nextInt();
            switch(input) {
                case 1:
                    correct = true;
                    //System.out.print("Enter a shift value: ")
                    //shift selected randomly
                    Caesar cCipher = new Caesar(message);
                    encodedMes = cCipher.encode();
                    key = cCipher.getKey();
                    break;
                case 2:
                    correct = true;
                    Substitution sCipher = new Substitution(message);
                    encodedMes = sCipher.encode();
                    key = sCipher.getKey();
                    break;
                case 3:
                    System.out.println("The action of a Caesar cipher is to replace each plaintext letter with a different one a " +
                        "fixed number of places down the alphabet\nVia Wikipedia: https://en.wikipedia.org/wiki/Caesar_cipher");
                    System.out.println("Substitution ciphers encrypt the plaintext by swapping each letter or symbol in the" + 
                        "plaintext by a different symbol as directed by the key\nVia sciencedirect:" +
                        "https://www.sciencedirect.com/topics/computer-science/substitution-cipher");
                    correct = true;
                    break;
                default:
                    System.out.println(":(\n\n");
                    break;
            }
        }
            
        System.out.printf("Your encoded message is: %s%nYour key is:%n%s%n",
                encodedMes, key);
        
        correct = false;
    }
    
    private char[] stringPrep(String s)
    {
        return s.toUpperCase().toCharArray();
    }
    
}
