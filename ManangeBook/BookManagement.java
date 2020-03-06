package ManangeBook;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BookManagement implements IBookCommand {
    ComputerBook[] listBooks = new ComputerBook[20];
    int            numberBook;    // so book hien tai

    public void Print() {
        for (int i = 0; i < numberBook; i++) {
            listBooks[i].PrintBook();
        }
    }

    @Override
    public void addBook(Book b) {
        if (numberBook > 20) {
            System.out.println("LIST FULL");
        } else {
            listBooks[numberBook++] = (ComputerBook) b;
        }
    }

    @Override
    public Book findBookByID(int id) {
        ComputerBook kq = null;

        for (int i = 0; i < numberBook; i++) {
            if (listBooks[i].getBookID() == id) {
                kq = listBooks[i];
            }
        }

        return kq;
    }

    @Override
    public void updateBook(Book b) {
        Scanner sc=new Scanner(System.in);
        ComputerBook c = (ComputerBook) b;
        System.out.println("Enter new BookTitle: ");
        String BookTutle = sc.nextLine().toUpperCase();
        System.out.println("Enter new Price: ");
        double Price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter new Quantity: ");
        int Quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter new Author: ");
        String Author = sc.nextLine().toUpperCase();
        System.out.println("Enter new PublisherName: ");
        String PublisherName = sc.nextLine().toUpperCase();
        c.setAuthor(Author);
        c.setBookID(Quantity);
        c.setBookTutle(BookTutle);
        c.setPrice(Price);
        c.setPublisherName(PublisherName);
        c.setQuantity(Quantity);

        for (int i = 0; i < numberBook; i++) {
            if (c.equals(listBooks[i])) {
                listBooks[i] = c;
            }
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
