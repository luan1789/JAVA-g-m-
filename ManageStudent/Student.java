
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khoa Pham
 */
public class Student {
    int RollNum;
    String Name;
    
    //default
    public Student(){
        RollNum=0;
        Name="";
    }
    
    public Student(int RollNum,String Name){
        this.Name=Name;
        this.RollNum=RollNum;
    }
        
        //alt + insert
    public int getRollNum() {
        return RollNum;
    }

    public void setRollNum(int RollNum) {
       if(RollNum>=0) 
        this.RollNum = RollNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
       if(!Name.equals("")) 
        this.Name = Name;
    }
    
    void inputStudent()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("input rollnum");
        RollNum=sc.nextInt();
        System.out.println("input name");
        sc=new Scanner(System.in);
        Name=sc.nextLine();
    }
    
    void outputStudent()
    {
        System.out.println("RollNum:"+RollNum);
        System.out.println("Name:"+Name);
    
    }
    
    
}
