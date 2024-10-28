package Challenges;

import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Welcome to HANGMAN GAME \nGuess the word or die!");
        System.out.println("--------------------------\n\n");
        String word = getRandomWord();
        char [] guessWord = guessTheWord(word);
        int incorrectGuess = 0;
        boolean isGameWon = false;
        while(incorrectGuess<gallows.length - 1 && !isGameWon){
            printGallows(incorrectGuess);
            printGuessedWord(guessWord);
            char guess = getUserGuess(scan);
            if(word.contains(String.valueOf(guess))){
                updateGuessedWord(guessWord, word, guess);
            }else{
                incorrectGuess++;
            }
            isGameWon = isWordGuessed(guessWord);
        }
        if(isGameWon){
            System.out.println("Congratulations! You've guessed the word: "+ word);
        }else{
            System.out.println("Game Over! The word was: "+ word);
        }
    }

    public static String getRandomWord(){
        int randomIndex = (int) (Math.random()*words.length);
        return words[randomIndex];
    }

    public static char [] guessTheWord(String word){
        char [] guessedWord = new char[word.length()];
        for(int i = 0; i<word.length();i++){
            guessedWord[i] = '_';
        }
        return guessedWord;
    }
    public static char getUserGuess(Scanner scan){
        System.out.print("Enter a letter: ");
        return scan.next().charAt(0);
    }
    public static boolean isWordGuessed(char [] guessWord){
        for(char c: guessWord){
            if(c == '_'){
                return false;
            }
        }
        return true;
    }
    public static void updateGuessedWord(char [] guessWord, String word, char guess){
        for(int i =0;i<word.length();i++){
            if(word.charAt(i) == guess){
                guessWord[i] = guess;
            }
        }
    }
    public static void printGallows(int incorrectGuess){
        System.out.println(gallows[incorrectGuess]);
    }
    public static void printGuessedWord(char[] guessWord){
        for(char c: guessWord){
            System.out.print(c + " ");
        }
        System.out.println();
    }
}





