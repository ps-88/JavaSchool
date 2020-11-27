package testt;

import java.util.List;

public class main {

    public static void main(String[] args) {

            SettingsServiceImpl service = new SettingsServiceImpl();

            List<PersistedResource> resources = service.load();
            //some operations with resources
            service.persist(resources);
        }


}
