package Constructor.Parameterized;

public class Student2 {
    int id;
    String name;

    //creatimg a parameterized constructor
    Student2(int i,String n){
         id=i;
         name=n;

//        this.id=i;
//        this.name=n;

    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student2 s1=new Student2(11,"Jiya");
        Student2 s2=new Student2(12,"Priti");

        s1.display();
        s2.display();
    }
}
