import java.util.Scanner;

public class Main {
    public static void main(String[] args) {            //First real practice project, a little calculator app, only the 4 basic math operations in a console environment,
                                                        //but with a custom memory array that saves the last 10 results and a function to inject them as the numbers for calculation.
        String input;                                   ////I'm sure it's super messy and way too intricate, but it's my first real own app...
        String operator = "+";
        boolean loopMain = true;
        boolean loopNum1 = true;
        boolean loopOperator = true;
        boolean loopNum2 = true;
        boolean loopFinal = true;
        Scanner sc = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        double result = 0;

        while(loopMain == true) {
            UserInterface.printUI();
            while(loopNum1 == true) {
                System.out.println("Enter number 1 or m to access memory (or x to exit program): ");
                input = sc.next();  //input is always of String to allow for - number 1 > operator > number 2 - input order like in a real calculator and the possibility to access memory or exit the program at any relevant step
                switch(input) {
                    case "m": loopNum1 = false; number1 = 0.0; number2 = 0.0; break;    //the switch branching to access the memory array and inject one of its double data as number 1 to be calculated, to be implemented
                    case "x": System.out.println("Exiting program..."); System.exit(0);     //x branching to exit program
                    default: if(Main.isNumeric(input) == true) {        //checks if input is numeric and then assigns it to number 1 variable
                        loopNum1 = false;
                        number1 = Double.parseDouble(input);
                    } else {
                        System.out.println("Error, invalid input...");     //if input is neither numeric, nor m for memory or x for exit the program the while loop is maintained
                    }
                }
            }
            UserInterface.printUI();
            while(loopOperator == true) {
                System.out.println("Enter operator, + - * / (or x to exit program): ");     //next step is the question for the operator
                operator = sc.next();
                switch(operator) {
                    case "+", "-", "*", "/": loopOperator = false; break;                   //if an available function is selected the while loop is ended
                    case "x": System.out.println("Exiting program..."); System.exit(0);     //also the same exiting conditions as above during number 1 step
                    default: System.out.println("Error, invalid input...");                 //if the input is invalid the while loop is maintained
                }
            }
            UserInterface.printUI();
            while(loopNum2 == true) {
                System.out.println("Enter number 2 or m to access memory (or x to exit program): ");    //next step is number 2 input, works in the same way as number 1 process with one exception cont...
                input = sc.next();
                switch(input) {
                    case "m": loopNum2 = false; number1 = 0.0; number2 = 0.0; break;            //the switch branching to access the memory array and inject one of its double data as number 2 to be calculated, to be implemented
                    case "x": System.out.println("Exiting program..."); System.exit(0);
                    default: if(Main.isNumeric(input) == true) {        //cont... it has a more intricate if branching within default of the switch case to perform the specified calculations and save the result in the result variable and the memory array
                        number2 = Double.parseDouble(input);            //writes the input into number2 variable and then executes the previously selected arithmetic operation with the previously selected operator via this if-else-if-else branching...
                        if(operator.equals("+")) {
                            loopNum2 = false;                           //and then ends while loopNum2
                            result = Calculator.calcAdd(number1, number2);
                            Memory.writeMem(result);
                            UserInterface.printUI();
                            System.out.println("The result is: " + result);
                        } else if(operator.equals("-")) {
                            loopNum2 = false;
                            result = Calculator.calcSubtract(number1, number2);
                            Memory.writeMem(result);
                            UserInterface.printUI();
                            System.out.println("The result is: " + result);
                        } else if(operator.equals("*")) {
                            loopNum2 = false;
                            result = Calculator.calcMultiply(number1, number2);
                            Memory.writeMem(result);
                            UserInterface.printUI();
                            System.out.println("The result is: " + result);
                        } else {
                            try {
                                result = Calculator.calcDivide(number1, number2);
                                loopNum2 = false;
                                Memory.writeMem(result);
                                UserInterface.printUI();
                                System.out.println("The result is: " + result);
                            } catch(DivideByZeroException e) {
                                System.out.println(e.getMessage());
                                loopNum2 = false;
                                result = 0.0;
                            }
                        }
                    } else {
                        System.out.println("Error, invalid input...");  //or if an invalid input is made maintains the loop for this step to ask again for a valid input
                    }
                }
            }
            while(loopFinal == true) {
                System.out.println("Do you want to perform another calculation? Press y for yes or x to exit program: ");        //Asks if the program is to be exited or if another calculation loop is to be performed
                input = sc.next();
                switch(input) {
                    case "y": System.out.println("Doing another calculation..."); loopFinal = false; break;
                    case "x": System.out.println("Exiting program..."); System.exit(0);
                    default: System.out.println("Error, invalid input...");
                }
            }
            loopNum1 = true;                //last step is to reset all while loops for the next calculation process
            loopOperator = true;
            loopNum2 = true;
            loopFinal = true;
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