import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Student.school = "Krishna Public School";
        Student Student1 = new Student();
        System.out.println(Student1.name);
        System.out.println(Student1.roll_no);
        System.out.println(Student.school);
        int num = 10;
        num = num +10;
        int x =4;
        if(x = 5)
        {

        }else{
            
        }
        }
    }
    
    
class Student{
    String name; 
    Integer roll_no;
    static String  school;
    
    Student()
    {
        this ("Vignesh", 1163 );
    }
    
    Student(String name, Integer roll_no)
    {
        this.name = name;
        this.roll_no = roll_no;
    }
    
    
}    

