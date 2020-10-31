package task02Enum;

public class RedirectionHttpCodeHandler implements HttpHandler {

    @Override
    public void handle() {
        System.out.println("redirection was handled...");
    }
}
