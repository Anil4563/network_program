import java.net.*;
import java.nio.charset.StandardCharsets;

public class URLDecoding {
    public static void main(String[] args)throws Exception {
      try{
         String encodedFilename = "report+%231.pdf";
         String decodedFilename = URLDecoder.decode(encodedFilename, StandardCharsets.UTF_8);

         System.out.println(" Encode Filename :" +encodedFilename);
         System.out.println(" Decoded Filename:" +decodedFilename);

     }catch(Exception e){
         System.out.println("An error occured :" +e.getMessage());

     }

        
    }
    
}
