package Static;
//Java Program to illustrate the use of static variable which
//is shared with all objects.
public class Counter {
    static int count=0;

    Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        Counter c4=new Counter();
        Counter c5=new Counter();
        Counter c6=new Counter();





    }










}
