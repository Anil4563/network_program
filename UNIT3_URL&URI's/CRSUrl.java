import java.net.*;

public class CRSUrl {
    public static void main(String[] args)throws Exception {
            //creating url
            System.out.println("Creating url:");
            URI uri = new URI("https://example.com/page.html");
            URL url = uri.toURL();
            System.out.println("URL:"+url);

            //Retrieving url
            System.out.println("\nRetrieving url:");
            URI uri1 = new URI("https://example.com:8080/report#1.pdf");
            URL url1 = uri1.toURL();
            System.out.println("URL:" +uri1);
            System.out.println("Protocol:" +url1.getProtocol());
            System.out.println("Host:" +url1.getHost());
            System.out.println("Path:" +url1.getPath());
            System.out.println("Query:" +url1.getQuery());
            System.out.println("Port:" +url1.getPort()); 
            System.out.println("Fragments:" +url1.getRef());

            //splitting url
            System.out.println("\nSplitting url:");
            URI uri2 = new URI("https://username:password@example.com/bolg/article.html?id=3");
            URL url2 = uri2.toURL();
            System.out.println("Authority:"+url2.getAuthority());
            System.out.println("File:"+ url2.getFile());
            System.out.println("User information:"+url2.getUserInfo());
        
    }
    
}