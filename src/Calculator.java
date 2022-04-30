public class Calculator {

    private static double number1;
    private static double number2;
    private static double result;

    public static double calcAdd(double number1, double number2) {
        return number1 + number2;
    }

    public static double calcSubtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double calcMultiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double calcDivide(double number1, double number2) throws DivideThroughZeroException {
        if(number2 == 0) {
            throw new DivideThroughZeroException("Dividing through 0 is not possible!");
        }
        return number1 / number2;
    }

    public static double getNumber1() {
        return number1;
    }

    public static void setNumber1(double number1) {
        Calculator.number1 = number1;
    }

    public static double getNumber2() {
        return number2;
    }

    public static void setNumber2(double number2) {
        Calculator.number2 = number2;
    }

    public static double getResult() {
        return result;
    }

    public static void setResult(double result) {
        Calculator.result = result;
    }
}