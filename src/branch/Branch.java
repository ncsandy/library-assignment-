package branch;


import library.Library;
import book.Book;
import customer.Customer;

public class Branch extends Library {

    Library lib = new Library();

//    Customer [] aList;
//    Customer [] nList;



    public void Attleboro(){
        Book[] shelf = new Book[2];
        shelf[0] = lib.getB1();
        shelf[1] = lib.getB2();
        System.out.println("Attleboro has :");
        for(int i =0; i < shelf.length; i++){
            System.out.println(shelf[i]);
        }
    }

    public void Norton(){
        Book[] shelf = new Book[1];
        shelf[0] = lib.getB3();
        System.out.println("Norton has: ");
        System.out.println(shelf[0]);
    }

    public static Book hatchet() {

        return getB1();
    }
    public static Book theGiver()
    {
        return getB2();
    }
    public static Book OfMice(){
        return getB3();
    }


}
