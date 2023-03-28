/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {

        char[] x = new char[]{1+48,'u','y','z'};
        char[] y = new char[] {'a','t'};
        MergeArray.myFunction(x, y);
        String t = ReverseString.reverseString("abcdef");
        System.out.println(t);
        String reversedStr = ReverseString.reverseStringSingleChar("abcdefghij");
        System.out.println("Reversed string: "+ reversedStr);


        boolean result = Anagram.isAnagram("test", "tset");
        System.out.println(result);

        FindInString.countVowelsA("Tomorrow");

        FindInString.countVowelsB("TestABCdeif");

        FindInString.numberOfWordsA(" Hello World People ");
        FindInString.numberOfWordsB(" Hello World People ");
        FindInString.numberOfWordsC(" Hello World People ");
    }
}