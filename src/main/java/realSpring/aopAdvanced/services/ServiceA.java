package realSpring.aopAdvanced.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    @Autowired
    private ServiceB serviceB;

    public void doA() {
        System.out.println("AAAA");
        try {
            serviceB.doB();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry");
        }
        System.out.println("continue..");
    }
}
