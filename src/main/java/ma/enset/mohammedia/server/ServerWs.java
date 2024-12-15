package ma.enset.mohammedia.server;

import jakarta.xml.ws.Endpoint;
import ma.enset.mohammedia.ws.BanqueService;

public class ServerWs {
    private final static String URL = "http://localhost:8080/";

    public static void main(String[] args) {
        Endpoint.publish(URL, new BanqueService());
        System.out.println("Server ready on " + URL);
    }
}
