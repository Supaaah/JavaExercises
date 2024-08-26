public class ReturnWordCount {

    public static void main(String[] args) {
        int count = countWords("Hello World Im Writing this today!");
        System.out.print(count);
    }

    private static int countWords(String s) {
        String[] words = s.trim().split(" ");
        return words.length;
    }
}
