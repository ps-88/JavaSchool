package testt;

import java.util.ArrayList;
import java.util.List;

public class SpecialResources implements PersistedResource {


    @Override
    public List<PersistedResource> load() {
        ArrayList<PersistedResource> resources = new ArrayList<PersistedResource>();
//some logic here
        return resources;
    }

    @Override
    public void persist(List<PersistedResource> resources) {
        throw new UnsupportedOperationException();
    }
}
