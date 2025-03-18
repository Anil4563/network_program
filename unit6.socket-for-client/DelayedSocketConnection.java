import java.io.*;
import java.net.*;
public class DelayedSocketConnection {

    public static void main(String[] args) {
        Socket socket= new Socket();
        SocketAddress address = new InetSocketAddress("timeout.nist.goc",13);
        try{
            System.out.println("Connecting to the time server ...");
            socket.connect(address,50000);
            System.out.println("Connected");


            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverTime;
            while((serverTime=reader.readLine())!=null){
                System.out.println("Server Time :"+serverTime);

            }
            reader.close();
            socket.close();

        }catch(IOException e){
            System.out.println("Connection Failed:" +e.getMessage());
        }
    }
    
}
