package realSpring.quoters;

import lombok.Setter;
import mySpring.InjectByType;
import mySpring.InjectRandomInt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component

public class ShakespeareQuoter implements Quoter {

    @Value("${shake}")
    private String message;

    @InjectRandomInt (min = 4,max = 6)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {

            System.out.println(message);

        }
    }

    @PostConstruct
    public void init(){
        System.out.println("repeat = " + repeat);
    }
}
