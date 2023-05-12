import java.io.File;
import javax.swing.JFrame;
import javax.swing.JFileChooser;

/**
 * Write a description of class ListStuff here.
 *
 * @author Anthony Lopez
 * @version 2.12.23
 */
public class FileOperations
{
    String savedDirectory;
    String dialogTitle;
    File folder;
    String[] files;

    JFrame frame;
    JFileChooser fileChooser;

    /**
     * Constructor for class FileOperations
     */
    public FileOperations(){
        dialogTitle = "Specify a file to save";
    }

    /**
     * Constructor for class DirectorySave
     */
    public void userSelectDirectory(){
        frame = new JFrame();
        fileChooser = new JFileChooser();

        fileChooser.setDialogTitle(dialogTitle);   
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int userSelection = fileChooser.showSaveDialog(frame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            savedDirectory = fileToSave.getAbsolutePath();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }else{
            System.out.println("No file was saved");
        }
    }

    /**
     * Method to return savedDirectory
     */
    public String getDirectory(){
        return savedDirectory;
    }

    /**
     * Method to print the contents of the mainMusic folder
     */
    public void folderPrinter() {
        folder = new File(savedDirectory);
        files = folder.list();

        //if the array isnt empty, print the contents
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}