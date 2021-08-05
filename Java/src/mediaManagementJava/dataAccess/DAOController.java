package mediaManagementJava.dataAccess;

import mediaManagementJava.logic.Medium;

import java.io.IOException;
import java.util.List;

public class DAOController {
    private MediaDAO mediaDAO;

    public DAOController() {
        this.mediaDAO = new MediaDAO();
    }

    public List<Medium> getAll() throws IOException {
        return mediaDAO.getAll();
    }
}
