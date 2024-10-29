public class UniqueCharacters{
    
    public static void main(String [] args){
        String sentence = "Hi My name is Reggie!";

        for(int i =0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            boolean isUnique = true;
            for(int j=0;j<i;j++){
                if(sentence.charAt(j) == ch){
                    isUnique = false;
                }
            }
            if(isUnique){
            System.out.print(ch+" ");
            }
        }
    }
}
