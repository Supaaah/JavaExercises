package JavaPrograms.JavaArrays;

public class OddArrays {
    public static void main(String[] args) {
        int[] array = {23, 45, 67, 34, 78};
        System.out.print("Odd Array Elements = ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
