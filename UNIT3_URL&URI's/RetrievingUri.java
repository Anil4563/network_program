import java.net.*;

public class RetrievingUri {

    public static void main(String[] var0) throws Exception {
        try {
            URI uri = new URI("http://example.com:8000/report#1.pdf");

            System.out.println("URI:" + String.valueOf(uri));
            System.out.println("Authority:" + uri.getAuthority());
            System.out.println("Protocal:" + uri.getScheme());
            System.out.println("Host:" + uri.getHost());
            System.out.println("Path:" + uri.getPath());
            System.out.println("Query:" + uri.getQuery());
            System.out.println("Port:" + uri.getPort());

        } catch (Exception uri2) {
            System.out.println("An error occured :" + uri2.getMessage());
        }

    }
}



