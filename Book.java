public class Book {
    private String title;
    private String author;
    private int fisrtEdition;

    public Book() {
        title = " ";
        author = " ";
        fisrtEdition = 0;
    }

    public void setTitle(String t) {
        title = t; 
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setFirstEdition(int f) {
        fisrtEdition = f;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getFirstEdition() {
        return fisrtEdition;
    }
}