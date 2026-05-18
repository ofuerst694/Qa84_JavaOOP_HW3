public class Book /*extends Object*/ {
    private String title;
    private String author;
    private int pages;
    private int isbn;

    public Book(){}

    public Book(String title, String author, int pages, int isbn) {
        super();
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null)
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null)
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0)
        this.pages = pages;
    }

    public int getIsbn() {
        return isbn;
    }


    public void setIsbn(int isbn) {
        if (isbn > 0)
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        String str = "Author: " + this.author +
                "\nTitle: " + this.title +
                "\nPages: " + this.pages  +
                "\nISBN: " + this.isbn;
        return str;
    }
}
