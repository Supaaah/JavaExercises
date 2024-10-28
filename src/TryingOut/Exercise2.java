package TryingOut;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] boxes = {11, 3, 4, 16, 12, 15, 8, 15, 13, 10, 6, 5, 20, 14, 19, 17, 9, 7, 1, 2};

        double average = computeAverage(boxes);
        int[] minMax = findMinMax(boxes);
        int[] sortedBoxes = sortArray(boxes);
        display(average,minMax,sortedBoxes);

    }

    public static double computeAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }
    public static int[] sortArray(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        return sorted;
    }
    public static void display(double average, int[] minMax, int[] sortedBoxes){
        System.out.println("Average value: " + average);
        System.out.println("Minimum value: " + minMax[0]);
        System.out.println("Maximum value: " + minMax[1]);
        System.out.println("Sorted array: " + Arrays.toString(sortedBoxes));
    }
}


