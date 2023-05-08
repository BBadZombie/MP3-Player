import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * The main objective of this class is to prompt a user for a download directory
 * and a URL to download from. 
 * 
 * This class will contain methods that prompt a user into inputting information.
 * 
 * Need to create a class for saving URLs and directories set by a user
 * 
 * @author Anthony Lopez
 * @version 5.3.23
 * 
 * Notes 4.6.23:
 *  - Replaced while loop that handeled yt-dlp output with do while loop
 *  - Replaced if statements that determined calledDirectory with switch 
 *    statements
 *  
 *  - Added variable declarations and a constructor to reduce coupling between 
 *    variables and methods
 *  - Condensed the two switch statements that determined directories and 
 *    urls into a method that takes many paramaters
 * 
 * Notes 5.3.23:
 *  - Replaced all of the ints variables with shorts to save on space.
 *    - Im thinking about a system that changes the data type based on the 
 *      amount of saved directories and URLs
 *  - Removed some import statements since I separated the parts of this class 
 *    that deals with user interaction
 *  - Separating the friendlyDownloader() method into 2 different methods 
 *    that prompt the user for directory and url respectively
 *  - Removed setInputs() and switchStatement() method as they arent very
 *    Java-esque
 *  - Removed friendlyDownloader() for same reason as above
 *  - Considering saving directories and URLs using a HashMap. Possibly in this
 *    class but Id rather in a different one
 *    
 * Notes for 5.5.23"
 *  - Changing the base structure of this class hopefully for the last time
 *  - Removed askForDirectory() and askForURL() methods in favor of a more 
 *    flexible method that receives a parameter for a prompt. This allows the
 *    method to be adjusted to any scenario asking for user input
 *    
 * FINISHED FOR NOW
 */
public class UserPrompt{
    String input;
    Scanner keyboard;

    /**
     * Constructor
     * 
     * 5.3.23:
     *  - Removed all of my saved directories and URLs. Theyre saved in GitHub.
     */
    public UserPrompt(){
        
    }
    
    /**
     * Constructor for testing
     * 
     * 5.3.23:
     *  - Removed all of my saved directories and URLs. Theyre saved in GitHub.
     */
    public UserPrompt(String prompt){
        askForInput(prompt);
    }

    /**
     * Method to prompt user for directory
     */
    public void askForInput(String prompt){
        //ask user for whatever information needed
        System.out.println(prompt);

        keyboard = new Scanner(System.in);

        input = keyboard.nextLine();

        keyboard.close();
    }

    /**
     * Method to return input
     */
    public String returnInput(){
        return input;
    }
}