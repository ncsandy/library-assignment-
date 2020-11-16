package home;

import library.Library;
import branch.Branch;
import book.Book;
import  customer.Customer;

public class Home {


    public static void main (String [] args){

    Customer c1 = new Customer("Nick","Sandy", Library.getB1());
    Customer c2 = new Customer("Denish", "O", Library.getB2());
    Customer c3 = new Customer ("Ty", "Jones",Library.getB3());




    }

}

