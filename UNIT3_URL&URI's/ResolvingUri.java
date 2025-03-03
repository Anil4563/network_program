import java.net.*;
public class ResolvingUri {

    public static void main(String[] args) throws Exception{
        URI baseUri =new URI("https://example.com/");
        URI relativeUri=new URI ("blog/article.html");

        URI resolveUri =baseUri.resolve(relativeUri);
        System.out.println("Resolved Uri:" +resolveUri);
    }
    
}
