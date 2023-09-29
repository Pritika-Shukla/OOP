package This;
//6) this keyword can be used to return current class instance
public class ret {
    ret getret() {
        return this;
    }

    void msg() {
        System.out.println("hello");
    }
}
    class test{
        public static void main(String[] args) {
            new ret().getret().msg();
        }
    }

