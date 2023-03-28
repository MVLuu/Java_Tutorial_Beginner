import java.util.HashMap;
import java.util.StringTokenizer;

public class FindInString {
    public static void countVowelsA(String text){
        char[] sampleArray = text.toLowerCase().toCharArray();

        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;

        for(char currentChar : sampleArray){
            switch (currentChar) {
                case 'a' -> aCount += 1;
                case 'e' -> eCount += 1;
                case 'i' -> iCount += 1;
                case 'o' -> oCount += 1;
                case 'u' -> uCount += 1;
            }
        }

        System.out.println("Vowel count " + "a: " + aCount + " e: " + eCount + " i: " + iCount + " o: " + oCount + " u: " + uCount);
    }

    public static void countVowelsB(String text){
        HashMap<Character, Integer> data = new HashMap<>();
        System.out.println("Sample text: " + text);
        data.put('a', 0);
        data.put('e', 0);
        data.put('i', 0);
        data.put('o', 0);
        data.put('u', 0);

        char[] textChar = text.toLowerCase().toCharArray();

        for(char currentChar : textChar){
            if (data.containsKey(currentChar)){
                int newValue = data.get(currentChar) + 1;
                data.put(currentChar, newValue);
            }
        }

        System.out.println(data);
    }

    public static void numberOfWordsA(String sentence){
        String[] stringArray = sentence.trim().split(" ");
        System.out.println("Number of words (A): " + stringArray.length);
    }

    public static void numberOfWordsB(String sentence){
        char[] charArray = sentence.trim().toCharArray();

        if (sentence.length() == 0){
            System.out.println("Sentence is empty.");
        }

        int numWords = 1;
        for (char currentChar : charArray){
            if (currentChar == ' '){
                numWords += 1;
            }
        }

        System.out.println("Number of words (B): " + numWords);
    }

    public static void numberOfWordsC(String sentence){
        StringTokenizer token = new StringTokenizer(sentence);
        int numWords = 0;
        while(token.hasMoreTokens()){
            token.nextToken();
            numWords += 1;
        }
        System.out.println("Number of words (C): " + numWords);
    }
}
