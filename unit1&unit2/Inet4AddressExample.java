import java.net.*;

public class Inet4AddressExample {
    public static void main(String[] args) throws Exception {
        InetAddress address = Inet4Address.getByName("www.facebook.com");
        System.out.println("IPV4:" + address.getHostAddress());
        System.out.println("ISIBV4:" + (address instanceof Inet4Address));

    }

}
