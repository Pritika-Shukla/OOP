package Constructor.Default;
//Let us see another example of default constructor
//which displays the default values
public class Student {
    int id;
    String name;

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
s1.display();
s2.display();
    }
}
