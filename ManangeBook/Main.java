package ManangeBook;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        Menu    menu = new Menu(5);
        int     choise;

        menu.add("ADD BOOK");
        menu.add("FIND BOOK");
        menu.add("UPDATE BOOK");
        menu.add("PRINT");
        menu.add("EXIT");

        BookManagement manage = new BookManagement();

        do {
            System.out.println("\nMANAGEMENT BOOK");
            choise = menu.getChoise();

            switch (choise) {
            case 1 :
                ComputerBook b = new ComputerBook();

                b.input();
                manage.addBook(b);

                break;

            case 2 :
                System.out.println("ID BOOK TO FIND");

                int id = Integer.parseInt(sc.nextLine());

                if (manage.findBookByID(id) == null) {
                    System.out.println("BOOK NOT EXIST");
                } else {
                    manage.findBookByID(id).PrintBook();
                }

                break;

            case 3 :
                System.out.println("Enetr BookID to UPDATE: ");

                int          pos = Integer.parseInt(sc.nextLine());
                ComputerBook b1  = (ComputerBook) manage.findBookByID(pos);

 //               b1.input();
                manage.updateBook(b1);

                break;

            case 4 :
                manage.Print();

                break;
            }
        } while ((choise > 0) && (choise < 5));
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
