package mediaManagementJava.logic;

public class Film extends Medium {
    private int lengthInMin;

    public Film(int lengthInMin, long id, String name, String artist) {
        super(id, name, artist);
        this.lengthInMin = lengthInMin;
    }

    public int getLengthInMin() {
        return lengthInMin;
    }

    @Override
    public String toString() {
        return super.toString() + ", length: " + getLengthInMin() + " min." + "\n";
    }
}
