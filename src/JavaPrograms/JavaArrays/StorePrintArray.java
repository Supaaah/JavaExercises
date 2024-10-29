package JavaPrograms.JavaArrays;

public class StorePrintArray {
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0] = 5;
        array[1] = 11;
        array[2] = 22;
        array[3] = 33;
        array[4] = 44;
        System.out.println("\nDisplay Array Elements:");
        for(int num:array){
            System.out.println(num);
        }
    }
}
