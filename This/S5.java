package This;
//5) this: to pass as argument in the constructor call
public class S5 {
A4 obj;
S5(A4 obj){
    this.obj=obj;
}
void display(){
    System.out.println(obj.data);
}
}
class A4{
    int data=10;
    A4(){
        S5 b=new S5(this);
        b.display();
    }
    public static void main(String args[]){
        A4 a=new A4();
    }

}