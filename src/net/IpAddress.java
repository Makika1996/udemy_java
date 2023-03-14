package net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Lernziel: IP-Addressen, Namensauflösung, Erreichbarkeit
 * - `InetAddress` und Unterklassen
 */

public class IpAddress {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddress = InetAddress.getByName("tutego.de");
        System.out.println(inetAddress);
        System.out.println(inetAddress.isReachable(1000));
    }
}
