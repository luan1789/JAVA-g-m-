package QLHS;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PersonList {
 private Person[] list=null;
 private int count =0;// so nguoi hien tai
    public PersonList(int size){
        if(size<10) size=10;
        list=new Person[size];
    }
    int find(String acode){
        for(int i=0;i<count;i++){
            if(acode.equals(list[i].getCode())) return i;
        } return -1;
    }
    public void add(){
        if(count==list.length)
            System.out.println("list is full");
        else{
            String newcode,newname;int newage;
            Scanner sc=new Scanner(System.in);
            int pos;
            do{
                System.out.println("Enter the person code:");
                newcode=sc.nextLine().toUpperCase();
                pos=find(newcode);
                if(pos>=0) System.out.println("\t this code existed");
            }
            while(pos>=0);
            System.out.println("Enter the person name");
            newname=sc.nextLine().toUpperCase();
            System.out.println("Enter the person age");
            newage=Integer.parseInt(sc.nextLine());
            list[count++]=new Person(newcode, newname, newage);
            System.out.println("new person have been added");
        }
    }
    public void removee(){
        if(count==0){
            System.out.println("empty list");
            return;
        }
        String removeCode ;
     Scanner sc = new Scanner(System.in);
        System.out.println("enter code to remove");
        removeCode=sc.nextLine().toUpperCase();
        int pos=find(removeCode);
        if(pos<0)
            System.out.println("person not exist"); 
        else{
            for(int i=pos;i<count-1;i++){
                list[i]=list[i+1];
                count--;
            }
            System.out.println("the person "+removeCode+" was removed");
    }
}
    public void update(){
        if(count==0){
            System.out.println("Empty list");
        return;
        }
    String code;
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the code to update");
        code=sc.nextLine().toUpperCase();
        int pos=find(code);
        if(pos<0) System.out.println("this person not exsit");
        else{
            String newname;int newage;
            System.out.println("enter new name");
            newname=sc.nextLine();
            System.out.println("enter new age");
            newage=Integer.parseInt(sc.nextLine());
            list[pos].setName(newname);
            list[pos].setAge(newage);
            System.out.println("The person "+code+ " was updated");
        }
   }  
    public void print(){
          if(count==0){
            System.out.println("Empty list");
            return;
         }      
          System.out.println("List of person");
          for (int i = 0; i <count; i++) {
              System.out.println(list[i].toString());
        }
    }
          void sort(){
         if(count==0){
            System.out.println("Empty list");
        }
              for (int i = 0; i < count-1; i++) {
                  for(int j=count-1;j>i;j--){
                      if(list[j].getAge()>list[i].getAge()){
                          Person p=list[j];
                          list[j]=list[i];
                          list[i]=p;
                      }
                  }
              }
    
    }
}
