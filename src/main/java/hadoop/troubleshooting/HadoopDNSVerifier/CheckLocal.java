package hadoop.troubleshooting.HadoopDNSVerifier;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckLocal {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(
                String.format(
                        "IP:%s hostname:%s canonicalName:%s", addr.getHostAddress(), addr.getHostName(), addr.getCanonicalHostName())
        );
    }
}
