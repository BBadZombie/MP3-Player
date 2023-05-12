
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
 * 
 * 
 */
public class Main
{
    static UserPrompt userPrompt;
    static Downloader downloader;
    
    static String urlPrompt = "Input URL from which to download it from";
    static String directoryPrompt = "Input directory to download to";
    
    /**
     * Main method of project
     */
    public static void main(String[] args){
        //prompting user for info, saving it
        userPrompt = new UserPrompt();
        
        userPrompt.askForInput(urlPrompt);
        String url = userPrompt.returnInput();
        
        userPrompt.askForInput(directoryPrompt);
        String directory = userPrompt.returnInput();
        
        //downloading based off user input
        downloader = new Downloader();
        
        downloader.dlpInteract(directory, url);
        
    }
}
