public class Memory {

    private static double[] memory = new double[10];        //the memory array that is later to be implemented
    private static int index = 0;

    public static void writeMem(double result) {
        if(index <= 9) {
            memory[index] = result;
            index++;
        } else {
            for(int i = 0; i < memory.length; i++) {
                double temp = memory[i];
                memory[i + 1] = temp;
            }
            memory[0] = result;
        }
    }

    public static double readMem(int index) {
        return memory[index];
    }


    public static double[] getMemory() {
        return memory;
    }

    public static void setMemory(double[] memory) {
        Memory.memory = memory;
    }
}
