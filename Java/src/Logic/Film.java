package Logic;

public class Film extends Medium {
    private int lengthInMin;

    public Film(int lengthInMin, long id, String name) {
        super(id, name);
        this.lengthInMin = lengthInMin;
    }

    public int getLengthInMin() {
        return lengthInMin;
    }
}
