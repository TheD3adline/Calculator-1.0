public class Memory {

    private static double[] memory = new double[10];        //the memory array

    public static void writeMem(double result) {
        for(int i = (memory.length - 1); i > 0; i--) {
            double temp = memory[i - 1];
            memory[i] = temp;
        }
        memory[0] = result;
    }

    public static double readMem(int index) {
        return memory[index];
    }
}
