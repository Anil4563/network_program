import java.net.InetAddress;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println(address);
            System.out.println("Hostname:" + address.getHostName());
            System.out.println("Hostaddress:" + address.getHostAddress());
            System.out.println("Hostname:" + address.hashCode());
            System.out.println("Hostname_string:" + address.toString());
            System.out.println();
        }

        catch (Exception e) {
            System.out.println("Error occurred");

        }

    }
}