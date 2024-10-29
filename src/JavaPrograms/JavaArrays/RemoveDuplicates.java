package JavaPrograms.JavaArrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {10, 10, 20, 30};

        array = Arrays.stream(array)
                .distinct()
                .toArray();
        System.out.println("After Remove Duplicate Array Elements = "+ Arrays.toString(array));
    }
}
