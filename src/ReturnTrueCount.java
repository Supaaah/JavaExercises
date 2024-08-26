public class ReturnTrueCount {
    public static void main(String[] args) {
        boolean[] testArray = {true, true, false, true, false, true};
        System.out.println(countTrue(testArray));
    }

    private static int countTrue(boolean[] testArray) {
        int count = 0;
        for(boolean a: testArray){
            if(a){
                count++;
            }
        }
        return count;
    }
}
