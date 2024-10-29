package JavaPrograms.JavaArrays;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9, 10};

        int[] thirdArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);

        for (int i = 0; i < secondArray.length; i++) {
            thirdArray[firstArray.length + i] = secondArray[i];
        }

        System.out.println("Merged Array = " + Arrays.toString(thirdArray));
    }
}
