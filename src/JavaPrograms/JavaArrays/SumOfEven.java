package JavaPrograms.JavaArrays;

public class SumOfEven {
    public static void main(String[] args) {
        int[] array = {23, 45, 89, 34, 12};
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum of Even Array Elements = " + sum);
    }
}
