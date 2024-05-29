public class RemoveSpecialChar {
    public static void main(String[] args) {

        String word = "Hello & to the  world*$ ";
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
