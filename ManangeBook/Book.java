package ManangeBook;

/**
 *
 * @author User
 */
public abstract class Book {
    protected int    BookID;
    protected String BookTutle;
    protected double Price;
    protected int    Quantity;

    public Book() {}

    public Book(int BookID, String BookTutle, double Price, int Quantity) {
        this.BookID    = BookID;
        this.BookTutle = BookTutle;
        this.Price     = Price;
        this.Quantity  = Quantity;
    }

    public abstract void PrintBook();

    public abstract double SubTotal();

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public String getBookTutle() {
        return BookTutle;
    }

    public void setBookTutle(String BookTutle) {
        this.BookTutle = BookTutle;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
