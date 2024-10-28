package TryingOut;

public class Exercise5 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4,5};
        System.out.print(recursiveSum(arr1));
    }

    private static int recursiveSum(int[] arr1) {
        return recursiveSumHelper(arr1,arr1.length);
    }

    private static int recursiveSumHelper(int[] arr1, int length) {
        if(length==0){
            return 0;

        }
        return arr1[length-1] + recursiveSumHelper(arr1,length-1);
    }
}
