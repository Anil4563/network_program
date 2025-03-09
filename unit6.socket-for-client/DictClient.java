import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;


public class DictClient {
    public static void main(String[] args) {
        String server ="dict.org";
        int port =2628;

        try ( Socket socket = new Socket(server,port)){
            socket.setSoTimeout(30000);


            Writer writer = new OutputStreamWriter(socket.getOutputStream(),StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),StandardCharsets.UTF_8));
            String  serverResponse = reader.readLine();
            if(!serverResponse.startsWith("22o")){
                System.err.println("Error:UNEXPECTED FROM SERVER :" + serverResponse);
return ;

            }

            writer.write("Show DB\r\n");
            writer.flush();

            System.out.println("Available database:");
String line;
while((line = reader.readLine())!=null){
    if(line.equals("."))
    break;
    System.out.println(line);

}
String word ="gold";
writer.write("DEFINE fd-eng-lat" +word +"\r\n");
writer.flush();
boolean definitionFound = false;
while((line=reader.readLine())!=null){
    if(line.startsWith("532")){
        System.out.println("No definition found for :" +word);
        break;
    }
    if (line.equals(".")){
        break;
    }
    if(line.matches("^\\d{5}.*")){
        definitionFound =true;
        System.out.println(line);

    }

    if(!definitionFound){
        System.out.println("No valid defination returned.");

    }
}
    writer.write("quit\r\n");
    writer.flush();
    
}catch(SocketTimeoutException e){
    System.out.println("Error:Server took too ling to respond ,Try agaiub kater .1");

}catch(IOException e){
    e.printStackTrace();
}

           
}
}
    


