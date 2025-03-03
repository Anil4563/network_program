import java.net.*;

public class ReachabilityTest {
    public static void main(String[] args) {
        try {
            // Specify the host to check
            String host = "www.google.com";  // You can change this to any other domain or IP
            InetAddress inetAddress = InetAddress.getByName(host);

            // Set the timeout in milliseconds (e.g., 5000ms = 5 seconds)
            int timeout = 5000;

            // Perform the reachability test
            boolean reachable = inetAddress.isReachable(timeout);

            // Display results
            System.out.println("Host: " + host);
            System.out.println("IP Address: " + inetAddress.getHostAddress());
            if (reachable) {
                System.out.println("host reachable.");
            } else {
                System.out.println(" host not reachable.");
            }
        } catch (Exception e) {
            System.out.println("Error: Unable to perform the reachability test.");
            
        }
    }
}
