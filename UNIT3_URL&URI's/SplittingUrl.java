import java.net.*;

public class SplittingUrl {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("https://username:password@example.com:8080/blog/article.html?id=3");
        URL url = uri.toURL(); // Corrected from URLDecoding to URL

        System.out.println("Authority: " + url.getAuthority());
        System.out.println("File: " + url.getFile());
        System.out.println("User Information: " + url.getUserInfo());
    }
}
