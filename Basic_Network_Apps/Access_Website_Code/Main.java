package Basic_Network_Apps.Access_Website_Code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection myConnection = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(myConnection.getInputStream()));
            String myLine;

            while ((myLine = br.readLine()) != null) {
                System.out.println(myLine);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
