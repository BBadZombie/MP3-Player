import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * This class will contain a method to automatically download songs from a youtube playlist
 *
 * @author Anthony Lopez
 * @version5 5.5.23
 * 
 * Notes for 5.5.23:
 *  - I plan on reformatting this class with a gui interface in mind
 *  - Therefore for things like format and audio quality I will not need to
 *    check if user input works
 *  - Instead I will have a list of options presented to the user 
 */
public class Downloader
{
    ProcessBuilder processBuilder;
    Process processObject;
    Process pObjectGetStream;
    InputStreamReader inputStreamReader;
    BufferedReader bufferedReader;

    String cmdCommand;
    String dlpCommand;
    String line;

    /**
     * Constructor for objects of class rawDownloader
     */
    public Downloader()
    {
        
    }

    /**
     * Modified 3/24/23 to use yt-dlp instead of youtube-dl. Also added audio quality modifier, though user doesn't choose. It's set to highest quality.
     * 
     * Notes for 4.28.23:
     *  - I want to modify this class to where it only downloads. And the console printing is either part of a different class or method.
     */
    public void dlpInteract(String directory, String url) {
        try {
            //class that interacts with Windows OS CLI (command line interface) to access yt-dlp 
            //arguments are then passed onto yt-dlp
            processBuilder = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\Users\\Anthony\\Music\\youtube-dl\" && yt-dlp -x --audio-format mp3 --audio-quality 0 " 
                + directory 
                + url);

            //starts processBuilder and assigns it to new Process object
            Process processObject = processBuilder.start();

            //redirects error output to stream
            processBuilder.redirectErrorStream(true);
            
            InputStream processStream = processObject.getInputStream();

            inputStreamReader = new InputStreamReader(processStream);
            
            //displays youtube-dl output into java console
            bufferedReader = new BufferedReader(inputStreamReader);

            //As long as yt-dlp is outputing information this block will run and output it to java console
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            } while (line != null);
        } catch (Exception e) {
            System.out.println("Lol");
        }
    }

}
