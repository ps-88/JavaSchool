package realSpring.qualifierExample;

@DRepo(DBtype.MONGO)
public class BackupDao implements Dao {
    @Override
    public void saveAll() {

        System.out.println("save to Mongo");
    }
}
