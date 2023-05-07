public class Book {
    private String name;
    private String authorName;
    private int yearPublished;

    public Book(String name, String authorName, int yearPublished) {
        this.name = name;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book name: " + name  +
                "\nAuthorName: " + authorName  +
                "\nYearPublished: " + yearPublished ;
    }
}
