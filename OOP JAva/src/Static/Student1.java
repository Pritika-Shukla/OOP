package Static;
//Java Program to demonstrate the use of a static method.
public class Student1 {
    int roll;
    String name;
    static String college="BCREC";

    static void change(){
        college="APC";
    }
    Student1(int r,String n){
        this.roll=r;
        this.name=n;
    }
    void display(){
        System.out.println("The student name is "+name+" roll no  "+roll+" is from "+college);
    }


    public static void main(String[] args) {
        Student1.change();
        Student1 s1=new Student1(12,"Bristi");
        Student1 s2=new Student1(10,"Priti");
        s1.display();
        s2.display();
    }

}
