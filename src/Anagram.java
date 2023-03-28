import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String firstText, String secondText){
        if (firstText.length() != secondText.length()){
            return false;
        }
        char[] firstArray = firstText.toCharArray();
        Arrays.sort(firstArray);
        char[] secondArray = secondText.toCharArray();
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }
}
