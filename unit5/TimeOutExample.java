import java.io.*;
import java.net.*;

public class TimeOutExample {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com");
            URL url = uri.toURL();

            URLConnection connection = url.openConnection();

            connection.setConnectTimeout(5000);
            connection.setReadTimeout(3000);

            System.out.println("Connect Timeout:" + connection.getConnectTimeout() + " ms");
            System.out.println("Read Timeout:" + connection.getReadTimeout() + "ms");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println("Response:" + reader.readLine());
            reader.close();

        } catch (URISyntaxException e) {
            System.err.println("Invalid URI" + e.getMessage());
        } catch (SocketTimeoutException e) {
            System.out.println("Request timeout !");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
// using url connection object ,Wap in java that reads data from the server .
// Wap in java demonstrating the use of methods like
// getcontaintype,getcontentlength,getDate,getExpiration & getlastModified.;
// Wap tp retrive the header fields.
// WAP use of each modified sence and caches