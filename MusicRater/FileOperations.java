import java.io.File;
import javax.swing.JFileChooser;

/**
 * Write a description of class ListStuff here.
 *
 * @author Anthony Lopez
 * @version 2.12.23
 */
public class FileOperations
{
    String[] files;
    File folder;
    
    JFileChooser fileSelector;
    
    /**
     * Constructor for class FileOperations
     */
    public FileOperations(){
        
    }
    
    /**
     * Method to select folder and save its directory
     */
    public void folderSelect(){
        fileSelector = new JFileChooser();
        
        fileSelector.showSaveDialog(null);
    }
    
    /**
     * Method to print the contents of the mainMusic folder
     */
    public void folderPrinter() {
        {
            folder = new File("C:\\Users\\Anthony\\Music\\mainMusic");
            files = folder.list();
            
            //if the array isnt empty, print the contents
            if (files != null) {
                for (String file : files) {
                    System.out.println(file);
                }
            }
        }
    }
}