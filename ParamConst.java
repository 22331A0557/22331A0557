import java.util.Scanner;
public class Student{
    String fullName;
    int rollNum;
    double semPercentage;
    String collegeNmae;
    int collegeCode;
    Student(){
        collegeNmae = "MVGR";
        collegeCode = 33;
        System.out.println("collegeName = " +collegeNmae);
        System.out.println("collegeCode = " +collegeCode);
    }
    Student(String fullName, double semPerentage){ 
        this.fullName = fullName;
        this.semPercentage = semPerentage;
        System.out.println("fullName = "+fullName);
        System.out.println("semPercentage = "+semPerentage);
    }
}
class test_para{
    public static void main(String[] args) {
        System.out.println("default constructor");
        Student constructor1 = new Student();
        System.out.println("parametrized constructor");
        Scanner x = new Scanner(System.in);
        System.out.print("enter the name : ");
        String name = x.nextLine();
        System.out.print("enter the sem percentage : ");
        double sem = x.nextDouble();
        Student constructor2 = new Student(name, sem);
        x.close();
    }
}
