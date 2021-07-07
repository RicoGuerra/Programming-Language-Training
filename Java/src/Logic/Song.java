package Logic;

public class Song extends Medium {
    private int lenghtInSec;

    public Song(int lenghtInSec, long id, String name) {
        super(id, name);
        this.lenghtInSec = lenghtInSec;
    }

    public int getLenghtInSec() {
        return lenghtInSec;
    }
}
