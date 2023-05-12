import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Class for a basic JFrame
 * 
 * A JFrame is typically used as the main window for an app. 
 * It comes with a title, borders and buttons
 * It can contain Swing components such as buttons and labels.
 *
 * @author Anthony Lopez
 * @version0 5.5.23 
 */
public class BasicFrame extends JFrame{
    private JFrame frameObject;
    private JLabel labelObject;
    
    private BasicPanel basicPanel;

    /**
     * Constructor 
     */
    public BasicFrame(){
        super();
        // instantiate the frame object
        frameObject = new JFrame("Newt");
        // add a panel
        basicPanel = new BasicPanel();
        add(basicPanel);
        // pack everything in
        pack();
        //

        //

        // make it visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    /**
     * Constructor with caller to add JPanel
     * This makes it much easier to work with the JPanel in the Main class
     */
    public BasicFrame(BasicPanel basicPanel){
        super();
        // instantiate the frame object
        frameObject = new JFrame("Newt");
        // add a panel
        add(basicPanel);
        // pack everything in
        pack();
        //

        //

        // make it visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}