package Review7;
public class Book {
    String title;
    String author;
    int year;
    double price;

    static int totalBooks;
    static String type="Audiobook";   //right way accessing static variables by class name
    /*syntax of method
    returnType name
    void read()
    i can create my own methods:
    1.with parameters or without
    2.with return values or without
    */
    void read(){
        System.out.println("I am Reading " +title +" book by "+author);
    }
void changePrice(int newPrice){
    System.out.println("The price of the book "+title+" was changed from "+price +" to "+newPrice);
}
double totalWithTax(double tax){
double total=price+(price*tax);
return total;
}
}
