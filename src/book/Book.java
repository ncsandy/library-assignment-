package book;

public class Book {
    private String author;
    private String title;
    private static int inventory;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        inventory++;
    }

    public int getInventory() {
        System.out.println("======================================");
        System.out.print("The amount of books are in the library: ");
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public Book(){
        author = "";
        title = "";

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Author: " + author + '\'' +
                " Title: " + title + '\'';
    }
}
