package JavaPrograms.JavaArrays;

import java.util.Arrays;

public class SortDesc {
    public static void main(String[] args) {
        int[] arrayNums = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};

        arrayNums = Arrays.stream(arrayNums)
                .boxed() // convert int to Integer
                .sorted((left, right) -> right - left)
                .mapToInt(Integer::intValue) // convert Integer to int
                .toArray();

        System.out.println("Descending Order = " + Arrays.toString(arrayNums));
    }
}
