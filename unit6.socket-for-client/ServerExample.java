import java.io.IOException;
import java.net.*;

public class ServerExample {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Please provide at least ome host name as as argument");
            return ;
        }
       for (String host :args){
        Socket theSocket =null;

    
        try{
            System.out.println("Attempting to  connect to " + host);
            theSocket =new Socket(host,80);
                System.out.println("Connected to " + theSocket.getInetAddress() +"on port" +theSocket.getPort() +"from port" +theSocket.getLocalPort() +"of" +theSocket.getLocalAddress());
        }catch(UnknownHostException ex){
            System.err.println("I cant find" +host);

        }catch(SocketException ex){
            System.err.println("Could not connect to " + host + ":" +ex.getMessage());

        }catch (IOException ex){
            System.err.println("I/O error :" +ex.getMessage());

        }finally {
            if(theSocket != null && !theSocket.isClosed()){
                try{
                theSocket.close();
                System.out.println("Socket to " +host + "closedsuccessfully.");
                }catch(IOException ex){
                    System.err.println("Error closing socket :" +ex.getMessage());
                }
            }
        }
    }
}
}
