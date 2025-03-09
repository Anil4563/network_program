import java.io.*;
import java.net.*;
public class ReadFromServer {
    public static void main(String[] args) {

        String somehost="example.com";
        int someport=80;
        try{
            Socket socket =new Socket(somehost, someport);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream pstream = new PrintStream(socket.getOutputStream());
            pstream.println("Get/HTTP/1.1");
            pstream.println("Host:"+somehost);
            pstream.println("Connection:close");
            pstream.println();

            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}
