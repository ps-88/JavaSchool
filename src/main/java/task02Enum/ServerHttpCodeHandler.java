package task02Enum;

public class ServerHttpCodeHandler implements HttpHandler {

    @Override
    public void handle() {
        System.out.println("server was handled...");
    }
}
