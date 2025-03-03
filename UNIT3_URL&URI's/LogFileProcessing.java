import java.io.BufferedReader;
import java.io.FileReader;

public class LogFileProcessing {
    public static void main(String[] args) {
        String logFile = "server.log";

        try (BufferedReader br = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("200")) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Error processing logfile:" + e.getMessage());
        }
    }

}

// Define URL class .Wap to show the parts of the url
// Define URL connection class . WAP to read header using header specific
// methods
// Defferentiate between URI and URL classa with example
// Explain about URL and relative URL's.
// WAP to demonstrate the proxy class and the proxy selecetor class
// WAP to demonstrate authenticator class
// Briefly describe the URI class .WAP to contructing a URI
// How to achieve the URL encoder and decoder.Explain with example
// Describe about the different methods available in URL classes
// Describe about the different methods available in URI classes
// Write a code to demonstrate the authenticator class ,password authentication
// class and the j password field class
