//this: to invoke current class method
package This;

public class A {
    void m(){
        System.out.println("hello");
    }
    void n(){
        this.m();
    }

    public static void main(String[] args) {
        A a=new A();
    a.n();
    }
}

