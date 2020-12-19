package realSpring.qualifierExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static realSpring.qualifierExample.DBtype.MONGO;
import static realSpring.qualifierExample.DBtype.ORACLE;

@Service
public class MainService {


    @DRepo(ORACLE)
    private Dao mainDao;

    @DRepo(MONGO)
    private Dao backupDao;

    @Scheduled(fixedDelay = 1000)
    public void work () {
        System.out.println("working..");
        mainDao.saveAll();
    }

    @Scheduled(fixedDelay = 3000)
    public void backup () {
        System.out.println("backup...");
        backupDao.saveAll();
    }


}
