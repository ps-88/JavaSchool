package realSpring.aopAdvanced.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realSpring.aopAdvanced.dao.DaoA;

@Service
public class ServiceB {
    @Autowired
    private DaoA dao;

    public void doB() {
        System.out.println("BBBB");
        dao.save();
    }
}
