package mediaManagementJava.dataAccess;

import mediaManagementJava.logic.Medium;

import java.util.List;
import java.util.stream.Collectors;

public class DAOController {
    private static MediaDAO mediaDAO;

    public DAOController() {
        this.mediaDAO = new MediaDAO();
    }

    public static List<Long> getIds() {
        List<Medium> media = mediaDAO.getAll();
        return media.stream().map(Medium::getId).collect(Collectors.toList());
    }

    public List<Medium> getAll() {
        return mediaDAO.getAll();
    }

    public void save(Medium medium) {
        mediaDAO.save(medium);
    }

    public void saveAll(List<Medium> mediumList) {
        mediaDAO.saveAll(mediumList);
    }
}
