package task02Enum;

public class SuccessHttpCodeHandler implements HttpHandler {

    @Override
    public void handle() {
        System.out.println("success was handled...");
    }
}
