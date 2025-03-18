import java.net.Socket;

import java.net.*;
public class ConnectionDetailsExample {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("www.google.com",80);
            SocketAddress remoteAddress= socket.getRemoteSocketAddress();
            SocketAddress localAddress=socket.getLocalSocketAddress();

            System.out.println("Remote (Server) Address:" +remoteAddress);
            System.out.println("Local(Client)Address:" +localAddress);


            socket.close();

        }catch(Exception e){
            System.err.println("Error" +e.getMessage());
        }
    }
    
}
