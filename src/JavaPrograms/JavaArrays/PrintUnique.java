package JavaPrograms.JavaArrays;


import java.util.Arrays;

public class PrintUnique {
    public static void main(String[] args) {
        int[] array = {10, 20, 40, 10};

        array = Arrays.stream(array)
                .distinct()
                .toArray();
        System.out.println("Array Unique Elements = "+ Arrays.toString(array));
    }
}
