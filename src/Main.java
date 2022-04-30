import java.util.Scanner;

public class Main {
    public static void main(String[] args) {            //First real practice project, a little calculator app, only the 4 basic math operations in a console environment,
                                                        //but with a custom memory array that saves the last 10 results and a function to inject them as the numbers for calculation.
        String input;                                   //I'm sure it's super messy and way too intricate, but it's my first real own app...
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        double result = 0;
        String operator = "+";

        while(loop == true) {
            UserInterface.printUI();
            System.out.println("Enter number 1 or m to access memory (or x to exit program): ");
            input = sc.next();  //input is always of String to allow for - number 1 > operator > number 2 - input order like in a real calculator
            switch(input) {
                case "m": break;    //the switch branching to access the memory array and inject one of its double data as number 1 to be calculated, to be implemented
                case "x": System.out.println("Exiting program..."); System.exit(0);     //x branching to exit program
                default: if(Main.isNumeric(input) == true) {        //checks if input is numeric and then assigns it to number 1 variable
                    number1 = Double.parseDouble(input);
                } else {
                    System.out.println("Error, invalid input, terminating program...");     //if input is neither numeric, nor m for memory or x for exit the program is terminated with a System.exit(0)
                    System.exit(0);                                                   //later to be replaced with a loop that sends the app back towards the start of number 1 input process
                }
            }
            UserInterface.printUI();
            System.out.println("Enter operator, + - * / (or x to exit program): ");
            input = sc.next();
            switch(input) {
                case "+": operator = "+"; break;
                case "-": operator = "-"; break;
                case "*": operator = "*"; break;
                case "/": operator = "/"; break;
                case "x": System.out.println("Exiting program..."); System.exit(0);
                default: System.out.println("Error, invalid input, terminating program..."); System.exit(0);
            }
            UserInterface.printUI();
            System.out.println("Enter number 2 or m to access memory (or x to exit program): ");
            input = sc.next();
            switch(input) {
                case "m": break;
                case "x": System.out.println("Exiting program..."); System.exit(0);
                default: if(Main.isNumeric(input) == true) {
                    number2 = Double.parseDouble(input);
                    if(operator.equals("+")) {
                        result = Calculator.calcAdd(number1, number2);
                    } else if(operator.equals("-")) {
                        result = Calculator.calcSubtract(number1, number2);
                    } else if(operator.equals("*")) {
                        result = Calculator.calcMultiply(number1, number2);
                    } else {
                        try {
                            result = Calculator.calcDivide(number1, number2);
                        } catch(DivideThroughZeroException e) {
                            System.out.println(e.getMessage());
                            result = 0.0;
                        }
                    }
                } else {
                    System.out.println("Error, invalid input, terminating program...");
                    System.exit(0);
                }
            }
            UserInterface.printUI();
            System.out.println("The result is: " + result);
            System.out.println("Do you want to do another calculation? Press y for yes or x to exit program: ");
            input = sc.next();
            switch(input) {
                case "y": System.out.println("Doing another calculation..."); break;
                case "x": System.out.println("Exiting program..."); loop = false; break;
                default: System.out.println("Error, invalid input, terminating program..."); System.exit(0);
            }
        }
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}