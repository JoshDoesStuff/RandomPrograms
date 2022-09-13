import java.util.*;

import javax.annotation.processing.FilerException;

import java.lang.String;
import java.text.BreakIterator;

public class Shiritori {
    static String word = "BruhMoment";
    static char firstLetter = 'Z';
    static char lastLetter = 'Z';
    static String previousWord = "oogabooga";
    static char previousLastLetter = 'z';
    static char previousFirstLetter = 'Z';
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(!word.equals(previousWord)){
            word = scanner.next();
            charFinder(word, previousWord);
            setPrevious(word, lastLetter, firstLetter);

        }
        System.out.println("Game Over");
        
    }
    public static void charFinder(String word, String previousWord){
        //System.out.println("Your word is " + word);

        int wordLength = word.length();

       //System.out.println("Word length is " + wordLength);

        char firstLetter = word.charAt(0);
        
        //System.out.println("First Letter: " + firstLetter);

        char lastLetter = word.charAt(wordLength - 1);

        //System.out.println("Last Letter: " + lastLetter);
        
        checkWord(word, previousWord, firstLetter, lastLetter);
        
        
    }

    public static void checkWord(String word, String previousWord, char previousFirstLetter,char previousLastLetter){
        if(previousWord.equals(word)) {
            System.out.println("No Duplicate Words");
            System.out.println("Game Over");
        }else{
            System.out.println("prev "+word);
            System.out.println("current " + previousWord);
        }
    }
    

    public static void setPrevious(String word, char lastLetter, char firstLetter){
        previousWord = word;
        previousLastLetter = lastLetter;
        previousFirstLetter = firstLetter;
    }
}

