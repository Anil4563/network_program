import java.net.*;

public class ConvertingUrl {
    public static void main(String[] args) throws Exception {

        URI uri = new URI("http://example.com:8080/blog/article.html");

        // Corrected from URLDecoding to URL
        URL url = uri.toURL();

        System.out.println("To string: " + url.toString());
        System.out.println("To External form: " + url.toExternalForm());
    }
}
