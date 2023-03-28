public class ReverseString {
    public static String reverseString(String text){
        char[] textChar = text.toCharArray();
        int textLength = textChar.length;

        StringBuilder returnString = new StringBuilder();

        for (int i = textLength - 1; i >= 0; i--){
            returnString.append(textChar[i]);
        }

        return returnString.toString();
    }

    public static String reverseStringB(String text){
        StringBuilder returnString = new StringBuilder(text);
        returnString.reverse();
        return returnString.toString();
    }

    public static String reverseStringSingleChar(String text){
        char[] charArray = text.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }
        return new String(charArray);
    }


}
