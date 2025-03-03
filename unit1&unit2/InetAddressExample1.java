import java.net.*;

public class InetAddressExample1 {
    public static void main(String[] args) {
        try {
            // 1. Get the local host information
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local Host Address: " + localHost.getHostAddress());

            // 2. Get the IP address of a specific website
            InetAddress website = InetAddress.getByName("www.google.com");
            System.out.println("\nGoogle Host Name: " + website.getHostName());
            System.out.println("Google Host Address: " + website.getHostAddress());

            // 3. Get all IP addresses associated with a domain
            InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
            System.out.println("\nAll IP addresses of Google:");
            for (InetAddress addr : addresses) {
                System.out.println(addr.getHostAddress());
            }

        } catch (UnknownHostException e) {
            System.out.println("Error: Unable to get InetAddress information.");
            
        }
    }
}
