package JavaPrograms.JavaArrays;

public class SearchElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;

        for(int i = 0;i<array.length;i++){
            if(array[i] == target){
               System.out.println("Element is Found in the Position = " + (i+1));
                System.out.println("Element is Found in the Index = " + (i));
            }
        }
    }
}
