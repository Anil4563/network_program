import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class usrCachesExample{
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com");
            URL url = uri.toURL();
            URLConnection uc = url.openConnection();

            uc.setUseCaches(false);
            BufferedReader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) { // Fixed readLine() typo
                System.out.println(line);
            }
            reader.close();

        } catch (URISyntaxException e) {
            System.out.println("Invalid URI: " + e.getMessage());
        } catch (IOException e) { 
            e.printStackTrace();
        }
    }
}
