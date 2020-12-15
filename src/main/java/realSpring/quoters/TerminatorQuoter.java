package realSpring.quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class TerminatorQuoter implements Quoter {


    @Setter
    private List<String> messages;

    public TerminatorQuoter(@Value("${terminator}") String[] messages) {
        this.messages = Arrays.asList(messages);
    }

    @Override
    public void sayQuote() {
            messages.forEach(System.out::println);
    }

    @PostConstruct
    public void init (){
        System.out.println("INIT");
    }
}
