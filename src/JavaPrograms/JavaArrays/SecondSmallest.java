package JavaPrograms.JavaArrays;
import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int [] array = {10,20,5,2,30};

        array = Arrays.stream(array)
                .sorted()
                .toArray();
        System.out.println("Second Smallest Element = " + array[1]);
    }
}
