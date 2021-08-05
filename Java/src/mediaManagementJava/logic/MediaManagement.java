package mediaManagementJava.logic;

import mediaManagementJava.dataAccess.DAOController;

import java.io.IOException;

public class MediaManagement {

    private final DAOController daoController;

    public MediaManagement() {
        daoController = new DAOController();
    }

    public String showAllMedia() throws IOException {
        String mediaString = "";
        for (Medium m : daoController.getAll()) {
            mediaString += m.toString() + "\n";
        }
        return mediaString;
    }
}
