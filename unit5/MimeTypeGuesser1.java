import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MimeTypeGuesser1 {
    public static void main(String[] args) {
        String filePath="anil.pdf";

        try{
            Path path = Paths.get(filePath);
            String mimeType= Files.probeContentType(path);
            System.out.println("MIME Type(by file content)" +mimeType);
        }catch(IOException e){
            System.out.println("Errir determining Mime Type:" +e.getMessage());
        }
    }
}



//what is url . components of url
//wap to downlaod a page and read its properties.
//what is url connection ?  Explain the basic steps to use the url  connection class 
//and write a suitable program sample?
//how do you read data from server . exolain with an example.
//Mention the methods to retrive  specific mime header field. wap  to read url showing the methods to print their content type, content length,contentencoding,dateoflastmodification ,expirationdate and current date.
//How can we retrive orbitary header fields .  write about web cache for java 
//Write shoirt notes on a,web cache  for java ,b.protected instance fields in url connection class c.protected url,connected ,allow user interaction.
//Explain about the security consideration for url connection
//what is proxy and streaming mode 
