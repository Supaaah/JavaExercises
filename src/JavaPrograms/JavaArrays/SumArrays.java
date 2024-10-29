package JavaPrograms.JavaArrays;

public class SumArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int num: array){
            sum+=num;
        }
        System.out.println("Sum of values: "+sum);
    }
}
