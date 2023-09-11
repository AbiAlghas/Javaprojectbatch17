package Class16;

public class Book {
/*
Write Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */

    private String bookName;
    private int bookPrice;
    private int bookYear;
    private String bookAuthor;

    public Book(String bookName, int bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;

    }

    public Book(String bookName, int bookPrice, int bookYear, String bookAuthor) {
        this(bookName, bookPrice);
        this.bookYear = bookYear;
        this.bookAuthor = bookAuthor;


    }
    public void printInfo(){
        System.out.println(this.bookName+" "+bookPrice+" "+bookYear+" "+bookAuthor);
    }

    public static void main(String[] args) {
        Book b1=new Book("The lord of the ring",500);
        b1.printInfo();
        System.out.println("******************************");
        Book b2=new Book("The Hunger Games",400,1997,"Suzanne collins");
        b2.printInfo();
    }
}