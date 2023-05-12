import javax.swing.JTextArea;
import javax.swing.JScrollPane;

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
    static private UserPrompt userPrompt;
    static private Downloader downloader;
    
    static private String urlPrompt = "Input URL from which to download it from";
    static private String directoryPrompt = "Input directory to download to";
    
    static private BasicFrame basicFrame;
    static private BasicPanel basicPanel;
    static private FileOperations fileOperations;
    
    //fields to be added to basicPanel through basicFrame
    
    /**
     * Main method of project
     */
    public static void main(String[] args){
        basicPanel = new BasicPanel();
        basicFrame = new BasicFrame(basicPanel);
        
        //BasicPanel.userSelectDirectory();
        //String directory = fileOperations.getDirectory();
        //basicFrame.revalidate();
        //basicFrame.repaint();
        
    }
}
