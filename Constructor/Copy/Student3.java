package Constructor.Copy;

public class Student3 {
    String name;
    int id;

    Student3(int i,String n){
        id=i;
        name=n;
    }
    Student3(){}
        void display(){
            System.out.println(id+" "+name);
        }

    public static void main(String[] args) {
        Student3 s1=new Student3(16,"Shukla");
        Student3 s2=new Student3(s1.id, s1.name);
        s1.display();
        s2.display();
    }
}
