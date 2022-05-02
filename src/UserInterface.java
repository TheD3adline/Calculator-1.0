public class UserInterface {        //the class and static method to print the UI to console
    public static void printUI(boolean loopNum1, boolean loopOperator, boolean loopNum2, boolean loopFinal, double number1, String operator, double number2, double result) {
        if(loopNum1 && loopOperator && loopNum2 && loopFinal == true) {
            System.out.println("************************************************************************");
            System.out.println("                                                                        ");
            System.out.println("        + Add                                 1.) " + Memory.readMem(0));
            System.out.println("        - Subtract                            2.) " + Memory.readMem(1));
            System.out.println("        * Multiply                            3.) " + Memory.readMem(2));
            System.out.println("        / Divide                              4.) " + Memory.readMem(3));
            System.out.println("        m Memory                              5.) " + Memory.readMem(4));
            System.out.println("                                              6.) " + Memory.readMem(5));
            System.out.println("                                              6.) " + Memory.readMem(6));
            System.out.println("        y Another Calculation                 8.) " + Memory.readMem(7));
            System.out.println("        x Exit Program                        9.) " + Memory.readMem(8));
            System.out.println("                                             10.) " + Memory.readMem(9));
            System.out.println("                                                                        ");
            System.out.println("                                                                        ");
            System.out.println("                                                                        ");
            System.out.println("************************************************************************");
        } else if((loopNum1 == false) && (loopOperator && loopNum2 && loopFinal == true)) {
            System.out.println("************************************************************************");
            System.out.println("                                                                        ");
            System.out.println("        + Add                                 1.) " + Memory.readMem(0));
            System.out.println("        - Subtract                            2.) " + Memory.readMem(1));
            System.out.println("        * Multiply                            3.) " + Memory.readMem(2));
            System.out.println("        / Divide                              4.) " + Memory.readMem(3));
            System.out.println("        m Memory                              5.) " + Memory.readMem(4));
            System.out.println("                                              6.) " + Memory.readMem(5));
            System.out.println("                                              6.) " + Memory.readMem(6));
            System.out.println("        y Another Calculation                 8.) " + Memory.readMem(7));
            System.out.println("        x Exit Program                        9.) " + Memory.readMem(8));
            System.out.println("                                             10.) " + Memory.readMem(9));
            System.out.println("                                                                        ");
            System.out.println("        " + number1);
            System.out.println("                                                                        ");
            System.out.println("************************************************************************");
        } else if((loopNum1 && loopOperator == false) && (loopNum2 && loopFinal == true)) {
            System.out.println("************************************************************************");
            System.out.println("                                                                        ");
            System.out.println("        + Add                                 1.) " + Memory.readMem(0));
            System.out.println("        - Subtract                            2.) " + Memory.readMem(1));
            System.out.println("        * Multiply                            3.) " + Memory.readMem(2));
            System.out.println("        / Divide                              4.) " + Memory.readMem(3));
            System.out.println("        m Memory                              5.) " + Memory.readMem(4));
            System.out.println("                                              6.) " + Memory.readMem(5));
            System.out.println("                                              6.) " + Memory.readMem(6));
            System.out.println("        y Another Calculation                 8.) " + Memory.readMem(7));
            System.out.println("        x Exit Program                        9.) " + Memory.readMem(8));
            System.out.println("                                             10.) " + Memory.readMem(9));
            System.out.println("                                                                        ");
            System.out.println("        " + number1 + " " + operator);
            System.out.println("                                                                        ");
            System.out.println("************************************************************************");
        } else if((loopNum1 && loopOperator && loopNum2 == false) && loopFinal == true) {
            System.out.println("************************************************************************");
            System.out.println("                                                                        ");
            System.out.println("        + Add                                 1.) " + Memory.readMem(0));
            System.out.println("        - Subtract                            2.) " + Memory.readMem(1));
            System.out.println("        * Multiply                            3.) " + Memory.readMem(2));
            System.out.println("        / Divide                              4.) " + Memory.readMem(3));
            System.out.println("        m Memory                              5.) " + Memory.readMem(4));
            System.out.println("                                              6.) " + Memory.readMem(5));
            System.out.println("                                              6.) " + Memory.readMem(6));
            System.out.println("        y Another Calculation                 8.) " + Memory.readMem(7));
            System.out.println("        x Exit Program                        9.) " + Memory.readMem(8));
            System.out.println("                                             10.) " + Memory.readMem(9));
            System.out.println("                                                                        ");
            System.out.println("        " + number1 + " " + operator + " " + number2 + " = " + result);
            System.out.println("                                                                        ");
            System.out.println("************************************************************************");
        }
    }
}
