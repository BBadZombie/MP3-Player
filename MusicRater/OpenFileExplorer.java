import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * Trying to open different apps
 *
 * @author Anthony Lopez
 * @version0 5.5.23
 */
public class OpenFileExplorer
{
    File file;
    Desktop desktop;

    /**
     * Contstructor for class appOpener
     */
    public OpenFileExplorer(){
        file = new File("C:");
        desktop = desktop.getDesktop();
        
        try{
            desktop.open(file);
        }catch(IOException e){
            System.out.println("Lol");
        }
    }
}
