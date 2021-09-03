package mediaManagementJava.dataAccess;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    Optional<T> get(long id);

    List<T> getAll() throws IOException;

    void save(T t);

    void saveAll(List<T> t);

    void update(T t, String[] params);

    void delete(T t);
}
