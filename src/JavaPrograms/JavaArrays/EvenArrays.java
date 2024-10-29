package JavaPrograms.JavaArrays;

public class EvenArrays {
    public static void main(String[] args) {
        int[] array = {23, 45, 67, 34, 12};
        System.out.print("Even Array Elements = ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
