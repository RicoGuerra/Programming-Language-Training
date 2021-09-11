package mediaManagementJava.logic;

import mediaManagementJava.dataAccess.DAOController;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MediaManagement {
    private final DAOController daoController;
    private List<Medium> mediumList;

    public MediaManagement() {
        daoController = new DAOController();
        mediumList = new LinkedList<>();
        mediumList = daoController.getAll();
    }

    public String showAllMedia() {
        String mediaString = "";
        mediumList = daoController.getAll();
        for (Medium m : mediumList) {
            mediaString += m.toString();
        }
        return mediaString;
    }

    public void saveMedia(Medium m) {
        daoController.save(m);
    }

    public void createNewMedium(int length, String name, String artist, MediaType mediumType) {
        Long newId = Collections.max(DAOController.getIds());
        if (mediumType == MediaType.Book) {
            saveMedia(new Book(length, newId + 1, name, artist));
        } else if (mediumType == MediaType.Film) {
            saveMedia(new Film(length, newId + 1, name, artist));
        } else if (mediumType == MediaType.Song) {
            saveMedia(new Song(length, newId + 1, name, artist));
        }
    }
}
