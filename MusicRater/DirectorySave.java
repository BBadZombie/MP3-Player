import javax.swing.JFrame;
import javax.swing.JFileChooser;
import java.io.File;

public class DirectorySave{
    private JFrame parentFrame;
    private JFileChooser fileChooser;
    private String savedDirectory;
    
    private String dialogTitle;
    
    /**
     * Constructor for class DirectorySave
     */
    public DirectorySave(){
        parentFrame = new JFrame();

        fileChooser = new JFileChooser();
        dialogTitle = "Specify a file to save";
        fileChooser.setDialogTitle(dialogTitle);   

        int userSelection = fileChooser.showSaveDialog(parentFrame);

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
    public String getSavedFile(){
        return savedDirectory;
    }
}