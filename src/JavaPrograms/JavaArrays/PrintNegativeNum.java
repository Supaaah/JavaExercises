package JavaPrograms.JavaArrays;

public class PrintNegativeNum {
    public static void main(String[] args) {
        int[] array = {-45, 32, -7, 3, -6};
        System.out.print("Negative Array Elements = ");
        for (int num : array) {
            if (isNegative(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static boolean isNegative(int num){
        return num<0;
    }
}
