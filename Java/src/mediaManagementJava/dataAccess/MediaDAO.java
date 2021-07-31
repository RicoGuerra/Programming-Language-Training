package mediaManagementJava.dataAccess;

import java.util.*;

public class MediaDAO<Medium> implements DAO<Medium>{

    private List<Medium> media;

    public MediaDAO() {
        this.media = new LinkedList<>();
        this.media = getAll();
    }

    @Override
    public Optional<Medium> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Medium> getAll() {
        return null;
    }

    @Override
    public void save(Medium medium) {

    }

    @Override
    public void update(Medium medium, String[] params) {

    }

    @Override
    public void delete(Medium medium) {

    }
}
