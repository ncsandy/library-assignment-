package customer;

import book.Book;
import branch.Branch;

public class Customer extends Branch {


    private String firstName = "";
    private String lastName = "";


    public Customer(String firstName, String lastName, Book inv){
        this.firstName = firstName;
        this.firstName = firstName;
        Book [] inventory = new Book[3];
        inventory[0] = inv;

    }

    @Override
    public String toString() {
        return "Frst Name= " + firstName + '\'' +
                "Last Name= " + lastName + '\'' ;
    }
}
