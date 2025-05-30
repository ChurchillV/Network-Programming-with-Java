package Basic_Network_Apps.Get_IP_Address;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Get_IP_Address {
    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress testwebsite = InetAddress.getByName("https://www.google.com");
        System.out.println("HOST NAME               :   " + testwebsite.getHostName());
        System.out.println("CANONICAL HOST NAME     :   " + testwebsite.getCanonicalHostName());
        System.out.println("HOST ADDRESS            :   " + testwebsite.getHostAddress());

        System.out.println("STATUS                  :   " + testwebsite.isReachable(10000));
    }
}