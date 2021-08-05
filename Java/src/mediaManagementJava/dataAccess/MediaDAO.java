package mediaManagementJava.dataAccess;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class MediaDAO<Medium> implements DAO<Medium> {

    private List<Medium> media;
    private final String data = "mediaList.txt";
    private Path dataFile;

    public MediaDAO() {
        this.dataFile = Path.of(data);
        this.media = new LinkedList<>();
        this.media = getAll();
    }

    @Override
    public Optional<Medium> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Medium> getAll() {
        String mediumString = null;
        try {
            mediumString = Files.readString(dataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return media;
    }

    @Override
    public void save(Medium medium) {
        String content = medium.toString();
        try {
            Files.writeString(dataFile, content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Medium medium, String[] params) {

    }

    @Override
    public void delete(Medium medium) {

    }
}
