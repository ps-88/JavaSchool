package realSpring.qualifierExample;


@DRepo(DBtype.ORACLE)
public class DaoImpl implements Dao {
    @Override
    public void saveAll() {
        System.out.println("save to Oracle");
    }
}
