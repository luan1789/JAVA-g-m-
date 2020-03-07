package QLHS;


/**
 *
 * @author User
 */
public class ManangingProgram1 {
    public static void main(String[] args) {
        Menu menu=new Menu(5);
        menu.add("add new person");
        menu.add("remove a person");
        menu.add("update a person");
        menu.add("list");
        menu.add("quit");
        int choise;
        PersonList list=new PersonList(50);
        do{
            System.out.println("\n PERSON MANAGER");
            choise=menu.getChoise();
            switch(choise){
                case 1: list.add();break;
                case 2: list.removee();break;
                case 3: list.update();break;
                case 4: list.sort();list.print();break;
            }
            
        }while(choise>=1&&choise<5);
    }
    
}
