import java.net.*;

public class ResolveInetAddress {
    public static void main(String[] args) {
        try {
            // Domain to resolve
            String host = "www.google.com";

            // Get all IP addresses for the given host
            InetAddress[] addresses = InetAddress.getAllByName(host);

            // Display IPv4 and IPv6 addresses separately
            System.out.println("Resolving IP addresses for: " + host);
            for (InetAddress address : addresses) {
                if (address instanceof Inet4Address) {
                    System.out.println("IPv4 Address: " + address.getHostAddress());
                } else if (address instanceof Inet6Address) {
                    System.out.println("IPv6 Address: " + address.getHostAddress());
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Error: Unable to resolve the host.");
            
        }
    }
}
