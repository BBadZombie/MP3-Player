import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;

//imports for file operations
import java.io.File;
import java.util.HashSet;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 * Class for a basic JPanel
 * 
 * A JPanel doesnt contain what a JFrame comes with by default.
 * JPanels are more meant for grouping and organizing components.
 * Components such as buttons, labels and scroll functionality
 *
 * @author Anthony Lopez
 * @version0 5.5.23 
 */
public class BasicPanel extends JPanel
{
    private static Dimension panelSize;
    private static Color backColor;

    private static JLabel promptLabel;
    private static JLabel responseLabel;

    private static JTextField inputField;
    private static JButton buttonObject;
    private static JTextArea textArea;
    private static JScrollPane scrollObject;

    /**
     * Constructor for objects of class BasicPanel
     */
    public BasicPanel()
    {
        super();

        setPreferredSize(new Dimension(300, 500));
        setBackground(new Color(250,250, 200));

        //Label to prompt user
        promptLabel = new JLabel("Press to select a music folder:");
        add(promptLabel);

        textArea = new JTextArea();
        scrollObject = new JScrollPane(textArea);

        
        buttonObject = new JButton(" ");
        buttonObject.addActionListener(new ButtonListener0());
        add(buttonObject);

        add(scrollObject);
    }

    //inner classes
    private class ButtonListener0 implements ActionListener{
        private static String savedDirectory;
        private static String dialogTitle;
        private static File folder;
        private static HashSet<String> fileSet;

        private static JFrame jFrame;
        private static JFileChooser fileChooser;

        /**
         * Method to print the contents of the mainMusic folder
         */
        @Override
        public void actionPerformed(ActionEvent event){
            userSelectDirectory();
            folderPrinter();
        }

        /**
         * Constructor for class DirectorySave
         */
        public static void userSelectDirectory(){
            jFrame = new JFrame();
            fileChooser = new JFileChooser();

            dialogTitle = "Specify a file to save";
            fileChooser.setDialogTitle(dialogTitle);   
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int userSelection = fileChooser.showSaveDialog(jFrame);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                savedDirectory = fileToSave.getAbsolutePath();
                System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            }else{
                System.out.println("No file was saved");
            }
        }

        /**
         * Method to print the contents of the mainMusic folder
         */
        public static void folderPrinter() {
            folder = new File(savedDirectory);
            fileSet = new HashSet<>();

            //if the array isnt empty, print the contents
            if (fileSet != null) {
                for (String file : fileSet) {
                    //System.out.println(file);
                    textArea.append(file);
                }
            }else{
                System.out.println("isnt empty");
            }
        }
    }
}

