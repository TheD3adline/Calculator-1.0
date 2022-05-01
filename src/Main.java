import java.util.Scanner;

public class Main {
    public static void main(String[] args) {            //First real practice project, a little calculator app, only the 4 basic math operations in a console environment,
                                                        //but with a custom memory array that saves the last 10 results and a function to inject them as the numbers for calculation.
        String input;                                   ////I'm sure it's super messy and way too intricate, but it's my first real own app...
        String operator;
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        double result = 0;

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
                    System.exit(0);                                                   //later to be replaced with a loop that sends the app back towards the start of the number 1 input process
                }
            }
            UserInterface.printUI();
            System.out.println("Enter operator, + - * / (or x to exit program): ");     //next step is the question for the operator
            operator = sc.next();
            switch(operator) {
                case "+", "-", "*", "/": break;
                case "x": System.out.println("Exiting program..."); System.exit(0);     //also the same exiting conditions as above during number 1 step
                default: System.out.println("Error, invalid input, terminating program..."); System.exit(0);
            }
            UserInterface.printUI();
            System.out.println("Enter number 2 or m to access memory (or x to exit program): ");    //next step is number 2 input, works in the same way as number 1 process with one exception...
            input = sc.next();
            switch(input) {
                case "m": break;
                case "x": System.out.println("Exiting program..."); System.exit(0);
                default: if(Main.isNumeric(input) == true) {        //it has a more intricate if branching within default of the switch case to perform the specified calculations and save the result in the result variable
                    number2 = Double.parseDouble(input);            //will also later be expanded to write the result into the memory array
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
                    System.out.println("Error, invalid input, terminating program...");     //also same exit/termination conditions as above
                    System.exit(0);
                }
            }
            UserInterface.printUI();
            System.out.println("The result is: " + result);         //shows the result and asks if the program is to be exited (or terminated, remember to loop that later) or if another calculation loop is to be performed
            System.out.println("Do you want to do another calculation? Press y for yes or x to exit program: ");
            input = sc.next();
            switch(input) {
                case "y": System.out.println("Doing another calculation..."); break;
                case "x": System.out.println("Exiting program..."); loop = false; break;
                default: System.out.println("Error, invalid input, terminating program..."); System.exit(0);
            }
        }
    }
    public static boolean isNumeric(String str) {   //method to check if input variable is numeric or not
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}