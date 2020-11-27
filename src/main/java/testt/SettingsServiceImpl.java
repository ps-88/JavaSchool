package testt;

import java.util.List;

public class SettingsServiceImpl implements PersistedResource{



    @Override
    public List<PersistedResource> load() {
        System.out.println("SettingsServiceImpl  loadAll");
        return null;
    }

    @Override
    public void persist(List<PersistedResource> resources) {
        System.out.println("SettingsServiceImpl  saveAll");
    }


}
