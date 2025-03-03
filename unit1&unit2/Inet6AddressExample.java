import java.net.*;

public class Inet6AddressExample {
    public static void main(String[] args) throws Exception {
        InetAddress address = Inet6Address.getByName("www.facebook.com");
        System.out.println("IPV6:" + address.getHostAddress());
        System.out.println("ISIBV6:" + (address instanceof Inet6Address));

    }

}

