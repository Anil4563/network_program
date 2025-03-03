import java.net.*;

public class CreatingUrl{
    public static void main(String[] args) {
        try{
            URI uri=new URI("http://example.com/page.html");
            URL url=uri.toURL();
            System.out.println("URL:"+url);

        }catch(Exception e){
            System.out.println("An error occured :"+ e.getMessage());
        }
        
    }
    
}