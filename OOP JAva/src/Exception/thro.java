package Exception;

public class thro {
    public static void divideByZero() {

        // throw an exception
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        divideByZero();
    }
}

//Exception in thread "main" java.lang.ArithmeticException: Trying to dide by 0
//        at Exception.thro.divideByZero(thro.java:7)
//        at Exception.thro.main(thro.java:11)