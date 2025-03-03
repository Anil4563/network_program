import java.net.*;
import java.nio.charset.*;

public class URLEncoding {
    public static void main(String[] args) throws Exception{
        try{
            String filename="report #1.pdf";
            String encodedFilename= URLEncoder.encode(filename,StandardCharsets.UTF_8);
            
            String Sentence=("Hello  World! I am fit & healthy");
            String encodeSentence =URLEncoder.encode(Sentence,StandardCharsets.UTF_8);

            System.out.println("Orginal Filename:"+filename);
            System.out.println("Encoded Filename:"+encodedFilename);
            System.out.println("ENCODEsentence:"+encodeSentence);



        }catch( Exception e){
        System.out.println("An error occured:"+e.getMessage());
        
    }
    
}
}
