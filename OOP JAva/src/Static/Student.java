package Static;
//Java Program to demonstrate the use of static variable
public class Student {
    int rollno;
    String name;
    static  String college="BCREC"; //static variable

    //constructor
    Student(int r,String n) {
        this.rollno = r;
        this.name = n;
    }
        void display (){
            System.out.println("The student name is "+name+" roll no  "+rollno+" is from our colllege "+college);
        }


    public static void main(String[] args) {
        Student s1=new Student(12,"Priitka");
        Student s2=new Student(10,"Priti");
        s1.display();
        s2.display();
    }
}
