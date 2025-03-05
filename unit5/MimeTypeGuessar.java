import java.net.URLConnection;

public class MimeTypeGuessar {
    public static void main(String[] args) {
        String filepath="anil.pdf";
        String mimeTypeByName =URLConnection.guessContentTypeFromName(filepath);

        System.out.println("MIME Type(by file name):"+mimeTypeByName);
    }

    
}
