public class DivideThroughZeroException extends Exception {

    public DivideThroughZeroException(String message) {     //the exception that is thrown by Calculator.calcDivide() method if it detects an attempt to divide by 0
        super(message);
    }
}
