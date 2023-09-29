package This;
//4) this: to pass as an argument in the method
public class S4 {

        void m(S4 o){
            System.out.println("method is invoked");
        }
        void p(){
            m(this);
        }
        public static void main(String args[]){
            S4 s1 = new S4();
            s1.p();
        }
    }

