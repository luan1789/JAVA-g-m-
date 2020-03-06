
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
public class Tester {
    
    public static void main(String[] args) {
//        Student a = new Student(1,"John",5.0,5.0);
//        
//        SE_Student x=new SE_Student(1,"Lan",5,7);
//        SE_Student y=new SE_Student(1,"Diep",3,2);
//        SB_Student z=new SB_Student(2,"B",4,"Éc");
//        
//        x.outputSEStudent();
//        y.outputSEStudent();
//        z.outputSBStudent();
//        Student temp=x;
//        temp.outputStudent();
//        ((SE_Student)temp).outputSEStudent();
//        // ((SB_Student)temp).outputSBStudent(); sai
//        
//        temp=z;
//        ((SB_Student)temp).outputSBStudent();
//        
        //==================================================
        //nâng cao
        StudentList obj=new StudentList();
        Scanner sc=new Scanner(System.in);
        int choice;
        do
        {   System.out.println("");
            System.out.println("===============================================");
            System.out.println("1. Add SE Student                             |");
            System.out.println("2. Add SB Student                             |");
            System.out.println("3. Display All                                |");
            System.out.println("4. Display SE Students                        |");
            System.out.println("5. Display SB Students                        |");
            System.out.println("6. Count SE Student                           |");
            System.out.println("7. Count SB Student                           |");
            System.out.println("8. Get Lab max                                |");
            System.out.println("9. Count SB Student that have skill is excel  |");
            System.out.println("10.Update Student by RollNum                  |");
            System.out.println("11.Remove student by rollnum                  |");
            System.out.println("12.Sort by name                               |");
            System.out.println("===============================================");
            System.out.println("Your choice:");
            System.out.println("");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    Student x=new SE_Student();// bien thang cha co quyen gan bang thang con
                    x.inputStudent();//input cua con SE
                    if (obj.addStudent(x)){
                        System.out.println("");
                        System.out.println("ADD");
                    }else{
                        System.out.println("");
                        System.out.println("FAIL");
                    }        
                    
                    
                    break;
                case 2:
                    Student y=new SB_Student();
                    y.inputStudent();
                    if(obj.addStudent(y))
                        System.out.println("ADD");
                    else
                        System.out.println("FAIL");
                    break;
                
                case 3:
                    obj.displayAll();
                   break;
                   
                case 4:
                    obj.displaySEStudents();
                    break;
                   
                case 5:
                    obj.displaySBStudents();
                    break;
                    
                case 6:
                    System.out.println("SE Student: "+obj.countSEStudent());
                    break;
                    
                    
                case 7:
                    System.out.println("SB Student: "+obj.countSBStudent());
                    break;
                    
                case 8:
                    float max=obj.getLabMax();
                    System.out.println("Lab max:"+max);
                    break;
                    
                case 9:
                    System.out.println("SB Student[word]:"+obj.countSkill("excel"));
                    System.out.println("SB Student[excel]:"+obj.countSkill("word"));
                    System.out.println("SB Student[powerpoint]:"+obj.countSkill("powerpoint"));
                    break;
                    
                case 10:
                    Scanner s=new Scanner(System.in);
                    System.out.println("Input RollNum: ");
                    int updateRollnum=s.nextInt();
                    if(obj.updateStudent(updateRollnum)){
                        System.out.println("Update");
                    }else
                        System.out.println("Fail");
                    break;
                
                case 11:
                    Scanner c=new Scanner(System.in);
                    System.out.println("Input RollNum: ");
                    int deleteRollnum=c.nextInt();
                    if(obj.removeStudent(deleteRollnum)){
                        System.out.println("Removed");
                    }else
                        System.out.println("Fail");
                    break;
                    
                case 12:
                    obj.sortStudent();
                    System.out.println("Sort Sucess");
                    break;
            }
        }while(choice<=12);
    }
    
}
