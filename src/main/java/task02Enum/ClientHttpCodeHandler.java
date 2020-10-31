package task02Enum;

public class ClientHttpCodeHandler implements HttpHandler {

    @Override
    public void handle() {
        System.out.println("client was handled...");
    }
}

