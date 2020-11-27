package testt;

import java.util.List;

public interface PersistedResource {

    List<PersistedResource> load();
    void persist(List<PersistedResource> resources);

}
