import java.util.Scanner;

class Student {
    String fullName;
    int rollNum;
    double semPercentage;
    String collegeNmae;
    int collegeCode;

    Student() {
        collegeNmae = "MVGR";
        collegeCode = 33;

    }

    Student(String fullName, double semPerentage) {
        this();
        this.fullName = fullName;
        this.semPercentage = semPerentage;

    }

    void display() {
        System.out.println("fullName = " + fullName);
        System.out.println("semPercentage = " + semPercentage);
        System.out.println("collegeName = " + collegeNmae);
        System.out.println("collegeCode = " + collegeCode);
    }
}

class ParamConst {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("enter the name : ");
        String name = x.nextLine();
        System.out.print("enter the sem percentage : ");
        double sem = x.nextDouble();
        Student obj = new Student(name, sem);
        obj.display();
        x.close();
    }
}
