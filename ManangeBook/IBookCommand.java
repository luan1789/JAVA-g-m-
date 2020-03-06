package ManangeBook;

/**
 *
 * @author User
 */
public interface IBookCommand {
    void addBook(Book b);

    Book findBookByID(int id);

    void updateBook(Book b);
}


//~ Formatted by Jindent --- http://www.jindent.com
