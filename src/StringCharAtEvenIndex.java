public class StringCharAtEvenIndex {
    public static void main(String[] args) {
        String word="Hello";
        for (int i=0;i < word.length();i++){
            if (i % 2==0){
                System.out.println(word.charAt(i));
            }
        }
    }
}
