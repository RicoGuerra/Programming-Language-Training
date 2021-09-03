package mediaManagementJava.logic;

import java.io.Serializable;

public abstract class Medium implements Serializable {
    private Long id;
    private String name;
    private String artist;

    public Medium(Long id, String name, String artist) {
        this.id = id;
        this.name = name;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", " + name + " by " + artist;
    }
}
