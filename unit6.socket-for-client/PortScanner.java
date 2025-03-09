import java.net.*;
import java.io.*;
public class PortScanner {

    public static void main(String[] args) {
        String host = args.length>0?args[0]:"localhost";

        for(int i=1; i<1020; i++){
        try(Socket s = new Socket(host, i)){
            System.out.println("Server Detected on port" + i +"of"+host);

        }catch(UnknownHostException ex){
            System.out.println("Unknown host:" + ex.getMessage());
            break;

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
}
