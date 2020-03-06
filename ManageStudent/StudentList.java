/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khoa Pham
 */
public class StudentList {
    Student[]list;
    int count;
    public StudentList(){
        list=new Student[20];
        count=0;
    }
    public boolean addStudent(Student X)
    {
        if(count>=20)
            return false;
        list[count]=X;
        count++;
        return true;
    }
    //case 3
    public void displayAll(){
        for(int i=0;i<count;i++)
            list[i].outputStudent();
    }
    // ham nay chi xua cac SV thuoc ve SE
    //case 4:
    public void displaySEStudents(){
        for(int i=0;i<count;i++)
            if(list[i]instanceof SE_Student)
                //instaceof kiem tra dia chi tai i thuoc ve lop SE
                list[i].outputStudent();
    }
    //case 5
    public void displaySBStudents(){
        for(int i=0;i<count;i++)
            if(list[i]instanceof SB_Student)
            list[i].outputStudent();
    }
    
    //case 6:Count SE
    public int countSEStudent(){
        int countSE=0;
        for(int i=0;i<count;i++){
            if(list[i]instanceof SE_Student){
                countSE++;
            }
        }
        return countSE;
    }
    //case 7:Count SB
    public int countSBStudent(){
        int countSB=0;
        for(int i=0;i<count;i++){
            if(list[i] instanceof SB_Student){
                countSB++;
            }
        }return countSB;
    }
    //case 8: SB khong co diem Lab
    public float getLabMax(){
        float max=0;
        for(int i=0;i<count;i++)
            if(list[i] instanceof SE_Student)
            {
                if(max <((SE_Student)list[i]).LabMark) //ep kieu
                        max=((SE_Student)list[i]).LabMark;
            }
        return max;
    }
    //case 9:ham nay de dem so SV SB co skill naodo
    // vi du user nhap skill roi goi ham nay
    public int countSkill(String skill){
        int countSkill=0;
        for(int i=0;i<count;i++){
            if(list[i] instanceof SB_Student){
                if(((SB_Student)list[i]).getSkill().equals(skill)){
                    countSkill++;
                }
            }
        }
        return countSkill;
    }
    
    //case10
    // viet ham tim vi tri Student trong list
    public int findStudent(int rollnum){
            //to do
            int pos=-1;
            for(int i=0;i<count;i++){
                if(list[i].getRollNum()==(rollnum)){
                    return i;
                    }
            }
            return pos;
    }
    
    //case 10
    public boolean updateStudent(int rollnum){
        int pos=findStudent(rollnum);
        if(pos<0)
            return false;
            
        {
            //neu la SE
            if(list[pos]instanceof SE_Student){
                SE_Student x=new SE_Student();
                x.inputStudent();
                list[pos]=x;
//                call setter:setName setLab,setPE
            }
            if(list[pos]instanceof SB_Student){
                SB_Student y=new SB_Student();
                y.inputStudent();
                list[pos]=y;
            }
            return true;
            //call setter:setName,set LAb,setPE
            //else neu la SB
        }
    }
    
    //case 11:remove
    public boolean removeStudent(int rollnum){
        int pos=findStudent(rollnum);
        if(pos<0){
            return false;
        }
        for(int i=0;i<count;i++){
            Student tmp=list[pos];
            list[pos]=list[pos+1];
            list[pos+1]=tmp;
        }
        count--;
        return true;
    }
    
    //case 12:
    public void sortStudent(){
        for(int i=0;i<count;i++){
            for(int j=0;j<count-1;j++){
                if(list[j].getName().compareTo(list[j+1].getName())>0){
                    Student tmp= list[j];
                    list[j]=list[j+1];
                    list[j+1]=tmp;
                }
            }
        }
    }
}
