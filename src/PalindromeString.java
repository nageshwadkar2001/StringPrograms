public class PalindromeString {
    public static void result() {
        String word = "HOH";
        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }
        System.out.println("Reversed String We get :" + rev);
        if (word.equals(rev)) {
            System.out.println("String is the Palindrome String");
        }
         else{
                System.out.println("String is Not a palindrome String");
            }
    }
    public static void main(String[] args) {
        result();
        }
    }

