package Logic;

public class Book extends Medium {
    private int pages;

    public Book(int pages, long id, String name, String artist) {
        super(id, name, artist);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return super.toString() + ", pages: " + getPages();
    }
}
