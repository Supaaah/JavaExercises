package JavaPrograms.JavaArrays;

public class SumOfOdds {
    public static void main(String[] args) {
        int[] array = {12, 34, 59, 45, 22};
        int sum = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        System.out.println("Sum of Odd Array Elements = " + sum);
    }
}
