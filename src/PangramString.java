public class PangramString {
//String Which Contains all characters of English alphabets
        public static boolean  isPanagram(String word){

            if (word.length() < 26){
               // System.out.println(" Not Pangram");
                return false;
            }
           else {
               for (char ch='a';ch <='z';ch++){
                   if (word.indexOf(ch)<0) {
                       return false;
                   }
               }
               return true;
            }
    }
    public static void main(String[] args) {
            String word="abcdefghijklmnopqrstuvwxyz";
       if (isPanagram(word)==true){
            System.out.println("Is Panagram");
        }else{
            System.out.println("Not a panagram");
        }

    }
}
