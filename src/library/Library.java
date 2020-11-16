package library;

import book.Book;

public class Library extends Book {

    public Library(){

    }


    static Book b1 = new Book("N/A","Hatchet");
    static Book b2 = new Book("N/A","The Giver");
    static Book b3 = new Book ("N/A","Of Mice and Men");



    public static Book getB1() {

        return b1;
    }

    public void setB1(Book b1) {
        this.b1 = b1;
    }

    public static Book getB2() {

        return b2;
    }

    public void setB2(Book b2) {
        this.b2 = b2;
    }

    public static Book getB3() {

        return b3;
    }

    public void setB3(Book b3) {
        this.b3 = b3;

    }

    public void getBooks() {
        Book[] books = new Book[3];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
       System.out.println(getInventory());
        System.out.println("======================");
        System.out.println("Library Inventory");
        System.out.println("======================");
        for(int i = 0; i< books.length; i++){
            System.out.println(books[i]);
        }
    }
}
