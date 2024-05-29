import java.util.Scanner;

public class ReverseString {

    public static void result(String word) {
        String reverse = " ";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        System.out.println("After reversing the string we get : " + reverse);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Give me one String to reverse it :");
        String word=sc.nextLine();
        result(word);
    }
}
