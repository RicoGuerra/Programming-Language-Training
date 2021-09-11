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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", " + name + " by " + artist;
    }
}
