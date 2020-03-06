
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
public class SE_Student extends Student{
    float LabMark;
    float PEMark;
    
public SE_Student(){
    //RollNum=0;
    //Name="";
    //duoc ke thua tu cha
    super();//goi default ke thua cua class cha
    LabMark=0;
    PEMark=0;
            
}
    public SE_Student(int RollNum,String Name, float LabMark, float PEMark)
    {
        //this.RollNum=RollNum;
        //this.Name=Name;
        super(RollNum,Name);
        this.LabMark=LabMark;
        this.PEMark=PEMark;
    }

    public float getLabMark() {
        return LabMark;
    }

    public void setLabMark(float LabMark) {
       if(LabMark>=0 && LabMark<=10) 
        this.LabMark = LabMark;
    }

    public float getPEMark() {
        return PEMark;
    }

    public void setPEMark(float PEMark) {
       if(PEMark>=0 && PEMark<=10) 
        this.PEMark = PEMark;
    }
    
    @Override
    public void inputStudent(){
        super.inputStudent();
//        inputStudent();//nhap rollnum,name
        Scanner sc=new Scanner(System.in);
        System.out.println("input labmark");
        LabMark=sc.nextFloat();
        System.out.println("input pemark");
        PEMark=sc.nextFloat();
             
    }
    
    @Override
    public void outputStudent(){
        super.outputStudent();
        System.out.println("Lab Mark"+LabMark);
        System.out.println("PE Mark"+PEMark);
        float avg=LabMark+PEMark;
        System.out.println("Avg"+avg);
        if(avg>=5){
            System.out.println("Status:Passed");
            System.out.println("");
        }else{
            System.out.println("Status:Fail");
            System.out.println("");
        }
    }
    
//    String Status SE()
//    {
//        float check = avgMarkSE();
//        
//    }
}
