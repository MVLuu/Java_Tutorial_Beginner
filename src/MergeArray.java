import java.util.HashMap;
import java.util.Map;

public class MergeArray {

    // Two arrays and merging the two arrays with the first array as key and second array as value.
    public static void myFunction(char[] a, char[] b){
        HashMap<Character, Character> zip = new HashMap<>();

        for (int i=0; i < a.length; i++){
            try{
                zip.put(a[i], b[i]);
            } catch (Exception e) {
                zip.put(a[i], 'x');
            }
        }
        StringBuilder output = new StringBuilder();
        output.append("{");
        for(Map.Entry<Character, Character> z : zip.entrySet()) {
            if (z.getKey() < '0' || z.getKey() > '9'){
                output.append("'");
                output.append(z.getKey());
                output.append("'");
            }
            else{
                output.append(z.getKey());
            }

            if (z.getValue() < '0' || z.getValue() > '9') {
                output.append("='");
                output.append(z.getValue());
                output.append("',");
            }
            else {
                output.append("=");
                output.append(z.getValue());
            }
        }
        String outputS = removeChars(output.toString(), 1);
        System.out.println(outputS + "}");
    }

    public static String removeChars(String str, int numberOfCharactersToRemove) {
        if(str != null && !str.trim().isEmpty()) {
            return str.substring(0, str.length() - numberOfCharactersToRemove);
        }
        return "";
    }
}
