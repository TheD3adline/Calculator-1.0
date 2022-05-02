public class Calculator {       //calculator class with the arithmetic methods
    public static double calcAdd(double number1, double number2) {  //the different calculation methods
        return number1 + number2;
    }

    public static double calcSubtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double calcMultiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double calcDivide(double number1, double number2) throws DivideByZeroException {     //calcDivide() method throws an exception plus message if it detects an attempt to divide by 0
        if(number2 == 0) {
            throw new DivideByZeroException("Dividing by 0 is not possible!");
        }
        return number1 / number2;
    }
}
