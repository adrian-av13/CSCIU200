//Adrian Alamilla-Vega
//CSCI U200 Lab 11
//04-17-23
//This algorithm is an example of reading a file. Using buffer and string manipulation.
//Announces the South Carolina weather headlines.
import java.io.*;
import java.net.*;
import java.net.ConnectException;
public class Lab11 {
    public static void main(String[] arg) {
        try {
            URL url= new URL("https://api.weather.gov/alerts/active?area=SC");
            URLConnection connection=url.openConnection();
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while((line=input.readLine()) != null) {
                line = line.trim();
                String[] arr = line.split(":");
                if(arr[0].equals("\"headline\"")) {
                    System.out.println(line.substring(13,line.length()-2));
                }
            }
            input.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("The file was not found.");
        }
        catch (ConnectException e) {
            System.out.println(("Connection Error with website."));
        }
        catch(IOException e) {
            System.out.println("IO error. Was not able to read from file.");
        }
    }
}
