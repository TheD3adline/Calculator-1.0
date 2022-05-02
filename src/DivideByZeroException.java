public class DivideByZeroException extends Exception {

    public DivideByZeroException(String message) {     //the exception that is thrown by Calculator.calcDivide() method if it detects an attempt to divide by 0
        super(message);
    }
}
