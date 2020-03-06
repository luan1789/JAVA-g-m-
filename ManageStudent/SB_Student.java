
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
public class SB_Student extends Student{
    float MathMark;
    String Skill;
    public SB_Student(){
    super();
    MathMark=0;
    Skill="";
    }    

    public  SB_Student(int RollNum,String Name,float MathMark,String Skill){
    super(RollNum,Name);
    this.MathMark=MathMark;
    this.Skill=Skill;
    }

    public float getMathMark() {
        return MathMark;
    }

    public void setMathMark(float MathMark) {
       if(MathMark >=0 && MathMark <=0) 
        this.MathMark = MathMark;
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String Skill) {
       if(Skill.equals("")||Skill.equals("excel")||Skill.equals("word")||Skill.equals("powerpoint"))
        this.Skill = Skill;
    }
    

    
    @Override
    public void inputStudent()
    {   
        super.inputStudent();
        Scanner sc=new Scanner(System.in);
        System.out.println("input MathMark");
        MathMark=sc.nextInt();
        System.out.println("input Skill");
        sc=new Scanner(System.in);
        Skill=sc.nextLine();
    }
    @Override
    public void outputStudent()
    {   
        super.outputStudent();
        System.out.print("Lab Mark:"+ MathMark+" - ");
        System.out.print("PE Mark:" +Skill+" - ");
        float avg;
            if(Skill.equals(""))
                avg=MathMark + MathMark* 1/10;
                    
            else
                avg=MathMark;
        System.out.println("Avg:"+avg);
            if (avg>=5){
                System.out.println("Status: Passed");
                System.out.println("");
            }else{
                System.out.println("Status: Fail");
                System.out.println("");
            }
    }
}
