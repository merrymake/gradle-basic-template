package eu.merrymake.template.java;

import eu.merrymake.service.java.MimeType;
import org.json.JSONObject;

import eu.merrymake.service.java.Merrymake;

public class App {

    static void handleHello(byte[] payloadBytes, JSONObject envelope) {
        String payload = new String(payloadBytes);
        Merrymake.replyToOrigin(String.format("Hello, %s!", payload), MimeType.txt);
    }

    public static void main(String[] args) {
        Merrymake.service(args)
                .handle("handleHello", App::handleHello);
    }
}
