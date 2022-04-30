public class Memory {

    private static double[] memory = new double[10];        //the memory array that is later to be implemented

    public static double getMemory(int index) {
        return memory[index];
    }

    public static void setMemory(double[] memory) {
        Memory.memory = memory;
    }
}
