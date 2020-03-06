package ManangeBook;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputerBook extends Book {
    String Author;
    String PublisherName;

    public ComputerBook() {}

    public ComputerBook(String Author, String PublisherName, int BookID, String BookTutle, double Price, int Quantity) {
        super(BookID, BookTutle, Price, Quantity);
        this.Author        = Author;
        this.PublisherName = PublisherName;
    }

    @Override
    public void PrintBook() {
        System.out.println("BookID: " + BookID + " | " + "BookTitle: " + BookTutle + " | " + "Price: " + Price + " | "
                           + "+Quantity: " + Quantity + " | " + "Author: " + Author + " | " + "PublisherName: "
                           + PublisherName);
    }

    @Override
    public double SubTotal() {
        return (Price * Quantity) * 1.1;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter BookID: ");
        BookID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter BookTitle: ");
        BookTutle = sc.nextLine().toUpperCase();
        System.out.println("Enter Price: ");
        Price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Quantity: ");
        Quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Author: ");
        Author = sc.nextLine().toUpperCase();
        System.out.println("Enter PublisherName: ");
        PublisherName = sc.nextLine().toUpperCase();
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublisherName(String PublisherName) {
        this.PublisherName = PublisherName;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
