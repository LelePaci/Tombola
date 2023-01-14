package com.lelepaci.connection;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ConnectionUtils {
    public static String getCurrentPublicIP() throws IOException {
            URL ip = new URL("http://checkip.amazonaws.com/");
            Scanner scanner = new Scanner(ip.openStream());
            scanner.useDelimiter("\u001a");
            return scanner.next();
    }
}
