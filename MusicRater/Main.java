
/**
 * Newt is a program that will be used for downloading and organizing music
 * It will contain the following classes:
 *  - UserPrompt. Class for prompting user. Will contain methods to:
 *    - Prompt a user for desired information - askForInput()
 *    - Return user input - returnInput()
 *    
 *  - Downloader. Class for interacting with Windows CML and yt-dlp. Will contain methods to:
 *    - 
 *
 * @author Anthony Lopez
 * @version0 4.28.23
 */
public class Main
{
    private static UserPrompt userPrompt;
    
    
    /**
     * Main method of project
     */
    public static void main(String[] args){
        userPrompt = new UserPrompt();
    }
}
