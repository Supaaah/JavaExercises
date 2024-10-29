package JavaPrograms.JavaArrays;

import java.util.Arrays;

public class SortAsc {
    public static void main(String[] args) {
        int[] arrayNums = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};

        arrayNums = Arrays.stream(arrayNums)
                .sorted()
                .toArray();

        System.out.println("Ascending Order = " + Arrays.toString(arrayNums));
    }
}
