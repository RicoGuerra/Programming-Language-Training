package Logic;

public class Song extends Medium {
    private int lenghtInSec;

    public Song(int lenghtInSec, long id, String name, String artist) {
        super(id, name, artist);
        this.lenghtInSec = lenghtInSec;
    }

    public int getLenghtInSec() {
        return lenghtInSec;
    }

    @Override
    public String toString() {
        return super.toString() + ", length: " + getLenghtInSec() + " sec.";
    }
}
