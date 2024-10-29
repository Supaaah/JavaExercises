package JavaPrograms.JavaArrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        System.out.println("Sum of Array Value: " + sum);
        System.out.println("Average of Array Value: " + average);
    }
}
