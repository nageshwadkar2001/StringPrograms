import java.util.Arrays;
public class AnagramString {
    public static void AnagramChecker(String s1,String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagaram String");
            return;
        }
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1,array2)) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("not An Anagram");
        }
    }
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        AnagramChecker(s1,s2);
    }
}
