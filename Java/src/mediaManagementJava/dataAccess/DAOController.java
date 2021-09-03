package mediaManagementJava.dataAccess;

import mediaManagementJava.logic.Medium;

import java.util.List;

public class DAOController {
    private MediaDAO mediaDAO;

    public DAOController() {
        this.mediaDAO = new MediaDAO();
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
