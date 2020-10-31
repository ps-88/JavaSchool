package task02Enum;

public class InfoHttpCodeHandler implements HttpHandler {

    @Override
    public void handle() {
        System.out.println("info was handled...");
    }
}