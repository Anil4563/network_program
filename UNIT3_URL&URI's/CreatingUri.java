import java.net.*;
public class CreatingUri{
    public static void main(String[] args) throws Exception{

        try{
            URI uri=new URI("http://example.com/page.html");
        System.out.println("Uri:" +uri);

        }catch(Exception e){
            System.out.println("An error occured");
        }


        
    }


}

