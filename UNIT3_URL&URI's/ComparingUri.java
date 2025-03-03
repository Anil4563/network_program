import java.net.*;

public class ComparingUri {
    public static void main(String[] args) throws Exception {
        URI uri1 = new URI("http://example.com");
        URI uri2 = new URI("http://example.com");

        System.out.println("URI1 and URI2 are same:" + uri1.equals(uri1));
        System.out.println("URI1 and URI3 are same:" + uri2.equals(uri2));
    }

}
