import java.net.*;

public class RetrievingUrl{
    public static void main(String[] args) {
        try{
            URI uri=new URI("http://example.com/page.html?name=value#selction1");
            URL url=uri.toURL();
            System.out.println("URL:" + url);
            System.out.println("Protocol:" + url.getProtocol());
            System.out.println("Host:" + url.getHost());
            System.out.println("Path:" + url.getPath());
            System.out.println("Query:" + url.getQuery());
            System.out.println("Port:" + url.getPort());
            System.out.println("Fragment:" + url.getRef());


        }catch(Exception e){
            System.out.println("An error occured :"+ e.getMessage());
        }
        
    }
    
}
