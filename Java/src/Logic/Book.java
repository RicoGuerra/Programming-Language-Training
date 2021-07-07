package Logic;

public class Book extends Medium {
    private int pages;

    public Book(int pages, long id, String name) {
        super(id, name);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
}
