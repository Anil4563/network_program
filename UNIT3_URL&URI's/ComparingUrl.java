import java.net.*;

public class ComparingUrl {
    public static void main(String[] args) {
        try {
            URI uri1 = new URI("https://example.com/index.html");
            URI uri2 = new URI("https://example.com/index.html");
            URI uri3 = new URI("https://example.com/home.html");

            // Corrected variable types (URL instead of URLDecoder)
            URL url1 = uri1.toURL();
            URL url2 = uri2.toURL();
            URL url3 = uri3.toURL();

            // Comparing URLs using sameFile()
            System.out.println("URL1 and URL2 are same: " + url1.sameFile(url2));
            System.out.println("URL1 and URL3 are same: " + url1.sameFile(url3));
        } catch (Exception e) {
            System.out.println("Error occured");
       
        }
    }
}
