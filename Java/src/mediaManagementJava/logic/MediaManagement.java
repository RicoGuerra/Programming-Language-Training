package mediaManagementJava.logic;

import mediaManagementJava.dataAccess.DAOController;

import java.util.LinkedList;
import java.util.List;

public class MediaManagement {
    private final DAOController daoController;
    private List<Medium> mediumList;

    public MediaManagement() {
        daoController = new DAOController();
        mediumList = new LinkedList<>();
    }

    public String showAllMedia() {
        String mediaString = "";
        mediumList = daoController.getAll();
        for (Medium m : mediumList) {
            mediaString += m.toString() + "\n";
        }
        return mediaString;
    }

    public void saveMedia() {
        //todo:
        //parameter must be provided

    }

    public void createNewMedium(Medium m) {
        //todo
    }
}
