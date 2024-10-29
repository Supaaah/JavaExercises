package JavaPrograms.JavaArrays;

public class PrintPositiveNum {
    public static void main(String[] args) {
        int[] array = {67, -4, 3, -5, 44};
        System.out.print("Positive Array Elements = ");
        for (int num : array) {
            if (isPositive(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static boolean isPositive(int num){
        return num >0;
    }
}
