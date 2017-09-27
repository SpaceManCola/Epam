@SuppressWarnings("serial")
public class MyException extends Exception {

    public MyException(String message, int num) {
        super(message + " введенное число: " + num);
    }
}