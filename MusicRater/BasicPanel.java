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
    private Dimension panelSize;
    private Color backColor;

    private JLabel promptLabel;
    private JLabel responseLabel;
    
    private JTextField inputField;
    private JButton buttonObject;
    private JTextArea textHolder;
    private JScrollPane scrollObject;

    /**
     * Constructor for objects of class BasicPanel
     */
    public BasicPanel()
    {
        super();

        panelSize = new Dimension(300, 500);
        setPreferredSize(panelSize);

        setBackground(new Color(250,250, 200));

        //Label to prompt user alongside a JTextField
        promptLabel = new JLabel("Press the button to open file explorer.");
        add(promptLabel);

        //add new JTextField
        //inputField = new JTextField(20);
        //add(inputField);
        
        textHolder = new JTextArea(10, 10);
        scrollObject = new JScrollPane(textHolder);
        add(scrollObject);

        buttonObject = new JButton(" ");
        // buttonObject.addActionListener(new ButtonListener());
        add(buttonObject);
    }

    //private inner class
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            //String nameText = inputField.getText();
            remove(promptLabel);
            //remove(inputField);
            remove(buttonObject);
            repaint();

            responseLabel = new JLabel("File explorer opened.");
            add(responseLabel);
            //responseLabel.setText(nameText);

            OpenFileExplorer OFE = new OpenFileExplorer();
        }
    }
}

