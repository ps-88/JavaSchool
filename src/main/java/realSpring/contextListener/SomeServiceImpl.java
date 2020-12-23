package realSpring.contextListener;

import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService {

    @Override
    @PostProxyConstruct
    @Retryable
    public void abc() {
        System.out.println(123);
    }

//    @PostProxyConstruct
//    public void xyz(){
//        System.out.println("xyz");
//    }
}
