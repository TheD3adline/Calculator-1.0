public class UserInterface {
    public static void printUI() {  //the class and static method to print the UI to console, later to be expanded to properly read and display all relevant data
        System.out.println("************************************************************************");
        System.out.println("*                                                                       ");
        System.out.println("*       + Add                                 1.) " + Memory.readMem(0));
        System.out.println("*       - Subtract                            2.) " + Memory.readMem(1));
        System.out.println("*       * Multiply                            3.) " + Memory.readMem(2));
        System.out.println("*       / Divide                              4.) " + Memory.readMem(3));
        System.out.println("*       m Memory                              5.) " + Memory.readMem(4));
        System.out.println("*                                             6.) " + Memory.readMem(5));
        System.out.println("*                                             6.) " + Memory.readMem(6));
        System.out.println("*       y Another Calculation                 8.) " + Memory.readMem(7));
        System.out.println("*       x Exit Program                        9.) " + Memory.readMem(8));
        System.out.println("*                                            10.) " + Memory.readMem(9));

        System.out.println("*                                                                       ");
        System.out.println("*       69 + 420 = 489                                                  ");


        System.out.println("*                                                                       ");
        System.out.println("************************************************************************");
    }
}
