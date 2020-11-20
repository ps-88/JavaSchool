package design_patterns.mail;

public class DistributionService {

    private int code;

    public void sendMail(){
        code = DBUtils.getMailCode();
        if(code==1){
            System.out.println("Welcome");
        } else if (code == 2) {
            System.out.println("don't call us");
        }
    }
}
