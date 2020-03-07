package QLHS;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Menu {
   String[] hints;
   int n=0; // hints hien tai
   public Menu(int size){
       if(size<10) size=10;
       hints = new String[size];
   }
   // add a hint
   public  void add(String aHint){
       if(n<hints.length){
           hints[n++]=aHint;
       }
   }
// get user choise
   public  int getChoise(){
       int result=0;
       if(n>0){
           for(int i=0;i<n;i++){
               System.out.println((i+1)+"-"+hints[i]);
           }
               System.out.println("Please select an operation:");
               Scanner sc= new Scanner(System.in);
               result=Integer.parseInt(sc.nextLine());
           
          
       } return result;
   }
    

}
