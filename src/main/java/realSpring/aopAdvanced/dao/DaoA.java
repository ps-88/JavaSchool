package realSpring.aopAdvanced.dao;

import org.springframework.stereotype.Repository;
import realSpring.aopAdvanced.services.DBRuntimeException;

@Repository
public class DaoA {

    public void save() {
        System.out.println("trying to save");
        throw new DBRuntimeException("DBA EXCEPTION");
    }
}
