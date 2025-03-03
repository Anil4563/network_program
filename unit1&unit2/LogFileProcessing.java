import java.io.*;

public class LogFileProcessing {
   public static void main(String[] args) {
    String logFile="server.log";

    try (BufferedReader br=new BufferedReader(new FileReader(logFile))){
        String line;
        while((line= br.readLine())!=null){
            if(line.contains("200")){
                System.out.println(line);
            
            }
        }
    
    }catch (Exception e){
        System.out.println("Error Processing logfile"+e.getMessage());
    }

   } 
}
 //What is the use of inet ADREESS CLASS.Explain the basic features of inet class
 //What is the use of Inet4 address class, Explain with the suitable example
 //What is the use of Inet6 address class, Explain with the suitable example
 // How do you performed the testing reachibility.Explain with Example .
 //Explain about NetworkInterface class with suitable program
 //What is the use of inet address class . wap to recruit the ip and mac address.
 //Write a program to show the ip and mac address of the system and also check if the ip address is ipv4 and ipv6