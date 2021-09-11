package mediaManagementJava.dataAccess;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class MediaDAO<Medium> implements DAO<Medium> {

    private final String data = "mediaList.txt";

    public MediaDAO() {
    }

    @Override
    public Optional<Medium> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Medium> getAll() {
        List<Medium> media = new LinkedList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(data);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            media = (List<Medium>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return media;
    }

    @Override
    public void saveAll(List<Medium> media) {
        ObjectOutputStream objectOutputStream;
        try (FileOutputStream fileOutputStream = new FileOutputStream(data)) {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(media);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Medium medium) {
        List<Medium> media = getAll();
        List<Long> idList = DAOController.getIds();
        Long maxId = Collections.max(idList);
        media.add(medium);
        saveAll(media);
    }

    @Override
    public void update(Medium medium, String[] params) {
        //todo
    }

    @Override
    public void delete(Medium medium) {
        //todo
    }
}
