import java.io.*;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;


public class GetRequestExample {
    public static void main(String[] args) throws Exception{
        try{
            String  baseUrl="https://jsonplaceholder.typicode.com/users";

            String param1=URLEncoder.encode("value1" ,"UTF-8");
            
            String param2=URLEncoder.encode("value2" ,"UTF-8");

            String fullUrl=baseUrl + "?param1=" + param1 + "&param2=" + param2;

            URI uri=new URI(fullUrl);
            URL url=uri.toURL();


            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestProperty("User-Agent" , "Mozilla/5.0");

            int responseCode =connection.getResponseCode();
            System.out.println("Response code :" +responseCode);

            BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputline;
            StringBuffer response =new StringBuffer();

            while((inputline = in.readLine()) !=null){
                response.append(inputline);

            }
            in.close();
            System.out.println("Reasponse from server:" + response.toString());

        
        
        }catch(Exception e){
            e.printStackTrace();
        }

        
    }
    
}
